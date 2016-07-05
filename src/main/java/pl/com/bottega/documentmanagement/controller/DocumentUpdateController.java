package pl.com.bottega.documentmanagement.controller;

import org.springframework.web.bind.annotation.*;
import pl.com.bottega.documentmanagement.api.DocumentFlowProcess;
import pl.com.bottega.documentmanagement.domain.DocumentNumber;

/**
 * Created by bernard.boguszewski on 05.07.2016.
 */
@RestController
@RequestMapping("/documents/:nr")
public class DocumentUpdateController {

    DocumentFlowProcess documentFlowProcess;

    public DocumentUpdateController(DocumentFlowProcess documentFlowProcess) {
        this.documentFlowProcess = documentFlowProcess;
    }

    @PutMapping
    public void change(@PathVariable DocumentNumber documentNumber, @RequestBody DocumentRequest documentRequest){
        documentFlowProcess.change(documentNumber, documentRequest.getTitle(), documentRequest.getContent());
    }
}
