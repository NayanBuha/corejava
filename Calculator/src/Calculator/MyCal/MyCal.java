package Calculator.MyCal;

import java.util.Scanner;

public class MyCal {

	public static void main(String[] args) {
		
		char Operator;
		double number1 , number2 ;
		double ans =0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an operator : + ,- ,* ,/");
		Operator=sc.next().charAt(0);
		
		System.out.println("Enter First Number: ");
		number1=sc.nextDouble();
		
		System.out.println("Enter Second Number : ");
		number2=sc.nextDouble();
		
		switch(Operator) {
			
		case '+':
			ans=number1+number2;
			break;
			
		case '-':
			ans=number1-number2;
			break;
			
		case '*':
			ans=number1*number2;
			break;
			
		case '/':
			ans=number1/number2;
			break;
			
		default:
			System.out.println("Invalid Operator");
			break;
		}
		System.out.println(number1+" "+ Operator +" "+number2+ " = " +ans);
		sc.close();

	}

}




