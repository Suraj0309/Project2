package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Range
{
	public void FileReadBasedUponRange(int startline,int endline) throws IOException
	{
		File fl=new File("C:\\Users\\pc\\Desktop\\abc.txt");
		FileReader fr=new FileReader(fl);
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		int i=0;
		boolean x=false;
		while(s!=null)
		{
			i++;
			if(i==startline)
			x=true;
			if(x==true)
			System.out.println(s);
			if(i==endline)
			break;					
			s=br.readLine();
		}
			br.close();
		}
		
	
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Enter the line1 and line2 number");
		Scanner input1=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		int	startline=input1.nextInt();
		int	endline=input2.nextInt();
		input1.close();
		input2.close();
		Range obj=new Range();
		obj.FileReadBasedUponRange(startline, endline);
		
		
	}

}
