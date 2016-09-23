package DecoratorPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StreamTest {

	public static void main(String[] args)
	{
		File file=new File("d://file.txt");
		BufferedReader br=null;
		
		/*
		try {
			 br=new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(br.readLine()!=null)
			{
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

		/*
		 * New Functionality Added 
		 * 
		 */
		
		try {
			br=new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		br=new UpperCaseReader(br);
		
		try {
			while(br.readLine()!=null)
			{
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
