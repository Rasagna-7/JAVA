package PROGRAMS;

class demo {
	int salary=70000;
}
class Engineer extends demo{
	int bonus = 10000;
}
public class inheritance{

	public static void main(String[] args) {
		Engineer E1 = new Engineer();
		System.out.println("salary:"+E1.salary+"\nbonus:"+E1.bonus);
		

	}

}
