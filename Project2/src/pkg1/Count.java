package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Count 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\pc\\Desktop\\xyz.txt");
		FileReader fr=new FileReader(f);
		int a,count;
		a=fr.read();
		count=0;
		while(a!=-1)
		{
			if((char)a!=' ' && (char)a!='\n' && (char)a!='\r')
				count++;
			a=fr.read();
		}
		fr.close();
		System.out.println("Total number of character int the xyz file is " + count);
	}

}
