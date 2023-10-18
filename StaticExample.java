package source;
class Student6
{
	int rollno;
	String sname,dept;
	static String collegename="ABC";
	Student6(int r,String n,String d)
	{
		rollno=r;
		sname=n;
		dept=d;
	}
	void print_details()
	{
		X(); // accessing the static method within the same class
		System.out.println(rollno+" "+sname+" "+collegename+" "+dept);
	}
	static void X()
	{
		System.out.println("Welcome...");
	}
	static
	{
		System.out.println("Welcome to the program...");
	}
}

public class StaticExample {

	public static void main(String[] args) {
		
		Student6 s1=new Student6(100,"AAA","F");
		Student6 s2=new Student6(200,"TTT","G");
		Student6 s3=new Student6(300,"KKK","F");
		s1.print_details();
		s2.print_details();
		s3.print_details();
		Student6.X();  //accessing static method outside the student class

	}

}
