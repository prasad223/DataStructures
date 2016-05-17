package BasicDS.Graphs;

import java.util.Arrays;
import java.util.Set;
import java.lang.Integer;
/**
 * Created by prasad223 on 2/20/16.
 */

class Edge<V>{

    V src;
    V dest;
    int weight;

    Edge(){}

    Edge(V src,V dest, int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    Edge(V src, V dest){
        this(src, dest, 0);
    }

}

public class GraphAdjacencyMatrix{

    Set<Edge<Integer>> edges;
    private int[][] adjacencyMatrix;
    int numEdges;

    GraphAdjacencyMatrix(int numVertices){
        adjacencyMatrix = new int[numVertices][numVertices];
        numEdges = 0;
    }

    public void addEdge(Edge<Integer> e) {
        adjacencyMatrix[e.src][e.dest] = e.weight;
        numEdges++;
    }

    public void removeEdge(Edge<Integer> e) {
        adjacencyMatrix[e.src][e.dest]  = 0;
        numEdges--;
    }

    public Set<Integer> getAdjacentVertices(Integer v) {
        return null;
    }

    public int getVerticesCount() {
        return adjacencyMatrix.length;
    }

    public int getEdgesCount() {
        return numEdges;
    }

    public void allPairShortestPath(){
        int numVertices = adjacencyMatrix.length;
        int[][] distance = new int[numVertices][numVertices];
        int[][] path = new int[numVertices][numVertices];
        for(int i=0; i < numVertices; i++){
            for(int j=0; j< numVertices; j++){
                if(i == j){
                    distance[i][j] = 0;
                    path[i][j] = i;
                }else{
                    distance[i][j] = adjacencyMatrix[i][j];
                    path[i][j] = i;
                    if(adjacencyMatrix[i][j] == 0){
                        distance[i][j] = Integer.MAX_VALUE;
                        path[i][j] = Integer.MAX_VALUE;
                    }

                }
            }
        }

        int dist;
        for(int k=0;k< numVertices; k++){
            for(int i=0; i< numVertices;i++){
                for(int j=0; j<numVertices; j++){
                    dist = distance[i][k] + distance[k][j];
                    if(distance[i][j] > dist){
                        distance[i][j] = dist;
                        path[i][j] = path[i][k];
                    }
                }
            }
        }
        for(int[] row:distance){
            System.out.println(Arrays.toString(row));
        }
        for(int[] row:path){
            System.out.println(Arrays.toString(row));
        }
    }
}
