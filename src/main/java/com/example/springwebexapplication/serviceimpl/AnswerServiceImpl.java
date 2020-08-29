package com.example.springwebexapplication.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springwebexapplication.model.Answer1;
import com.example.springwebexapplication.repository.AnswerRepository;
import com.example.springwebexapplication.service.AnswerService;
@Transactional
@Service("answerService")
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerRepository answerRepository;

	@Override
	public Answer1 save(Answer1 answer1) {
		// TODO Auto-generated method stub
		return answerRepository.save(answer1);
	}

	@Override
	public List<Answer1> getAllAnswerDetails(Answer1 answer1) {
		// TODO Auto-generated method stub
		return (List<Answer1>) answer1;
	}


}
