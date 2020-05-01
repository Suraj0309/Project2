package pkg1;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) {
		System.out.println("Enter the number for the table");
		int n;
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(int i=1; i<=10;i++)
		{
			int a=n*i;
			System.out.println(n + "*" + i + "=" + a);
		}
	}

}
