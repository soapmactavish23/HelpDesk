package com.example.demo.api.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class Summary implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer amountNew;
	private Integer amountResolved;
	private Integer amountAproved;
	private Integer amountDisaproved;
	private Integer amountAssigned;
	private Integer amountClosed;
	
}
