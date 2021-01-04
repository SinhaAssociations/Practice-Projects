package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		File file =new File("./rahulFile.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			//System.out.println(sc.nextLine());
			String r=sc.nextLine();
			String[] s = r.split(":"); 
			System.out.println(s[0]);
			System.out.println(s[1]);
			
			
			
			
		}
		
	}

}
