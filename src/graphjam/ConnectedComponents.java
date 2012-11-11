//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 3
//Enron E-mail Graphing
//11 November 2012
//Connected Components Functionality

package graphjam;

import java.util.*;

public class ConnectedComponents {


	//constant so we don't have any magic numbers
	private static final int NUMBER_OF_NODES = 36692;

	//constants to define for our array
	private static final int UNDISCOVERED = 0;
	private static final int DISCOVERED = 1;
	private static final int VISITED = 2;

	//stores the state of all edges in the graph
	static int[] state = new int[NUMBER_OF_NODES];

	public static void main(String[] args) {

		int count = 0;

		//initialize all edges to undiscovered
		Arrays.fill(state, UNDISCOVERED);

		//attempt to run DFS from every node
		for(int i = 0; i < NUMBER_OF_NODES; i++) {
			Node sourceNode = scanner.bigGraphOfJustice.getNode(i);

			//if the node isn't visited, we want to run DFS on it
			if(state[sourceNode.getId()] != VISITED){
				//add to the number of connected components
				count++;

				//start DFS
				//DFS uses Stack data structure
				Stack<Node> dfsStack = new Stack<Node>();

				dfsStack.push(sourceNode);
				state[sourceNode.getId()] = VISITED;

				//while we have a stack
				while(dfsStack.isEmpty() == false) {

					Node currentNode = (Node)dfsStack.peek();
					state[currentNode.getId()] = DISCOVERED;

					//visit child
					Node child = getUnvisitedChild(currentNode);
					//if it exists
					if(child != null) {
						state[child.getId()] = VISITED;
						dfsStack.push(child);
					}

					//if the node has no children of their own, discard it off the stack
					//get one off the pile of children
					else {
						dfsStack.pop();
					}
				}

			}

		}

		//print the number of connected components
		System.out.println(count);
	}

	//returns an undiscovered child node if one exists, null if it doesn't
	public static Node getUnvisitedChild(Node parent)
	{
		//copies the parent node's edge list into an array
		Integer[] edges = parent.getEdges().toArray(new Integer[parent.getEdges().size()]);

		//for each edge in edges
		for (Integer edge : edges)
		{
			//if the edge is undiscovered, return the node that edge refers to
			if (state[edge] == UNDISCOVERED)
				return scanner.bigGraphOfJustice.getNode(edge);
		}

		//the node has no edges that are undiscovered
		return null;
	}
}