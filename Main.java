package oop2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		  String nameprof;
		  int idprof;
		  String name=null;
	      int id;
	      int npaper;
	      int i=0;
	        System.out.println("enter name prof : ");
		      nameprof=input.next();
		    System.out.println("enter id prof : ");
		      idprof=input.nextInt();   
		    Professor p=new Professor(nameprof,idprof);
		    System.out.println("enter num of students ");
		     int n=input.nextInt();
		  Student []students=new Student[n]; 
		  Professor s=new  Professor(); 
		  while(name!="xxx") {
			for(int j=0; j<students.length;j++) {	
			      System.out.println("enter name of student "+(j+1) +": ");
			      name=input.next();
			      System.out.println("enter id of student "+(j+1) +": ");     
			      id=input.nextInt();
			      System.out.println("enter num of paper "+(j+1) +": ");     
			      npaper=input.nextInt();
			     students[j]=new Student(name,id,npaper);
			     s.registerStudent(students[j]);
			}
           
    		 i++;   
            }
		  Professor s1=new  Professor(); 
            	s1.displayStudents();
            	System.out.println(s1.total());
            }
	     
	}

