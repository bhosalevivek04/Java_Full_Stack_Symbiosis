package com.vivek.collection.list.linkedlist.entities;

public class Tasks {
	private String task;
	private int priority;
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Tasks(String task, int priority) {
		super();
		this.task = task;
		this.priority = priority;
	}
	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
