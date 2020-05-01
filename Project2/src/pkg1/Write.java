package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write
{
	public void FileWriteBasedUponRange(int count) throws IOException
	{
		File fl=new File("C:\\Users\\pc\\Desktop\\abc.txt");
		FileWriter fr=new FileWriter(fl,true);
		BufferedWriter br=new BufferedWriter(fr);
		System.out.println("Enter what do you want to enter");
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=count;i++)
		{
			br.newLine();
			br.write(s.nextLine());
		}
		System.out.println("Updated..");
		br.close();
		s.close();
	}
		
	
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Enter how many line you will write");
		Scanner input1=new Scanner(System.in);
		int	count=input1.nextInt();
		
		Write obj=new Write();
		obj.FileWriteBasedUponRange(count);
		input1.close();
	}
}

