package maze;
import java.util.Scanner;

public class Maze {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int currentRow = 0;
		String move;
		linkedList list = new linkedList();
		linkedList[] maze; 
		
		System.out.println("enter number of rows for your maze");
		int size = in.nextInt();
		System.out.println("enter number of elements per row");
		int rowSize = in.nextInt();
	    maze = new linkedList[size];
	    

		for (int i = 0; i < size; i++){
			
			
			for(int currentRowSize = 0; currentRowSize < rowSize; currentRowSize++){
		System.out.println("enter a value for row: "+ currentRow );
		String val;
		val = in.next();
		list.insertAtEnd(val);
		}
			
			
		}
		
		for(int j=0; j < size; j++);
		list.display();
		
		while(not solved)
		System.out.println("enter WASD to move current position");
		move = in.next();
			if (move == "w" || move == "W"){
				if (foward == 1){
					System.out.println("HELP IM TRAPPED!");
				}else{
					//go foward
				}
			}else if(move == "s" || move == "S"){
				if(back == 1){
					System.out.println("HELP IM TRAPPED!");
				}else{
					//go back
				}
			}else if(move == "a" || move == "A"){
				if(left == 1){
					System.out.println("HELP IM TRAPPED!");
				}else{
					//go left
				}
			}else if(move == "d" || move == "D"){
				if(right == 1){
					System.out.println("HELP IM TRAPPED!");
				}else{
					//go right
				}
			}
		if(position == "E"){
			System.out.println("I AM FREE");
		}
	}
	//make first row of linked list all o's to allow for fultiple entry
	//create a lonked list method that takes in a value and adds it into the list 
	//create a way to store each linked list 
}
