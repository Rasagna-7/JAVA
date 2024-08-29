package pratice_programs;

public class dog1 {
	String name,color;
public dog1(String given_name,String given_color) {
	name =given_name;
	color=given_color;
	
}
	public static void main(String[] args) {
		dog1 myobj=new dog1("rasu","brown");
		System.out.println(myobj.name);
		System.out.println(myobj.color);
	}

}
