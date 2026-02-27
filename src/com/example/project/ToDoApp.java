package com.example.project;

import java.util.ArrayList;

import java.util.Scanner;

public class ToDoApp {

	static ArrayList<Task> tasklist = new ArrayList<>();
	
	//add task 
	public static void addTask(String title) {
		Task task= new Task(title);
		tasklist.add(task);
		System.out.println("Task added successfuly");
	}
	//mark task as complete
	public static void completeTask(int index) {
		
		if (index >=0 && index < tasklist.size()) {
			tasklist.get(index).markcompleted();
			System.out.println("Task marked as completed");
		}else {
			System.out.println("invalid task number");
		}	
	}
	//display tasks
	public static void displayTask() {
		if (tasklist.isEmpty()) {
			System.out.println("no task available");
			
		}else {
			System.out.println("\n--TO-DO LIST--");
			for (int i = 0; i < tasklist.size(); i++) {
				System.out.println((i+1)+"."+ tasklist.get(i));
			}
		}
	}
	//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n *** To-Do-List ***");
			System.out.println("1.Add Task");
			System.out.println("2. Mark task as completed");
			System.out.println("3. Display task");
			System.out.println("4 .Exit");
			System.out.println("Enter your choice:");
			
			choice =sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Enter task title:");
				String title =sc.nextLine();
				addTask(title);
				break;
            case 2:
            	displayTask();
            	System.out.print("Enter task number to mark complete:");
            	int tasknumber =sc.nextInt();
            	completeTask(tasknumber -1);
            	break;
            case 3:
            	displayTask();
            	break;
            case 4:
            	System.out.println("Exiting application..");
            	break;
            	
			default:
				System.out.println("Invalid choice! try again");
			}
		} while (choice !=4);
	}
}
