package Day7;
class Bank
{
	void rateOfIntrest() 
	{
		System.out.println("2%");
	}
	void minBalance()
	{
		System.out.println("1000 rs");
	}
}
class Axis extends Bank

{
	void rateOfIntrest() 
{
		super.rateOfIntrest();
	System.out.println("4%");
}
	
}
class Icic extends Bank
{
	void rateOfIntrest() 
	{
		System.out.println("6%");
	}
}

public class BankDemo {

	public static void main(String[] args) {
		Bank ic= new Icic();	
		Bank ax=new Axis();
		
		ic.rateOfIntrest();
		ic.minBalance();
		ax.rateOfIntrest();
		ax.minBalance();
		

	}

}


















