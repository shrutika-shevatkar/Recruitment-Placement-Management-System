package com.rpms;
import com.rpms.service.RecruitmentService; import com.rpms.model.*; import com.rpms.util.Validator;
import com.rpms.exception.EligibilityException; import java.sql.SQLException; import java.util.Scanner;
public class RecruitmentApp {
 private static final Scanner in=new Scanner(System.in); private static final RecruitmentService service=new RecruitmentService();
 public static void main(String[] args){
  System.out.println("=== Recruitment & Placement Management System ===");
  boolean run=true; while(run){menu();String ch=in.nextLine().trim();
   try{switch(ch){
    case "1": addStudent();break; case "2": listStudents();break; case "3": addCompany();break; case "4": listCompanies();break;
    case "5": scheduleInterview();break; case "6": addOffer();break; case "7": markPlaced();break; case "0": run=false;break;
    default:System.out.println("Invalid choice.");}
   }catch(Exception e){System.out.println("Error: "+e.getMessage());}
  } System.out.println("Thank you!");
 }
 private static void menu(){System.out.println("\n1.Add Student  2.List Students  3.Add Company  4.List Companies");System.out.println("5.Schedule Interview  6.Record Offer  7.Mark Placement  0.Exit");System.out.print("Choice: ");}
 private static void addStudent()throws SQLException{System.out.print("Name: ");String n=Validator.required(in.nextLine(),"Name");System.out.print("Email: ");String e=Validator.required(in.nextLine(),"Email");System.out.print("Department: ");String d=Validator.required(in.nextLine(),"Department");System.out.print("CGPA (0-10): ");double g=Validator.cgpa(in.nextLine());System.out.print("Active backlogs: ");int b=Integer.parseInt(in.nextLine());if(b<0)throw new IllegalArgumentException("Backlogs cannot be negative.");service.addStudent(new Student(n,e,d,g,b));System.out.println("Student added.");}
 private static void listStudents()throws SQLException{for(Student s:service.students())System.out.println(s);}
 private static void addCompany()throws SQLException{System.out.print("Company name: ");String n=Validator.required(in.nextLine(),"Company");System.out.print("Role: ");String r=Validator.required(in.nextLine(),"Role");System.out.print("Location: ");String l=Validator.required(in.nextLine(),"Location");System.out.print("Package (LPA): ");double p=Double.parseDouble(in.nextLine());System.out.print("Minimum CGPA: ");double g=Validator.cgpa(in.nextLine());service.addCompany(new Company(n,r,l,p,g));System.out.println("Company added.");}
 private static void listCompanies()throws SQLException{for(Company c:service.companies())System.out.println(c);}
 private static void scheduleInterview()throws SQLException,EligibilityException{System.out.print("Student ID: ");int s=Integer.parseInt(in.nextLine());System.out.print("Company ID: ");int c=Integer.parseInt(in.nextLine());System.out.print("Date (YYYY-MM-DD): ");String d=in.nextLine();service.scheduleInterview(s,c,d);System.out.println("Interview scheduled.");}
 private static void addOffer()throws SQLException,EligibilityException{System.out.print("Student ID: ");int s=Integer.parseInt(in.nextLine());System.out.print("Company ID: ");int c=Integer.parseInt(in.nextLine());System.out.print("Package (LPA): ");double p=Double.parseDouble(in.nextLine());System.out.print("Offer date (YYYY-MM-DD): ");String d=in.nextLine();service.addOffer(s,c,p,d);System.out.println("Offer recorded.");}
 private static void markPlaced()throws SQLException,EligibilityException{System.out.print("Student ID: ");int s=Integer.parseInt(in.nextLine());System.out.print("Company ID: ");int c=Integer.parseInt(in.nextLine());System.out.print("Placement date (YYYY-MM-DD): ");String d=in.nextLine();service.markPlaced(s,c,d);System.out.println("Placement recorded.");}
}
