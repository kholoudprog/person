package oop2;

public class Professor extends Person {
	 private Student[]StudentsList;
	 private  int nStudents;                  //num of those stu
	// public static int  length =nStudents;
	 public static int  i =0;
	 public Professor() {
		 super(); 
	 }
	 public Professor(String name,int id) {
		 super(); 
	 }
	 public Professor(String name,int id,int nStudents,Student []StudentsList ) {
		    super(name,id);
			this.nStudents=nStudents;
			this.StudentsList=StudentsList;
	 }
	public  void registerStudent(Student obj) {               
		 
		 StudentsList[i]=obj;
		 i++;
	 }
	public void displayStudents() {
		for (int j =0 ; j<nStudents ; j++) {
		System.out.println("student num "+(j+1));
		System.out.println("name is "+StudentsList[j].getName());
		System.out.println("id is "+StudentsList[j].getId());
		System.out.println("npapers is "+StudentsList[j].Papers());
		
	 }
}
	 public int total() {
		 int sum =0;
		     for (int j =0 ; j<nStudents ; j++){
		        sum+=StudentsList[j].Papers();
		        }
		return sum ; 
	 }

}
