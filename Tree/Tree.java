import java.util.Scanner;
class Node{
	int value;
	Node left;
	Node right;

	Node(int value){
		this.value = value;
	}
}

class Bts{
	Node root;

	void insert(int value){
		Node n = new Node(value);

		if(root==null){
			root=n;
		}
		else{
			Node perent;
			Node child=root;

			while(true){
				perent=child;

				if(child.value<=n.value){
					child = child.right;

					if(child==null){
						perent.right=n;
						System.out.println("Element is added at right of : " + perent.value);
						break;
					}
				}

				else{
					child=child.left;

					if(child==null){
						perent.left=n;
						System.out.println("Element is added at left of : " + perent.value);
						break;
					}
				}
			}
		}
	}

	static void inOrder(Node root){
		if(root==null){
			return;
		}

		else{
			inOrder(root.left);
			System.out.println(root.value + " ");
			inOrder(root.right);
		}
	}

	static void preOrder(Node root){
		if(root==null){
			return;
		}

		else{
			System.out.println(root.value + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	static void postOrder(Node root){
		if(root==null){
			return;
		}

		else{
			postOrder(root.left);
			postOrder	(root.right);
			System.out.println(root.value + " ");
		}
	}
}

public class Tree{
	public static void main(String[] args){
		Bts b1 = new Bts();

		Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter choice :  \n 1 for insert\n 2 for  Preorder Traversal\n 3  Post order Traversal\n 4 in order Traversal\n 5 for Exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 : System.out.println("Enter element");
                            int x = sc.nextInt();
                            b1.insert(x);
                            break;
                case 2 : b1.preOrder(b1.root);
                			break;

                case 3 : b1.postOrder(b1.root);
                			break;

                case 4 : b1.inOrder(b1.root);
                			break;

                case 5 : return;			
          	}
        }
	}
}