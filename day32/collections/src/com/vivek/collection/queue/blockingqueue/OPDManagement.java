package com.vivek.collection.queue.blockingqueue;

import java.util.concurrent.PriorityBlockingQueue;

import com.vivek.collection.queue.blockingqueue.hospital.OPDRecords;

public class OPDManagement {

	public static void main(String[] args) {
		OPDRecords[] opdRecords = { new OPDRecords(1, "Vivek", "Cough", 3), new OPDRecords(2, "Vishal", "Cold", 3),
				new OPDRecords(3, "Rushi", "Covid", 7), new OPDRecords(4, "Krushna", "Cancer", 6),
				new OPDRecords(5, "Tejas", "Fracture", 8), new OPDRecords(6, "Pratik", "Dengue", 5)

		};

		PriorityBlockingQueue<OPDRecords> patientProcessing = new PriorityBlockingQueue<>();

		Thread patient = new Thread(() -> {
			try {
				for (OPDRecords records : opdRecords) {
					patientProcessing.put(records);
					System.out.println("Patient Admitted: " + records);

					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		});
		
		Thread doctor = new Thread(() -> {
			try {
				for (OPDRecords records : opdRecords) {
					
					System.out.println("Patient Discharged: "+patientProcessing.take());

					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		});

		patient.start();
		doctor.start();
	}

}
