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

	    void delete(int value) {
        root = deleteNode(root, value);
    }

    Node deleteNode(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.value = Successor(root.right);
            root.right = deleteNode(root.right, root.value);
        }

        return root;
    }

    int Successor(Node root) {
        int Successor = root.value;
        while (root.left != null) {
            Successor = root.left.value;
            root = root.left;
        }
        return Successor;
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

	// void treeStructure(Node root, String prefix, boolean isLeft) {
    //     if (root != null) {
    //         System.out.println(prefix + (isLeft ? "|--" : " |- ") + root.value);
    //         treeStructure(root.left, prefix + (isLeft ? "│   " : "    "), true);
    //         treeStructure(root.right, prefix + (isLeft ? "│   " : "    "), false);
    //     }
    // }
}

public class Tree{
	public static void main(String[] args){
		Bts b1 = new Bts();

		Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter choice :  \n 1 for insert\n 2 for  Preorder Traversal\n 3  Post order Traversal\n 4 in order Traversal\n 5 for delete\n 6 for Exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 : System.out.println("Enter element");
                            int x = sc.nextInt();
                            b1.insert(x);
                            // b1.treeStructure(b1.root, "", false);
                            break;
                case 2 : b1.preOrder(b1.root);
                			break;

                case 3 : b1.postOrder(b1.root);
                			break;

                case 4 : b1.inOrder(b1.root);
                			break;

                case 5 : System.out.println("Enter element which u want to delete");
                            int y = sc.nextInt();
                            b1.delete(y);
                            break;

                case 6 : return;			
          	}
        }
	}
}