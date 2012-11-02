package graphjam;

import java.io.*;
import java.util.*;

public class scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File enronText= new File("Email-Enron.txt");

		try
		{
			Scanner fileScanner = new Scanner(enronText);
			while (fileScanner.next().compareTo("FromNodeId") != 0)
			{
				fileScanner.next();
			}
			fileScanner.next();
			
			System.out.println(fileScanner.next());

			fileScanner.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("Fuck.");
		}
	}

}
