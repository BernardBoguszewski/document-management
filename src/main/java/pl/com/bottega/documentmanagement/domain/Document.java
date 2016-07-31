package pl.com.bottega.documentmanagement.domain;

import pl.com.bottega.documentmanagement.api.DocumentDto;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by maciuch on 12.06.16.
 */
@Entity
public class Document {

    @Id
    @GeneratedValue
    private Long id;

    private DocumentNumber documentNumber;

    private String content;

    private String title;

    private boolean deleted;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt, verifiedAt, updatedAt;

    @Enumerated(EnumType.STRING)
    private DocumentStatus status;

    @ManyToOne
    private Employee creator;

    @ManyToOne
    private Employee verificator;

    @ManyToOne
    private Employee deletor;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Tag> tags;

    private Document() {
    }

    public Document(DocumentNumber documentNumber, String content, String title, Employee creator) {
        this.documentNumber = documentNumber;
        this.content = content;
        this.title = title;
        this.creator = creator;
        this.status = DocumentStatus.DRAFT;
        this.createdAt = new Date();
        this.deleted = false;
    }

    public void change(String title, String content) {
        this.title = title;
        this.content = content;
        this.status = DocumentStatus.DRAFT;
        this.updatedAt = new Date();
    }

    public void verify(Employee employee) {
        checkArgument(employee != null);
        this.verificator = employee;
        this.status = DocumentStatus.VERIFIED;
        this.verifiedAt = new Date();
    }

    public void confirm(Employee conirmator) {

    }

    public void confirm(Employee confirmator, Employee forEmployee) {

    }

    public void delete(Employee deletor) {
        this.deletor = deletor;
        this.deleted = true;
    }

    public void tag(Set<Tag> tags){
        this.tags = tags;
    }

    public Set<Tag> tags(){
        return tags;
    }

    public String content(){
        return content;
    }

    public String title(){
        return title;
    }

    public Employee creator(){
        return creator;
    }

    public boolean deleted(){
        return deleted;
    }

    public DocumentNumber number(){
        return documentNumber;
    }

    public DocumentStatus status(){
        return status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DocumentNumber getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(DocumentNumber documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date verifiedAt() {
        return verifiedAt;
    }

    public void setVerifiedAt(Date verifiedAt) {
        this.verifiedAt = verifiedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DocumentStatus getStatus() {
        return status;
    }

    public void setStatus(DocumentStatus status) {
        this.status = status;
    }

    public Employee getCreator() {
        return creator;
    }

    public void setCreator(Employee creator) {
        this.creator = creator;
    }

    public Employee verificator() {
        return verificator;
    }

    public void setVerificator(Employee verificator) {
        this.verificator = verificator;
    }

    public Employee getDeletor() {
        return deletor;
    }

    public void setDeletor(Employee deletor) {
        this.deletor = deletor;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
