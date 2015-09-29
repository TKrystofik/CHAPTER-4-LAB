// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.

public class Mortgage
{
	public static void main(String[] args)
	{
		System.out.println("Lab04a, Student Version\n");
		// this is just establishing the variables that are going to be used 
		
		double principal  = 250000;
		double annualRate = 4.85;
		double numYears   = 30;
		
		// these two just hold places for calculations, making it more convenient 
		
		double rate = (annualRate * .01) / 12;
		double pay = numYears * 12;
		
		// this double is specifically calculating the interest 	
			
		double payment = ((rate * Math.pow((1 + rate) , pay) / (Math.pow((1 + rate) , pay) - 1)) * principal);
		
		// this double calculates total payments
		
		double totPay = payment * (numYears * 12);
		
		//this double calculates total interest
		
		double totInt = totPay - principal;
		
		// this is outputting the values to the screen 
		System.out.println("Principal: $" + Math.round(principal)); 
		System.out.println("Annual rate: " + annualRate + "%");
		System.out.println("Years: " + numYears);
		System.out.println("Monthly Payment: $" + Math.round((payment * 10) / 10.0));
		System.out.println("Total Payments: $" + Math.round(totPay));
		System.out.println("Total interest: " + Math.round(totInt));
	
	}
}
