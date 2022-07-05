import java.util.*;
import java.io.*;
//Creating a class which implements Comparable Interface  

class Student implements Comparable<Student> 
{
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) 
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) 
	{
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

//Creating a test class to sort the elements  
public class UsingComparable 
{
	public static void main(String args[]) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Eesha", 23));
		al.add(new Student(106, "Aashish", 27));
		al.add(new Student(105, "Kia", 21));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}