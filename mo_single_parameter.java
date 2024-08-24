package PROGRAMS;

public class mo_single_parameter {
	public int Sum(int x)
	{
		return x;
	}
	public int Sum(int x , int y)
	{
		return x+y;
	}
	public int Sum(int x , int y , int z)
	{
		return x+y+z;
	}
	public double Sum(double x , double y)
	{
		return x+y;
	}
	

	public static void main(String[] args) {
		mo_single_parameter S = new mo_single_parameter();
		System.out.println(S.Sum(2));
		System.out.println(S.Sum(5,10));
		System.out.println(S.Sum(2,3,5));
		System.out.println(S.Sum(1.5,2.5));
	}
}

		
		

	


