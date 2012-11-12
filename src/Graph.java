//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 3
//Enron E-mail Graphing
//11 November 2012
//Graph Object



import java.util.*;

public class Graph {
	//the lone field in the object
	private ArrayList<Node> nodes;
	
	//constructor for predefined ArrayList
	public Graph (ArrayList<Node> nodes)
	{
		 this.nodes = nodes;
	}
	
	//constructor that constructs a new ArrayList and passes the reference
	public Graph ()
	{
		ArrayList<Node> nodes = new ArrayList<Node>();
		
		this.nodes = nodes;		
	}
	
	//setter for adding a node
	public void addNode(Node node){
		this.nodes.add(node);
	}
	
	//getter for getting the reference to a node
	public Node getNode(int index)
	{
		return this.nodes.get(index);
	}
	
	//returns the size of the graph
	public int size() {
		return this.nodes.size();
	}
	
	
}