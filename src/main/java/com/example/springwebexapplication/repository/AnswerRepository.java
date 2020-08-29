package com.example.springwebexapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springwebexapplication.model.Answer1;
@Repository
public interface AnswerRepository extends JpaRepository<Answer1, Long> {

}
