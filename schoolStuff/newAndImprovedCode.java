import java.util.Scanner;
import java.util.Arrays;
 
class App { 
    static int index;
    public static void main(String[] args) { 
        int[] a = {15, 30, 25, 19, 30, 40}; // Initialize the array
        System.out.println(Arrays.toString(a)); 
        recurArrRemove(a);         // call the method 
    }

    public static void recurArrRemove (int[] aray) { // method for removing elements in an array
        Scanner scan = new Scanner(System.in);
        if (aray.length > 0) {           // Checks if the length of the aray variable in the parameter is greater than 0 if not, execute the code
            System.out.print("Enter a number to remove: ");
            int delete = scan.nextInt(); // scan for input to be deleted

            for (int i = 0; i < aray.length; i++) { // checks for the index of the scanned number
                if (delete == aray[i]) {
                    index = i; break;
                }
                else 
                    index = -1;
            }

            if (index < 0)  { // If element is not in the list prints not in the list
                System.out.println("ELEMENT NOT IN THE LIST");
                recurArrRemove(aray); // If number inputted is not in the array, repeat.
                scan.close(); return; 
            }   
                
            int[] proxyArray = new int[aray.length - 1]; // creates a new array to store 
            
            for (int i = 0, k = 0; i < aray.length; i++) { // Adds the element of the given array to the new array
                if (i == index)
                    continue;
                proxyArray[k++] = aray[i];
            }
            System.out.println(proxyArray.length == 0 ? "The array is now empty!" : Arrays.toString(proxyArray)); // checks if the array has no more elements, if none it prints "The array is now empty."

            recurArrRemove(proxyArray); // calls the function recursively until aray.length returns false
        }
        scan.close();
    }
}
