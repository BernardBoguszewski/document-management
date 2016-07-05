package pl.com.bottega.documentmanagement.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.bottega.documentmanagement.api.DocumentFlowProcess;
import pl.com.bottega.documentmanagement.api.UserManager;
import pl.com.bottega.documentmanagement.domain.DocumentNumber;
import pl.com.bottega.documentmanagement.domain.DocumentNumberGenerator;
import pl.com.bottega.documentmanagement.domain.repositories.DocumentRepository;
import pl.com.bottega.documentmanagement.infrastructure.DocumentDto;

/**
 * Created by bernard.boguszewski on 03.07.2016.
 */
@RestController
@RequestMapping("/documents")
public class DocumentsController {

    private DocumentFlowProcess documentFlowProcess;

    public DocumentsController(DocumentFlowProcess documentFlowProcess) {
        this.documentFlowProcess = documentFlowProcess;
    }

    @PutMapping
    public DocumentNumber create(@RequestBody DocumentRequest documentRequest){

        return documentFlowProcess.create(documentRequest.getTitle(), documentRequest.getContent());


    }
}