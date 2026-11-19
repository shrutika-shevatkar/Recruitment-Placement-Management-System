package com.rpms.model;

public class Company {
    private int id;
    private String name;
    private String role;
    private String location;
    private double packageLpa;
    private double minCgpa;

    public Company(int id, String name, String role,
                   String location, double packageLpa, double minCgpa) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.location = location;
        this.packageLpa = packageLpa;
        this.minCgpa = minCgpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public String getLocation() { return location; }
    public double getPackageLpa() { return packageLpa; }
    public double getMinCgpa() { return minCgpa; }
}
