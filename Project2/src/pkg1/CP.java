package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CP 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\pc\\Desktop\\abc.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		System.out.println("Enter the line number for read and write into xyz file");
		
		Scanner s=new Scanner(System.in);
		int linenumber=s.nextInt();
		String line;
		int count=0;
		while((line=br.readLine())!=null)
		{
			count++;
			if(count==linenumber)
				break;
		}
		File f2=new File("C:\\\\Users\\\\pc\\\\Desktop\\\\aaa.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write(line);
		bw.close();
		br.close();
		s.close();
		System.out.println("Read and Write sucessfully");
	}
}
