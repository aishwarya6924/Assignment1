package BasicConcept;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
	      double num2;
	      double ans;
	      char op;
	      Scanner s = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      num1 = s.nextDouble();
	      num2 = s.nextDouble();
	      System.out.print("\n Enter an operator (+, -, *, /): ");
	      op = s.next().charAt(0);
	      switch(op) {
	         case '+': ans = num1 + num2;
	                         break;
	         case '-': ans = num1 - num2;
	                         break;
	         case '*': ans = num1 * num2;
	                         break;
	         case '/': ans = num1 / num2;
	                         break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.print("\n The result is :\n");
	      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	}

}
