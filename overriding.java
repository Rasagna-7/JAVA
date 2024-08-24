package PROGRAMS;
class Animal{
	public void display()
	{
		System.out.println("It is a dog");
	}
}
class Dog extends Animal{
	public void display()
	{
		System.out.println("It is a Golden Dog");
	}
}

public class overriding {
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.display();
	}
		
}


