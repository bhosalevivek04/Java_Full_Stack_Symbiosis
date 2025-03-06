package com.vivek.collection.queue.blockingqueue.restaurant.entities;

public class Orders {
	private int id;
	private String order;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int id, String order) {
		super();
		this.id = id;
		this.order = order;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", order=" + order + "]";
	}

}
