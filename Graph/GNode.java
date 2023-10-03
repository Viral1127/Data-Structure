package DS;

import java.util.ArrayList;

class GNode {
	 int info;
	 char ch;
	 ArrayList<GNode> nodeList = new ArrayList<GNode>();
	 
	 public GNode(int info, char ch){
		 this.info = info;
		 this.ch = ch;
	 }
	 public GNode(int info){
		 this.info = info;
		 
	 }

}
