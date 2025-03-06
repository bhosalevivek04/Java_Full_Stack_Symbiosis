package com.vivek.collection.queue.blockingqueue.customerservice.entities;

public class ServiceCall {
	private int callerId;
	private String callerName;

	@Override
	public String toString() {
		return "ServiceCall [customerId=" + callerId + ", customerName=" + callerName + "]";
	}

	public int getCustomerId() {
		return callerId;
	}

	public void setCustomerId(int customerId) {
		this.callerId = customerId;
	}

	public String getCustomerName() {
		return callerName;
	}

	public void setCustomerName(String customerName) {
		this.callerName = customerName;
	}

	public ServiceCall(int customerId, String customerName) {
		super();
		this.callerId = customerId;
		this.callerName = customerName;
	}

	public ServiceCall() {
		super();
		// TODO Auto-generated constructor stub
	}
}
