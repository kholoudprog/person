package oop2;

public class Student extends Person {
private  int nPapers;

public Student(String name,int id,int nPapers) {
	super(name,id);
	this.nPapers=nPapers;
	
}

public  int Papers() {
	return nPapers;
}



  
  
  
  
}
