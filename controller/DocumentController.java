

package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.Document;
import com.example.demo2.service.DocumentService;

@RestController
@RequestMapping(path = "api/v1/liseuse/docs")
public class DocumentController {

    @Autowired
    //private DocumentRepository documentRepository;
    public DocumentService service;

    public DocumentController(DocumentService service) {
        this.service = service;
    }

    // Get all documents
   // @GetMapping("/getdoc")
    
    /*public List<Document> getAllReaders() {
        System.out.println("found "+ service.getAllDocuments());
        return service.getAllDocuments();
    }
        */
        @GetMapping(value = "hello", produces = "application/json", consumes = "application/json")
    public String hello(@RequestParam String message) {
        System.out.println(message);
        return "<response><message>" + message + "</message></response>";
    }
    @PostMapping("/createDoc")
    public Document createDoc(@RequestBody Document newDoc) {
        return service.createDocument(newDoc);
    }
    // Get a document by ID
   /*  @GetMapping("/documents/{id}")
    public Document getDocumentById(@PathVariable Long id) {
        return documentRepository.findById(id).orElseThrow(() -> new RuntimeException("Document not found"));
    }
*/
    // Create a new document
    

    // Update an existing document
    /*@PutMapping("/updatedoc/{id}")
    public Document updateDocument(@PathVariable Long id, @RequestParam Long newId) {
        
        return service.updateIDocument(id, newId);
    }
        */
    @PutMapping("/updateFile")
    public Document updatePath(@RequestParam String oldFilePath, @RequestParam String newPath) {
        return service.updatePath(oldFilePath,  newPath);
    }
    
    
    

    // Delete a document
    @DeleteMapping("/deletedoc/{id}")
    public void deleteDocument(@PathVariable Long id) {
        service.deleteDocument(id);
    }

}
