package subway;

import java.util.*;

public class Graph {
	public List<Station> vertices=new ArrayList<>();			//վ�㼯
	public List<List<Edge>> edges=new ArrayList<>();   		//�ڽӾ���
	
	public Graph() {
		
	}
	public Graph(List<Station> vertices, List<Edge> edges) {
		for(int i=0;i<vertices.size();i++)
			addVertex(vertices.get(i));
		
		createAdjacencyLists(edges);
	}
	
	public void addVertex(Station v) {					//��ӽڵ�
		vertices.add(v);
		edges.add(new ArrayList<Edge>());
	}
	
	public void createAdjacencyLists(List<Edge> Edges){		//�����ڽӾ���
		for(int i=0;i<Edges.size();i++) 
			edges.get(Edges.get(i).start.stationId).add(Edges.get(i));
	}
}
