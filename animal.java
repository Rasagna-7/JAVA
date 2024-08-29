package pratice_programs;
class move{
	void move()
	{
		System.out.println("animal is moving");
		
	}
}
class cheetah extends move{
	void move()
	{
		System.out.println("cheetah is running");
	}
}

public class animal {

	public static void main(String[] args) {
		cheetah myobj = new cheetah();
		myobj.move();
	}

}
