package com.santhosh.action;

public class HelloWorldAction {
	private String name;
	
	public String execute() {
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
