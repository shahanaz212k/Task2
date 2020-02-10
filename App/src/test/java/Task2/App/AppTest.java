package Task2.App;
public class AppTest{
	public static void main(String[] args) {
		String[] sweets = {"cadbury","munch","five star","ferrorocher"};
		String[] gift= {"diary milk","m&m","nougat",""};
		String[] chocolate= {"m&m","nougat","others"};
		int[] weight1= {12,10,25};
		int[] cost= {13,12,10,15};
		sweets object1= new sweets(sweets,cost);
		
		object1.display();
		System.out.println("The total weight of the gift box is "+object1.totalweight());
		gifts object2 = new gifts();
		object2.display();
		
		gifts object3 = new gifts(gift);
		object3.display();
		chocolates choco = new chocolates(chocolate,weight1);
		choco.display();
		System.out.println("The total weight of chocolate box is:" +choco.totalweight());
		
		
		
	}
}
