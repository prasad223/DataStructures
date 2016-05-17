package BasicDS.Graphs;

import java.util.Set;

/**
 * Created by prasad223 on 2/20/16.
 */

public interface Graph<V> {

    void addVertex(V v);
    void addEdge(Edge<V> e);
    void removeVertex(V v);
    void removeEdge(Edge<V> e);
    boolean hasPath(V u, V v);
    Graph<V> BFS(V v);
    Graph<V> DFS(V v);
    Set<V> getAdjacentVertices(V v);
    int getVerticesCount();
    int getEdgesCount();
}
