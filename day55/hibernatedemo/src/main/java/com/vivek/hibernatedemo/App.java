package com.vivek.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // ============================================================================
        // ✅ CREATE Operation - Insert a new student record
        /*
        Student student = new Student();
        student.setName("Vivek");
        student.setAge(22);
        session.save(student); // Save student to DB
        System.out.println("Student inserted: " + student);
        */

        // ============================================================================
        // ✅ READ Operation - Get student details by ID
        /*
        Student student = session.get(Student.class, 1);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student with ID 1 not found.");
        }
        */

        // ============================================================================
        // ✅ UPDATE Operation - Update existing student
        /*
        Student student = session.get(Student.class, 1);
        if (student != null) {
            student.setName("Updated Name");
            student.setAge(23);
            session.update(student); // Update record
            System.out.println("Student updated: " + student);
        } else {
            System.out.println("Student not found for update.");
        }
        */

        // ============================================================================
        // ✅ DELETE Operation - Remove student record
        /*
        Student student = session.get(Student.class, 1);
        if (student != null) {
            session.delete(student); // Delete student
            System.out.println("Student deleted: " + student);
        } else {
            System.out.println("Student not found for deletion.");
        }
        */

        // ============================================================================
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
