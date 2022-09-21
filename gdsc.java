package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
//        int x = placeHolder(1101);
//        System.out.println(x);
//        int a = 10, b = 5;
//        System.out.println(b == 10 ? "yes" : "no");
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        
        interestSum(num);
  

    }
    
    public static void interestSum(float num){
        float total = 0;
        float x = (float) 0.01;
        float y = (float) 0.03;
        float z = (float) 0.05;
        
        total = total + (num * x);
        System.out.println(x + " * " + num + " = " + (num * x));
        total = total + (num * y);
        System.out.println(y + " * " + num + " = " + (num * y));
        total = total + (num * z);
        System.out.println(z + " * " + num + " = " + (num * z));
        
        
        System.out.println(total + num);
    }
 
//    public static int placeHolder(int num) {
//        
//        int remainder, i = 0;
//        int total = 0;
//        
//        while (num != 0) {
//            remainder = num % 10;
//            num /= 10;
//            total += remainder*Math.pow(2, i);
//            i++;
//        }
//         
//       
//        return total;
//    }
    
}

