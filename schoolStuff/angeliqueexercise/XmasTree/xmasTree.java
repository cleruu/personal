package exercise;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int low = 6;
		int high = 8;
		
		String name = sc.nextLine();
		
		System.out.println("Merry Christmas! " + name);
		
		while (i < 9) {
			if (i > 6) {
				for (int j = 0; j < 13; j++) {
					if (j < 5 || j > 7)
						System.out.print(" ");
					else 
						System.out.print("*");
				}
				System.out.println();
				i++;
				continue;
			}
			for(int j = 1; j <= low; j++) 
				System.out.print(" ");
			for (int j = low + 1; j < high; j++) 
				System.out.print("*");
			for (int j = low; j >= high; j++) 
				System.out.print(" ");
			System.out.println();
			low--;
			high++;
			i++;
		}
		sc.close();
	}
}
