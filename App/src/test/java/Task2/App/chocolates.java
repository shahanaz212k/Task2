package Task2.App;

public class chocolates extends gifts{
	String[] candies;
	int[] weight;
	public chocolates(String[] candies,int[] weight) {
		this.candies=candies;
		this.weight=weight;
	}
	public void display() {
		System.out.println("The chocolatess in the gifts are: ");
		for(int i=0;i<candies.length;i++)
		{
			System.out.println(candies[i]);
			System.out.println(" "+weight[i]);
		}
		
	}
	public int totalweight() {
		int total=0;
		for(int i=0;i<weight.length;i++)
			total = total+weight[i];
		return total;
	}

}
