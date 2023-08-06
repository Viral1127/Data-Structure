import java.util.Scanner;
public class EnqueueAndDequeue{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of queue");
        int n = sc.nextInt();
        Queue q1 = new Queue(n);

        while(true){
            System.out.println("enter choice :  \n 1 for insert\n 2 for delete \n 3 for display \n 4 for exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 : System.out.println("Enter element");
                            int x = sc.nextInt();
                            q1.enqueue(x);
                            break;
                case 2 : q1.dequeue();
                            break;

                case 3 : q1.display();
                            break;
                
                case 4 : return;
            }
        }
	}
}

class Queue{
	int f,r,n;
	int queue[];

	Queue(int n){
		f=-1;
		r=-1;
		this.n = n;
		queue = new int[n];
	}

	void enqueue(int x){
		if(r>=n-1){
			System.out.println("Queue Overflow");
		}
		else{
			r++;
			queue[r] = x;
			if(f==-1){
			f=0;
			}
		}
		
	}

	int dequeue(){
		int y;
		if(f==-1){
			System.out.println("Queue underflow");
			return 0;
		}
		else{
			y = queue[f];
		}

		if(f==r){
			f=-1;
			r=-1;
		}
		else{
			f++;
		}
		return y;
	}

	void display(){
		for(int i=f;i<=r;i++){
			System.out.println(queue[i]);
		}
	}
}