package com.example.project;

public class Task {

	private String title;
	private boolean iscompleted;
	
	//constrctor
	public Task(String title) {
		this.title =title;
		this.iscompleted =false;
	}
	//mark task as complete
	public void markcompleted() {
		iscompleted=true;
	}
	
	//get task details
	public String getTitle() {
		return title;
	}
	public boolean iscompleted() {
		return iscompleted;
		
	}
	
	//display task
	public String toString() {
		return title + " " + (iscompleted ? "completed":"pending");
				
	}
}
