package exercise;
import java.util.Scanner;
import java.util.ArrayList;

public class exercises {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		boolean isTralse = isPalindrom(a);
		
		if (isTralse)
			System.out.println("True. It is a Palindrome");
		else 
			System.out.println("False. Not a palindrome");
		sc.close();
	}
	
	public static boolean isPalindrom(String a) {
		String tempString = "";
		
		for (int i =  a.length() -1; i >= 0; i--) {
			tempString += a.charAt(i);
		}
		return tempString.equals(a);
	}
}
