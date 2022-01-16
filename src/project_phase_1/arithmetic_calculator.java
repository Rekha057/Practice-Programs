package project_phase_1;

import java.util.Scanner;

public class arithmetic_calculator {
		public static void main(String[] args) {
		int  num1, num2; 
			Scanner sc =new Scanner(System.in);
			System.out.println("enter num");
			num1 =sc.nextInt();
			System.out.println("enter num2");
			num2 =sc.nextInt();
			System.out.println("addition of num is:" + (num1+num2));
			System.out.println("sub of num is:" + (num1-num2));
			System.out.println("mul of num is:" + (num1*num2));
			System.out.println("div of num is:" + (num1/num2));
			System.out.println("modulo of num is:" + (num1%num2));
		}
	}
