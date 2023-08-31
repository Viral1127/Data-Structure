import java.util.Scanner;
class Node{
	String person;
	String phone;
	Node next;

	Node(String x,String y){
		this.person = x;
		this.phone = y;

	}
}

class LinkList{
	Node head;
	int length;

	void insertLast(String x , String y){
		Node n = new Node(x , y);

		if(head==null){
			head = n;
		}
		else{
		Node temp = head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=n;
		}
	}
	void display(){
		Node temp = head;

			while(temp != null ){
				System.out.println(temp.person+" "+" "+temp.phone);
				temp = temp.next;
			}
	}

	void search(String name){
		Node temp = head;
		if(temp.person==name){
			System.out.println(temp.person);
		}
	}

	void deleteLast(){
		Node temp = head;
		while(temp != null){
			if(temp.next.next == null){
				temp.next = null;
			}
			temp = temp.next;
		}
	}
}


public class TelephoneDic{
	public static void main(String[] args) {
		LinkList l = new LinkList();
		Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter choice :  \n 1 for name and phone\n 2 for search \n 3 for display\n 4 for exit ");
            int choice = sc.nextInt();
            switch (choice){
                // case 1 : System.out.println("Enter element");
                //             int x = sc.nextInt();
                //             l.insertFirst(x);
                //             break;
                // case 2 : l.deleteFirst();
                //             break;

                case 3 : l.display();
                            break;
                
                case 1 : System.out.println("Enter element Name");
                            String x = sc.next();
                            System.out.println("Enter element mobileNumber");
                            String y = sc.next();
                            l.insertLast(x , y);
                            break;

                case 2 : 	String v = sc.next();
                			l.search(v);
                            break;

                // case 3 : l.deleteLast();
                // 			break;

                case 4 : return;
          	}
        }
	}
}
