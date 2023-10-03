package DS;

import java.util.ArrayList;

public class Graph {

	public static void main(String[] args) {
		
		
//		GNode a = new GNode(0);
//		a.nodeList.add(b);
//		a.nodeList.add(c);
//		
//		System.out.println("a : "+ a.info);
//		System.out.println("b : "+ a.nodeList.get(0).info);
//		System.out.println("c : "+ a.nodeList.get(1).info);
		implimentGraph ig = new implimentGraph();
		ArrayList<GNode> list = new ArrayList<GNode>();
		GNode a,b;
		
		list.add(ig.createNode(0,'a'));
		list.add(ig.createNode(1,'b'));
		list.add(ig.createNode(2,'c'));
		list.add(ig.createNode(3,'d'));
		
		
		
		int [][] mat = {{0,1,1,1}
						,{1,0,1,1}
						,{1,1,0,1}
						,{1,1,1,0}};
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				if(mat[i][j] == 1) {
					a= list.get(i);
					b = list.get(j);
					a.nodeList.add(b);
				}
			}
		}
		
		for(int i=0;i<list.size();i++) {
			a= list.get(i);
			System.out.println("Node: "+a.ch);
			System.out.print("       Childs: ");
			for(int j=0;j<a.nodeList.size();j++) {
				b = a.nodeList.get(j);
				System.out.print("("+b.ch+","+b.info+") ");
			}
			System.out.println();
		}
		
	}

}

class implimentGraph{
	
	GNode createNode(int x , char ch) {
		return new GNode(x,ch);
	}
}