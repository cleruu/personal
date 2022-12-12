import java.util.Scanner;
import java.util.Arrays;
 
class App { 
    static int index;
    public static void main(String[] args) { 
        int[] a = {1, 2, 3, 4, 5, 1}; // Initialize the array
        System.out.println(Arrays.toString(a)); 
        recurArrRemove(a);         // call the method 
        System.out.println("The array is now empty!");
    }

    public static void recurArrRemove (int[] aray) { // method for removing elements in an array
        Scanner scan = new Scanner(System.in);
        if (aray.length > 0) {           // Checks if the length of the aray variable in the parameter is greater than 0 if not, execute the code
            System.out.print("Enter a number to remove: ");
            int delete = scan.nextInt(); // scan for input to be deleted

            int index = Arrays.binarySearch(aray, delete); // Looks for the index of the input, and assigns it to the index variable

            if (index < 0)  {
                System.out.println("ELEMENT NOT IN THE LIST");
                recurArrRemove(aray);
                return;
            }// If number inputted is not in the array, repeat.
                
            int[] proxyArray = new int[aray.length - 1]; // creates a new array to store 
            
            for (int i = 0, k = 0; i < aray.length; i++) { // Adds the element of the given array to the new array
                if (i == index)
                    continue;
                proxyArray[k++] = aray[i];
            }
            System.out.println(Arrays.toString(proxyArray)); 
            recurArrRemove(proxyArray); // calls the function recursively until aray.length returns false
        }
        scan.close();
    }
}
