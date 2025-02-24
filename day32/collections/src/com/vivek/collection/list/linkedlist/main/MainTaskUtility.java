package com.vivek.collection.list.linkedlist.main;

import com.vivek.collection.list.linkedlist.entities.Tasks;
import com.vivek.collection.list.linkedlist.utility.TaskUtility;

public class MainTaskUtility {
	public static void main(String[] args) {
		TaskUtility util = new TaskUtility();

		util.addTask(new Tasks("Java Session", 10));
		util.addTask(new Tasks("Pre Placement Talk",1));
		util.addTask(new Tasks("Pre Placement Talk",4));
		
		util.printTasks();
	}
}
