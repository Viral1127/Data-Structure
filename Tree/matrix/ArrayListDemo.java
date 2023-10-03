import java.util.*;

public class ArrayListDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number of nodes ");
		int n = sc.nextInt();
		int m[][] = new int[n][n];
		for(int i=0 ; i < n ; i++ ){
			for(int j = 0; j < n ; j++){
				
				m[i][j] = sc.nextInt();
			} 
		}

		Graph g = new Graph(m);
		g.display();

	}
}


class Node{
	int data;
	ArrayList<Node> arr_lst = new ArrayList<>();

	Node(int data)
	{
		this.data = data;
	}
	public String toString(){
		return String.format("%d",data);
	}
}




class Graph{
	Matrix m;
	Node[] nodes;
	Graph(int[][] mtx){
		int n = mtx.length; 
		nodes = new Node[n];
		for(int i=0 ; i<n ; i++){
			nodes[i]=new Node(i+1);

		}
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<n ; j++){
				if(mtx[i][j] != 0){
					nodes[i].arr_lst.add(nodes[j]);
				}
			}
		}

	}

	public void display(){
		for(int i=0 ; i<nodes.length ; i++){
			System.out.println(nodes[i].data + " --> " + nodes[i].arr_lst);

		}
	}

}