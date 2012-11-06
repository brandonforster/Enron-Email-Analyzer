//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 3
//Enron E-mail Graphing
//11 November 2012
//Scanner and Launcher

package graphjam;

import java.io.*;
import java.util.*;

public class scanner {

	/**
	 * @param args- the function that the shell script is calling
	 */
	public static void main(String[] args) {

		//create a new file object from the local copy of the text
		File enronText= new File("Email-Enron.txt");

		//puts everything in a try catch to make it happy
		try
		{
			//start scanning the text.
			Scanner fileScanner = new Scanner(enronText);
			//eat input until we can skip the header
			while (fileScanner.next().compareTo("FromNodeId") != 0)
			{
				fileScanner.next();
			}
			//due to a weird bug, we found that it would not eat
			//the last token. so we had it stop on the second to
			//last and manually eat the last token.
			fileScanner.next();

			//TODO remove debug code
			System.out.println(fileScanner.next());

			//close the file
			fileScanner.close();
		}
		//catch block as re
		catch (FileNotFoundException e)
		{
			System.out.println("Input text file not found. Ending program.");
			System.exit(1);
		}

		//we are now going to begin running functional code.
		//this will execute the shortestPath function by calling the 
		//appropriate class.
		if (args[0].compareTo("shortestpath") == 0)
		{
			ShortestPath.main(args);
		}

		//this will execute IsLoop.
		else if (args[0].compareTo("isLoop") == 0)
		{
			IsLoop.main();
		}

		//this will execute connectedComponents.
		else if (args[0].compareTo("connectedComponents") == 0)
		{
			ConnectedComponents.main();
		}

		//this will execute mSquare.
		else if (args[0].compareTo("mSquare") == 0)
		{
			MSquare.main();
		}
	}

}
