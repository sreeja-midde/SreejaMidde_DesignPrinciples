package com.sreeja.Calculator.Operations;

public class Implementation implements CalculatorOperations {
	
	public int addoperation(int n1, int n2) {
		
		int sumofnumbers = n1 + n2 ;
		
		return sumofnumbers;
	}
	
	public int subtractoperation(int n1, int n2) {
		
		int differenceofnumbers = n1 - n2 ;
		
		return differenceofnumbers;
	}

	public int multiplyoperation(int n1, int n2) {
		
		int productofnumbers = n1 * n2 ;
		
		return productofnumbers;
	}

	public double divideoperation(int n1, int n2) {
		
		try
		{
			double divisionofnumbers = ( double ) n1 / n2 ;
			
			return divisionofnumbers;
		}
		catch(ArithmeticException a)
		{
			a.printStackTrace();
		}
		return 0;
	}}
