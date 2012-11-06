//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 3
//Enron E-mail Graphing
//11 November 2012
//Graph Object

package graphjam;

import java.util.*;

public class Graph {
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
	public void addNode(Node node){
		nodes.add(node);
	}
	
	public int size() {
		return nodes.size();
	}
	
	
}