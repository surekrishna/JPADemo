package com.spring.boot.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.boot.jpa.entity.User;
import com.spring.boot.jpa.service.UserDAO;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired	
	private UserDAO userDAO; 

	@Override
	public void run(String... args) throws Exception {
		User user = new User("John","Admin");
		long result = userDAO.saveUser(user);
		logger.info("User saved :: "+user);
		logger.info("Result :: "+result);
		
	}

}
