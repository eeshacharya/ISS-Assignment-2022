//encapsulation
public class Student {
	
	  private int rollno;
	  private String name;
	  private int marks;

	  		public String getName() {
			    return  name;
		  }

		  public void setName(String name)
		  {
			  this.name=name;
		  }
		  public int getRollno() {
			    return  rollno ;
		  }
		
		  public void setRollno(int rollno) {
			    this.rollno = rollno;
		  }
		  public int getMarks() {
			    return  marks ;
		  }
		
		  public void setmarks(int marks) {
			    this.marks = marks;
		  }


	public static void main(String[] args) {
	    Student stud = new Student();

	    stud.setRollno(6);
	    stud.setName("Eesha");
	    stud.setmarks(98);
	    System.out.println("Student Details :\n" + "Roll no : "+stud.getRollno() +"\nName : "+stud.getName()+"\nMarks : "+stud.getMarks());

	}

}