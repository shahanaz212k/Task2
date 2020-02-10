package Task2.App;

public class gifts  implements method_interface{
	String type[]= {"sweets","chocolstes"};
	public gifts(String[] type) {
		this.type = type;
	}
	public gifts() {
		
	}
	public void display() {
		System.out.println("gift pack contains: ");
		for(int i=0;i<type.length;i++)
		{
			System.out.println(type[i]);
		}
	}

}
