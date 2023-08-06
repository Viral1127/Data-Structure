import java.util.Scanner;
public class CircularQueue{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of circular queue");
        int n = sc.nextInt();
        Cqueue cq1 = new Cqueue(n);

        while(true){
            System.out.println("enter choice :  \n 1 for insert\n 2 for delete \n 3 for display \n 4 for exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 : System.out.println("Enter element");
                            int x = sc.nextInt();
                            cq1.cqinsert(x);
                            break;
                case 2 : cq1.cqdelete();
                            break;

                case 3 : cq1.display();
                            break;
                
                case 4 : return;
            }
        }

	}
}

class Cqueue{
	int f,r,n;
	int queue[];

	Cqueue(int n){
		f=0;
		r=0;
		this.n = n;
		queue = new int[n];
	}

	void cqinsert(int x){
		if(r == n){
			r = 1;
		}
		else{
			r = r + 1;
		}

		if(f==r){
			System.out.println("overflow");
		}

		queue[r] = x;

		if(f==0){
			f = 1;
		}
	}

	int cqdelete(){
		int y;
		if(f==0){
			System.out.println("overflow");
			return 0;
		}
		 y = queue[f];

		 if(f==r){
		 	f=0;
		 	r=0;
		 	return y;
		 }

		 if(f==n){
		 	f=1;
		 }
		 else{
		 	f=f+1;
		 }
		 return y;
	}

	void display(){
		for(int i=f ; i<=r ; i++){
			System.out.println(queue[i]);
		}
	}
}