/*package com.example.demo2.service;

import java.util.List;
import com.example.demo2.model.Document;
import com.example.demo2.model.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo2.Repository.DocumentRepository;

@Service  // Correct usage of the annotation
public class DocumentService {

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    // Save a document
    public Document saveDocument(Document document) {
        return documentRepository.save(document);
    }

    // Get all documents
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }
    public Document updatePath(String path1, String path2) {
            Document existingDoc = DocumentRepository.findByPath(path2);
            if (existingDoc != null) {
                existingDoc.setPath(path2); 
                return DocumentRepository.save(existingDoc);
            } else {
                throw new RuntimeException("the document id is already in use");
            }
        }
        public Document updateIDocument(Long id, Long id2) {
            Document existingDoc = DocumentRepository.findByID(id2);
            if (existingDoc != null) {
                existingDoc.setId(id2);
                return DocumentRepository.save(existingDoc);
            } else {
                throw new RuntimeException("the document id is already in use");
            }
        }

        


    // Find document by ID (if needed)
    public Document getDocumentById(Long id) {
        return documentRepository.findById(id).orElse(null);  // Return null if not found
    }

    // Delete a document
    public void deleteDocument(Long id) {
        documentRepository.deleteById(id);
    }
}
 */
package com.example.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.Repository.DocumentRepository;
import com.example.demo2.model.Document;

@Service
public class DocumentService {
    

    private final DocumentRepository documentRepository;
    @Autowired
    
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }
    
    /*public Document saveDocument(Document document) {
        return documentRepository.save(document);
    }
*/

    // Save a document
   
    // Get all documents
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    // Update document path
    public Document updatePath(String path1, String path2) {
        Document existingDoc = documentRepository.findByfilePath(path1);
        if (existingDoc != null) {
            existingDoc.setPath(path2);
            return documentRepository.save(existingDoc);
        } else {
            throw new RuntimeException("Document with path " + path1 + " not found");
        }
    }

    // Update document ID
    public Document updateIDocument(Long id1, Long id2) {
        Document existingDoc = documentRepository.findById(id1).orElse(null);
        if (existingDoc != null) {
            existingDoc.setId(id2);
            return documentRepository.save(existingDoc);
        } else {
            throw new RuntimeException("Document with ID " + id1 + " not found");
        }
    }

    // Find document by ID
    /*public Document getDocumentById(Long id) {
        return documentRepository.findById(id).orElse(null); // Return null if not found
    }
*/
public Document createDocument(Document newDoc) {
        return documentRepository.save(newDoc);
    }
    // Delete a document
    public void deleteDocument(Long id) {
        documentRepository.deleteById(id);
    }
}
