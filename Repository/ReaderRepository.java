package com.example.demo2.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo2.model.reader;

@Repository
public interface ReaderRepository extends JpaRepository<reader, Long> {
    boolean existsByUsername(String username);

    reader findByUsername(String currentUsername);

}
