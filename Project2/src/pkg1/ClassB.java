package pkg1;

import java.util.Scanner;

public class ClassB 
{
	public static void main(String[] args) 
	{
		int r,sum=0,temp;    
		System.out.println("Please enter the no to check palinfrome or not");
		Scanner obj=new Scanner(System.in);  
		int n=obj.nextInt();  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		
	}

}
