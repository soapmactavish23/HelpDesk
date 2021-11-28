package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.api.entity.User;
import com.example.demo.api.enums.ProfileEnum;
import com.example.demo.api.repository.UserRepository;

@SpringBootTest
class HelpDeskApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Test
	void contextLoads() {
		User user = new User();
		user.setEmail("admin@admin.com");
		user.setPassword(passwordEncoder.encode("123456"));
		user.setProfile(ProfileEnum.ROLE_ADMIN);
		userRepository.save(user);
	}

}
