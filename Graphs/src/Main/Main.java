package Main;
import java.util.ArrayList;
import java.util.Scanner;

import AdjacencyList.GraphList;
import AdjacencyList.GraphNodeList;
import AdjacencyMatrix.GraphAdjacency;
import AdjacencyMatrix.GraphNodeAdjacency;


public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nSelecione: "
				+ "\n 1 - Matriz de adjacencia\n"
				+ "\n 2 - Lista de adjacencia\n");
		int opcao = ler.nextInt();
		
		switch (opcao) {
			case 1: 
				//Matriz de adjacencia
				ArrayList<GraphNodeAdjacency> nodeListAdjacencyMatrix = new ArrayList<GraphNodeAdjacency>();
				nodeListAdjacencyMatrix.add(new GraphNodeAdjacency("A", 0));
				nodeListAdjacencyMatrix.add(new GraphNodeAdjacency("B", 1));
				nodeListAdjacencyMatrix.add(new GraphNodeAdjacency("C", 2));
				nodeListAdjacencyMatrix.add(new GraphNodeAdjacency("D", 3));
				nodeListAdjacencyMatrix.add(new GraphNodeAdjacency("E", 4));
				
				GraphAdjacency g = new GraphAdjacency(nodeListAdjacencyMatrix);
				
				g.addUndirectEdge(0, 1);
				g.addUndirectEdge(0, 2);
				g.addUndirectEdge(0, 3);
				g.addUndirectEdge(1, 4);
				g.addUndirectEdge(2, 3);
				g.addUndirectEdge(3, 4);
				System.out.println(g.toString());
			break;
		case 2: 
			ArrayList<GraphNodeList> nodeListAdjacency = new ArrayList<GraphNodeList>();
			nodeListAdjacency.add(new GraphNodeList("A", 0));
			nodeListAdjacency.add(new GraphNodeList("B", 1));
			nodeListAdjacency.add(new GraphNodeList("C", 2));
			nodeListAdjacency.add(new GraphNodeList("D", 3));
			nodeListAdjacency.add(new GraphNodeList("E", 4));
			
			GraphList gList = new GraphList(nodeListAdjacency);
			
			gList.addUndirectEdge(0, 1);
			gList.addUndirectEdge(0, 2);
			gList.addUndirectEdge(0, 3);
			gList.addUndirectEdge(1, 4);
			gList.addUndirectEdge(2, 3);
			gList.addUndirectEdge(3, 4);
			System.out.println(gList.toString());
			break;	
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
		
	}

}
