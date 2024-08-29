package pratice_programs;

public class computer {
	class processor{
		public void display_details() {
		System.out.println("brand:hp");
		System.out.println("speed:170");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer obj= new computer();
		computer.processor obj1 = obj.new processor();
		obj1.display_details();
		
	}

}
