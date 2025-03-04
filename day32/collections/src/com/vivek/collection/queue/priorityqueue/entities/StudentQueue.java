package com.vivek.collection.queue.priorityqueue.entities;

public class StudentQueue implements Comparable<StudentQueue> {
	private int rollNo;
	private String name;
	private int age;
	private float fees;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public StudentQueue(int rollNo, String name, int age, float fees) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.fees = fees;
	}

	public StudentQueue() {

	}

	@Override
	public int compareTo(StudentQueue sQueue) {
		return (int) (sQueue.fees - this.fees);
	}

	@Override
	public String toString() {
		return "StudentQueue [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", fees=" + fees + "]";
	}
}
