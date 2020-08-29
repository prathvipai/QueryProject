package com.example.springwebexapplication.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springwebexapplication.model.Question;
import com.example.springwebexapplication.repository.QuestionRepository;
import com.example.springwebexapplication.service.QuestionService;
@Transactional
@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

	@Autowired
    private QuestionRepository questionRepository;

	@Override
	public Iterable<Question> findAll() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}
	

}


