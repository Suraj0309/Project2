package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ClassFH 
{
	public void FileReadBasedUponLineNumber(int linenumber) throws IOException
	{
		File fl=new File("C:\\Users\\pc\\Desktop\\abc.txt");
		FileReader fr=new FileReader(fl);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int i=0;
		while((s=br.readLine())!=null)
		{
			i++;
			if(i==linenumber)
			{
			System.out.println(s);
			break;
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the line number");
		Scanner input=new Scanner(System.in);
		int	linenumber=input.nextInt();
		input.close();
		ClassFH obj=new ClassFH();
		obj.FileReadBasedUponLineNumber(linenumber);
		
		
	}

}
