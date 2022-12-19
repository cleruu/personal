package exercise;
import java.util.ArrayList;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Richard");
		names.add("Ashton");
		names.add("Hailey");
		names.add("Yurina");
		names.add("Judith");
		
		indexRemover(names); // Calling the indexRemover method
	}
	
	public static void indexRemover (ArrayList<String> names) { // Method or function for removing the index
		Scanner sc = new Scanner(System.in);
		while(names.size() > 0) {
			int index = sc.nextInt();
			
			if (index >= names.size()) { // Checks if the index inputed by the user is valid
				System.out.println("Invalid Index");
				break;
			}
			
			System.out.println(names.get(index) + " deleted."); 
			names.remove(index); // removes the value
			System.out.print("Updated Elements: ");
			
			for (String x : names) { // Prints the updated elements
				System.out.print(x + ", ");
			}
			
		}
		sc.close();
	}

}
