package error_handling_concept_division;

import java.util.*;
public class E7P2
{
	public static void main(String[] args)
	{
		double dividend, divisor, quotient;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value for the dividend: ");
		dividend=input.nextDouble();
		System.out.println("Enter the value for the divisor: ");
		divisor=input.nextDouble();
		
		try
		{
			if(divisor==0)
			{
				throw new ArithmeticException();
			}
			quotient=dividend/divisor;
			System.out.println("Quotient: "+quotient);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sorry Friend! You've entered wrong values!");
		}
	}

}
