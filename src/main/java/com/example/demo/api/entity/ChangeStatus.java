package com.example.demo.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.api.enums.StatusEnum;

import lombok.Data;

@Document
@Data
public class ChangeStatus {

	@Id
	private String id; 
	
	@DBRef
	private Ticket ticket;
	
	@DBRef
	private User userChange;
	
	private Date dataChangeStatus;
	
	private StatusEnum status;
	
}
