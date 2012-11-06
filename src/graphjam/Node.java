package graphjam;

public class Node {
	private int id;
	private ArrayList<Integer> edges = new ArrayList<Integer>;

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
