package com.example.springwebexapplication.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springwebexapplication.model.Question;


@Repository
public interface QuestionRepository extends CrudRepository<Question, String> {
     
     

	 
	

}
