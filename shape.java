package pratice_programs;
import java.util.Scanner;
class getarea{
	void getarea()
	{
		int x =20;
		int y=60;
		int z =x*y;
	}
}
class rectangle extends getarea{
	void getarea() 
	{
		int area;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter length:");
		int l =scan.nextInt();
		System.out.println("enter breadth:");
		int b =scan.nextInt();
		area =l*b;
		
		System.out.println("area= "+area);
		
	}
}
public class shape {

	
	public static void main(String[] args) {
		rectangle  myobj = new rectangle();
		myobj.getarea();
	}

}
