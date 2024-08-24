package PROGRAMS;
import java.util.Scanner;

public class studentdetails {
	

	public static void main(String[] args) {
		Scanner student = new Scanner(System.in);
		Scanner student1 = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String S = student.nextLine();
		System.out.println("Enter your RollNumber:");
		int S1 = student1.nextInt();
		System.out.println("Enter your Department:");
		String S2 = student.nextLine();
		System.out.println("Enter your section:");
		String S3 = student.nextLine();
		System.out.println("student name is:"+S);
		System.out.println("student rollnumber is:"+S1);
		System.out.println("student department is:"+S2);
		System.out.println("Student section is:"+S3);
		}

}
