/*
package Day0619.graphTraverser;

import Day0619.trainNetwork.Edge;
import Day0619.trainNetwork.Vertex;

import java.util.ArrayList;
import java.util.Queue;

class GraphTraverser {
    public static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
        System.out.println(start.getData());

        for (Edge e: start.getEdges()) {
            Vertex neighbor = e.getEnd();

            if (!visitedVertices.contains(neighbor)) {
                visitedVertices.add(neighbor);
                GraphTraverser.depthFirstTraversal(neighbor, visitedVertices);
            }
        }
    }

    public static void breadthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
        Queue visitQueue = new Queue();
        visitQueue.enqueue(start);

        while (!visitQueue.isEmpty()) {
            Vertex current = visitQueue.dequeue();
            System.out.println(current.getData());

            for(Edge e : current.getEdges()) {
                Vertex neighbor = e.getEnd();
                if(!visitedVertices.contains(neighbor)) {
                    visitQueue.enqueue(neighbor);
                    visitedVertices.add(neighbor);
                }
            }
        }
    }


    public static void main(String[] args) {
        TestGraph test = new TestGraph();
        Vertex startingVertex = test.getStartingVertex();
        ArrayList<Vertex> visitedVertices = new ArrayList<Vertex>();
        visitedVertices.add(startingVertex);

        GraphTraverser.breadthFirstTraversal(startingVertex, visitedVertices);
    }
}


 */