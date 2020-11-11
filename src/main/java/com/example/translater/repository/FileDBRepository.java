package com.example.translater.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.translater.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
