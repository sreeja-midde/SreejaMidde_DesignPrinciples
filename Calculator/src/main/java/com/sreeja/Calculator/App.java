package com.sreeja.Calculator;


import com.sreeja.Calculator.Operations.*;

public class App {

	private CalculatorOperations operations;

	public App(CalculatorOperations operations) {
		this.operations = operations;
	}

	double performCalculation(int n1, int n2, char operator) {

		double r= 0.0;

		switch (operator) {

		case '+':
			r = operations.addoperation(n1, n2);
			break;
		case '-':
			r = operations.subtractoperation(n1, n2);
			break;
		case '*':
			r = operations.multiplyoperation(n1, n2);
			break;
		case '/':
			r = operations.divideoperation(n1, n2);
			break;
		default:
			System.out.println("no operator specified");
			return -1;
		}

		return r;
	}
}
