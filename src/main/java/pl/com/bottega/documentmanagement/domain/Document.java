package pl.com.bottega.documentmanagement.domain;

import pl.com.bottega.documentmanagement.infrastructure.DocumentDto;

/**
 * Created by bernard.boguszewski on 12.06.2016.
 */
public class Document {

    public Document(DocumentNumber documentNumber, String title, String content) {

    }

    public void change(String newTitle, String newContent) {

    }

    public void verify(Employee employee) {

    }

    public DocumentDto export(){
        DocumentDto dto = new DocumentDto();
        return dto;
    }

    public void confirm(Employee confirmator) {

    }

    public void confirm(Employee conformator, Employee forEmployee) {

    }
}
