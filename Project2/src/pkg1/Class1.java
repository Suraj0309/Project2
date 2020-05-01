package pkg1;

import java.util.Scanner;

public class Class1 
{
	public static void main(String[] args) {
		
		System.out.println("Enter the value of a");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("Enter the value of b");
		int b=obj.nextInt();
		//if a=10 and b=20
		a=a+b; //10+20 is a=30
		b=a-b; //30-20 is b=10
		a=a-b; //30-10 is a=20
		System.out.println("result after change the number value of a " + a);
		System.out.println("result after change the number value of b " + b);
	}

}
