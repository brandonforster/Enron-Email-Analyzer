//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 3
//Enron E-mail Graphing
//11 November 2012
//Node Object

package graphjam;

import java.util.*;

public class Node {
	private int id;
	private ArrayList<Integer> edges = new ArrayList<Integer>();

	public Node(int id){
		this.id  = id;
	}

	public int getId(){
		return id;
	}
	
	public void addEdge(int edge)
	{
		edges.add(edge);
	}
	
	public ArrayList<Integer> getEdges()
	{
		return edges;
	}
}
