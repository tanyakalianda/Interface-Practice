
public class BankAccount implements Measurable
{
	private double balance;
	
	public BankAccount(double balance)
	{
		this.balance = balance;        //this.balance refers to the field
	}
	
	public double getMeasure()
	{
		return balance;           //for a bank account, getMeasure means balance
	}
	
	
}
