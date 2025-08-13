package Graphs.AdjMatrix;

// Adjacency Matrix Representation
public class Graph {
    int V;
    int[][]AdjMatrix;

    Graph(int vertices){
        V = vertices;
        AdjMatrix = new int[V][V];
    }

    void addEdge(int u, int v, int weight){
        AdjMatrix[u][v] = weight;
        AdjMatrix[v][u] = weight;
    }

    void printAdjMatrix(){
        System.out.println("Adjacency Matrix: ");
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                System.out.print(AdjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Driver{
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0,5,1);
        g.addEdge(5,4,1);
        g.addEdge(0,4,1);
        g.addEdge(0,1,1);
        g.addEdge(1,4,1);
        g.addEdge(4,3,1);
        g.addEdge(1,3,1);
        g.addEdge(1,2,1);
        g.addEdge(2,3,1);
        g.printAdjMatrix();
    }
}
