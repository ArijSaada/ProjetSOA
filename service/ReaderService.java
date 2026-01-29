package com.example.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.Repository.ReaderRepository;
import com.example.demo2.model.reader;

@Service
public class ReaderService {

    @Autowired
    private ReaderRepository readerRepository;

    // Get all readers
   /*  public List<reader> getAllReaders() {
        List<reader> readers = readerRepository.findAll();
        System.out.println("Fetched readers: " + readers);  // Log the result
        return readers;
    }*/
    public List<reader> getAllReaders() {
        System.out.println("Fetched readers: " + readerRepository.findAll());  
        return readerRepository.findAll();
    }

   

   
    public reader createReader(reader newReader) {
        return readerRepository.save(newReader);
    }
    public void deleteReader(long  id) {
        if (readerRepository.existsById(id)) {
            readerRepository.deleteById(id);
        } else {
            throw new RuntimeException("Reader not found");
        }
    }

    // Update an existing reader
    /*public reader updateReaderUsername(String username, reader updatedReader, String user2) {
        if (readerRepository.existsByUsername(username)) {
            updatedReader.setuser(user2); // Ensure the ID is set for updating
            return readerRepository.save(updatedReader);
        } else {
            throw new RuntimeException("Reader not found");
        }
    
    
    }
        */
        public reader updateReaderUsername(String name, String newUsername) {
            reader existingReader = readerRepository.findByUsername(name);
            if (existingReader != null) {
                existingReader.setuser(newUsername); // Update the username
                return readerRepository.save(existingReader);
            } else {
                throw new RuntimeException("Reader not found");
            }
        }
    public reader updateReaderPwd(String username, String pwd) {
        reader updatedReader= readerRepository.findByUsername(username);
        if (updatedReader != null) {
            updatedReader.setpwd(pwd); // Ensure the ID is set for updating
            return readerRepository.save(updatedReader);
        } else {
            throw new RuntimeException("Reader not found");
        }
    
    
    }
    public reader updateReaderName(String username, String name) {
        reader updatedReader= readerRepository.findByUsername(username);
        if (updatedReader != null) {
            updatedReader.setName(name); // Ensure the ID is set for updating
            return readerRepository.save(updatedReader);
        } else {
            throw new RuntimeException("Reader not found");
        }
    }
    
        public reader updateReaderAge(String username, int age) {
            reader updatedReader= readerRepository.findByUsername(username);
            if (updatedReader != null) {
                updatedReader.setAge(age); // Ensure the ID is set for updating
                return readerRepository.save(updatedReader);
            } else {
                throw new RuntimeException("Reader not found");
            }
        
        
        }




        public reader getReaderById(Long id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getReaderById'");
        }




        public reader getReaderByAge(int age) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getReaderByAge'");
        }
    

    // Delete a reader by ID
 
}
