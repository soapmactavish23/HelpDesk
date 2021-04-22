package com.example.demo.api.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.api.enums.ProfileEnum;

import lombok.Data;

@Document
@Data
public class User {

	@Id
	private String id;
	
	@Indexed(unique = true)
	@NotBlank()
	@Email()
	private String email;
	
	@NotBlank()
	@Size(min = 6)
	private String password;
	
	private ProfileEnum profile;
	
}
