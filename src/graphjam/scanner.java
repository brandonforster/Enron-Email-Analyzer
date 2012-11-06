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

	public static Graph bigGraphOfJustice;

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

			//run a constructor on a graph that isn't the graph of justice
			Graph workingGraph = new Graph();

			//initialize the current node to something it cannot be
			int currentNodeID = Integer.MIN_VALUE;

			while (fileScanner.hasNext() == true)
			{
				//read in the next node
				int newNodeID = fileScanner.nextInt();

				//since the nodes are ordered sequentially, if the nodeID
				//we encounter does not exist already we know it is a new
				//node that needs to be processed
				if (currentNodeID != newNodeID)
				{
					//create the object
					currentNodeID= newNodeID;
					Node newNode= new Node(currentNodeID);
					
					//add the edge that is listed on this line
					//also the name of my generation of Mustang
					int newEdge = fileScanner.nextInt();
					newNode.addEdge(newEdge);
					
					//add the new node to the graph
					workingGraph.addNode(newNode);
				}
				//the node already exists
				else
				{
					//get a reference to the current node
					Node currentNode= workingGraph.getNode(currentNodeID);
					
					//add the edge that is listed on this line
					//also the name of my generation of Mustang
					int newEdge = fileScanner.nextInt();
					currentNode.addEdge(newEdge);
				}
			}
			//now that we've finished processing the graph, copy reference
			bigGraphOfJustice = workingGraph;

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
