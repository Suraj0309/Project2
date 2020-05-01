package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLine 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\pc\\Desktop\\abc.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int count=0;
		String a=br.readLine();
		while(a!=null)
		{
			count++;
			a=br.readLine();
		}
		fr.close();
		System.out.println("Total number of Line int the abc file is " + count);
	} 

}
