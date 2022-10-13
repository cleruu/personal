import java.util.Scanner;
// import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        /* 
        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        oddEven(lastTwoDigits);
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        if (PriComp(lastDigit)) {
            System.out.println("COMPOSITE");
        } else {
            System.out.println("PRIME");
        }
        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        charLength(firstName, surName);
        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.

        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();
        largestNum(firstNumber, secondNumber, thirdNumber);
        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        System.out.println("5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        System.out.println(sixDigits(studentNumber));
        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();
        if (studentNumber != 2022103266) {
            System.out.println("Invalid student number");
        }
        else
            System.out.println("Valid student number");
        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        surName = scan.next();
        char[] fnameChar = firstName.toCharArray();
        char[] snameChar = surName.toCharArray();
        if (uCaseChecker(fnameChar)) {
            System.out.println("Valid first name");
        } 
        else
            System.out.println("Invalid first name");

        if (lCaseChecker(snameChar)) {
            System.out.println("Valid surname");
        } 
        else
            System.out.println("Invalid surname");


        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

        if (course.equals("BSIT")) {
            System.out.println("Enter your specialization (MWAA or MAA)");
            String specialization1 = scan.next();
            if (specialization1.equals("MWAA") || specialization1.equals("MAA")) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        } else if (course.equals("BSCS")) {
            System.out.println("Enter your specialization (DF or ML)");
            String specialization2 = scan.next();
            if (specialization2.equals("DF") || specialization2.equals("ML")) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }
        
        

        // If BSCS
        // if (course == "BSCS") {
        //     System.out.print("Enter your specialization (DF or ML): ");
        //     String specialization2 = scan.next();
        // }
        

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("ABM");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        switch (strand) {
            case "STEM":
            case "ICT":
            case "HUMSS":
            case "HOME ECONOMICS":
            case "ARTS AND DESIGN":
            case "TVL MARITIME":
                System.out.println("Valid");
                break;
        
            default:
                System.out.println("Invalid");
                break;
        }

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if (Pattern.matches(surName + "(..)" + "@students.national-u.edu.ph", studentEmailAddress)) {
            System.out.println("Valid Email");
        } else 
            System.out.println("Invalid Email");


        
        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Mystery method :-)

        // Find the formula of method f(n) that accepts any positive integer n.

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3
        */
        System.out.println("11. Mystery method! :-)");
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        System.out.println(mysteryMethod1(n));

        // Close scanner
        scan.close();
    }

    public static void oddEven(int x) {
        System.out.println(x%2 == 1 ? "ODD" : "EVEN");
    }

    public static boolean PriComp(int x) {
        if (x<=1) {
            return false;
        }
        for (int i = 2; i <= x/2; i++) {
            if ((x%i) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void charLength(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        System.out.println(aLength + bLength);
    }

    public static void largestNum(int a, int b, int c) {
        if (a > b) {
            if(a > c) {
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else if (b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }

    public static int sixDigits(int a) {
        int b = a % 1000000;
        return b;
    }

    public static boolean uCaseChecker(char[] a) {
        for (int i = 0; i < a.length; i++) {
            if (!Character.isUpperCase(a[i])) {
                return false;
            }
        }

        return true;
    }

    public static boolean lCaseChecker(char[] a) {
        for (int i = 0; i < a.length; i++) {
            if (!Character.isLowerCase(a[i])) {
                return false;
            }
        }

        return true;
    }

    public static int mysteryMethod1(int a) {
        int total = 0;
        for (int j = a; j > 0; j--) {
            if (j % 2 == 1) {
                total -= j;
            }
            else if (j % 2 == 0) {
                total += j;
            }
        }
        return total;
    }
}
