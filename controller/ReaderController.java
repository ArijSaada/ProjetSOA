package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import com.example.demo2.Repository.ReaderRepository;
import com.example.demo2.model.reader;
import com.example.demo2.service.ReaderService;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/liseuse/reader")
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    // Get all readers
    @GetMapping("/getAllReaders")
    public List<reader> getAllReaders() {
        System.out.println("found "+ readerService.getAllReaders());
        return readerService.getAllReaders();
    }

    // Get a reader by ID
  
  
   /*  @Autowired
    private ReaderRepository readerRepository;  // Correctly injected repository

    @GetMapping("/testGetAllReaders")
    public List<reader> testGetAllReaders() {
        System.out.println("found "+ readerRepository.findAll());
        return readerRepository.findAll();
    } */

   

    // Create a new reader
    @PostMapping("/createReader")
    public reader createReader(@RequestBody reader newReader) {
        return readerService.createReader(newReader);
    }

    // Update username of a reader
    @PutMapping("/updateUsername")
    public reader updateReaderUsername(@RequestParam String username,  @RequestParam String user2) {
        return readerService.updateReaderUsername(username, user2);
    }

    // Update password of a reader
    @PutMapping("/updatePassword/{username}")
    public reader updateReaderPwd(@PathVariable String username, @RequestParam String pwd) {
        return readerService.updateReaderPwd(username, pwd);
    }

    // Update name of a reader
    @PutMapping("/updateName/{username}")
    public reader updateReaderName(@PathVariable String username, @RequestParam String name) {
        return readerService.updateReaderName(username, name);
    }

    // Update age of a reader
    @PutMapping("/updateAge/{username}")
    public reader updateReaderAge(@PathVariable String username, @RequestParam int age) {
        return readerService.updateReaderAge(username,  age);
    }

    // Delete a reader by ID
    @DeleteMapping("/deleteReader/{id}")
    public void deleteReader(@PathVariable int id) {
        readerService.deleteReader(id);
    }
}
