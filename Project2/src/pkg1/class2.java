package pkg1;

public class class2 
{
	public static void main(String[] args) 
	{
		
		for(int n=5;n<=50;n++)
		{
			int count=0;
			for(int i=2;i<=n/2;i++)
		
		{
			if(n%i==0)
			{
			count=count+1;
			}
		}
	
		
		if(count==0)
		{
			System.out.println("Number is prime "+ n);
		}
		else
		{
			count=0;
		}
		}
        
	}

}
