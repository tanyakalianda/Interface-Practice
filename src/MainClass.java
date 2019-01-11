import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args)
	{
		ArrayList<Measurable> myList = new ArrayList<Measurable>();
		for (int i = 0; i < 15; i++)
		{
			myList.add(new Country(Math.random()*20000000 + 1000000)); //range is 1mil to 21mil
			//myList.add(new BankAccount(Math.random()*2000 + 100));
		}
		System.out.println("Average population: " + findAverage(myList));
	//	System.out.println("Average balance: " + findAverage(myList));

	}
	
	private static double findAverage(ArrayList<Measurable> list)      //array list of an interface (of measurables)
																		//need static b/c not instantiating a class
	{
		double total = 0;
		int count = 0;
		for (Measurable object: list)       //Measurable = data type
		{
			total += object.getMeasure();
			count++;
		}
		return total/count;
	}

}
