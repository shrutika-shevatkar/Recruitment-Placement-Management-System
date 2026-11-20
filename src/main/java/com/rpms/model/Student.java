package com.rpms.model;

public class Student {
    private int id;
    private String name;
    private String email;
    private String department;
    private double cgpa;
    private int activeBacklogs;

    public Student(int id, String name, String email,
                   String department, double cgpa, int activeBacklogs) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.cgpa = cgpa;
        this.activeBacklogs = activeBacklogs;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getActiveBacklogs() {
        return activeBacklogs;
    }
}
