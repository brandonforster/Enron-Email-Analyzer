public class Graph {
	private ArrayList<Node> nodes = new ArrayList<Node>;
	
	public void addNode(Node node){
		nodes.add(node);
	}
	
	public Node getNode(int nodeID)
	{
		return nodes.get(nodeID);
	}
	
	public int size() {
		return nodes.size();
	}
	
	
}