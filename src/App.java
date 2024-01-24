

public class App {
	private static int [][] adjacencyMatrix = {
		{0, 2, 4, 0},
		{0, 0, 0, 3},
		{0, 0, 0, 0},
		{0, 0, 0, 0}};

	public static void main(String[] args) {

		// find all edges
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			for (int j = 0; j < adjacencyMatrix.length; j++) {
				System.out.println("Edge with weight: " + adjacencyMatrix[i][j]);
			}
		}
	}

	System.out.println(adjacencyMatrix[0][2]);

	// Adjacency list representation
	
	Vertex a = new Vertex("A");
	Vertex b = new Vertex("B");
	Vertex c = new Vertex("C");
	Vertex d = new Vertex("D");

	a.addNeighbor(b);
	b.addNeighbor(c);
	c.addNeighbor(d);

	// Print all neighbors
	a.showNeighbors();
	b.showNeighbors();
	c.showNeighbors();
	d.showNeighbors();
 }
}
