//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 3
//Enron E-mail Graphing
//11 November 2012
//Node Object

package graphjam;

import java.util.*;

public class Node {
	private ArrayList<Integer> edges;
	private int id;

	//constructor for when we already have an ArrayList
	public Node(ArrayList<Integer> edges, int id){
		this.edges = edges;
		this.id  = id;
	}
	
	//constructor for when we need to make a new ArrayList
	public Node(int id){
		this.edges = new ArrayList<Integer>();
		this.id  = id;
	}

	//getter for returning the ID field
	public int getId(){
		return this.id;
	}
	
	//setter for adding an edge to the ArrayList field
	public void addEdge(int edge)
	{
		this.edges.add(edge);
	}
	
	//getter for returning the ArrayList field
	public ArrayList<Integer> getEdges()
	{
		return this.edges;
	}
	
	//checks to see if a node contains an edge to the node in the argument
	public boolean containsEdge(Node edge)
	{
		int edgeIndex = edge.getId();
		return this.edges.contains(edgeIndex);
	}
}
