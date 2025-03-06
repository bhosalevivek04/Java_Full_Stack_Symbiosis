package com.vivek.collection.queue.blockingqueue.hospital;

public class OPDRecords implements Comparable<OPDRecords> {
	private int patientId;
	private String patientName;
	private String disease;
	private int severness;

	public OPDRecords() {
	}

	public OPDRecords(int patientId, String patientName, String disease, int severness) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
		this.severness = severness;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getSeverness() {
		return severness;
	}

	public void setSeverness(int severness) {
		this.severness = severness;
	}

	@Override
	public String toString() {
		return "OPDManagement [patientId=" + patientId + ", patientName=" + patientName + ", disease=" + disease
				+ ", severness=" + severness + "]";
	}

	@Override
	public int compareTo(OPDRecords obj) {
		return obj.severness - this.severness;
	}

}
