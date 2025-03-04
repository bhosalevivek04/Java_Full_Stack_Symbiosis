package com.vivek.collection.queue.priorityqueue.main;

import java.util.PriorityQueue;

import com.vivek.collection.queue.priorityqueue.entities.StudentQueue;

public class MainStudentQueue {
	public static void main(String[] args) {
		PriorityQueue<StudentQueue> sQueue = new PriorityQueue<>();
		sQueue.add(new StudentQueue(1, "ABC", 20, 1000));
		sQueue.add(new StudentQueue(2, "BBC", 20, 4000));
		sQueue.add(new StudentQueue(3, "CBC", 20, 2000));
		sQueue.add(new StudentQueue(4, "DBC", 20, 10000));

		System.out.println(sQueue.poll());
		System.out.println(sQueue.poll());
		System.out.println(sQueue.poll());
		System.out.println(sQueue.poll());
		
		
		System.out.println();
		
		PriorityQueue<StudentQueue> aQueue = new PriorityQueue<>(
				(o1,o2)->(o1.getRollNo()-o2.getRollNo())
				);
		aQueue.add(new StudentQueue(1, "ABC", 20, 1000));
		aQueue.add(new StudentQueue(2, "BBC", 40, 2000));
		aQueue.add(new StudentQueue(3, "CBC", 10, 3000));
		aQueue.add(new StudentQueue(4, "DBC", 50, 4000));
		
		System.out.println(aQueue.poll());
		System.out.println(aQueue.poll());
		System.out.println(aQueue.poll());
		System.out.println(aQueue.poll());
	}
}
