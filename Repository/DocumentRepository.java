package com.example.demo2.Repository;

/*import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo2.model.Document;
import com.example.demo2.model.reader;

import java.util.List;



@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
   
   Document findByPath(String Path);
    

}
*/
import com.example.demo2.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    Document findByfilePath(String filePath);  
}
