package com.example.springwebexapplication.service;

import java.util.List;

import com.example.springwebexapplication.model.User;

public interface LoginService {

	public boolean validateUser(String username, String password);

	public User save(User user);

	public List<User> getAllUserDetails();

	public int deleteUserDetailsById(Long id);
}
