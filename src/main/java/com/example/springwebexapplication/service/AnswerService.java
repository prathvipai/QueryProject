package com.example.springwebexapplication.service;

import java.util.List;

import com.example.springwebexapplication.model.Answer1;
import com.example.springwebexapplication.model.Question;


public interface AnswerService {
	public Answer1 save(Answer1 answer1);
	public List<Answer1> getAllAnswerDetails(Answer1 answer1);
}
