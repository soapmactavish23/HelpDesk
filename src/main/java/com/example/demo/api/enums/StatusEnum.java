package com.example.demo.api.enums;

public enum StatusEnum {

	New,
	Assigned,
	Resolved,
	Approved,
	Disapproved,
	Closed;
	
	public static StatusEnum getStatus(String status) {
		switch(status) {
			case "New" : return New;
			case "Resolved": return Resolved;
			case "Assigned": return Assigned;
			case "Approved": return Approved;
			case "Disapproved": return Disapproved;
			case "Closed": return Closed;
			default: return New;
		}
	}
	
}
