 package oop2;

public class Person {
	private String name;
	private int id;
	public Person() {
		
	}
	public Person(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	public void displayPerson() {
		System.out.println(" person name is : "+this.name);
		System.out.println(" person id is : "+this.id);
	}
}
