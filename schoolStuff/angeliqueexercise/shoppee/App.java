package exercise;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// int n = 0;
		double total = 0;
		int exit = 0;
		Scanner sc = new Scanner(System.in);
		Product product1 = new Product(1, "Shampoo", 120.50, 5);
		Product product2 = new Product(2, "Toothpaste", 75.25, 10);
		Product product3 = new Product(3, "Soap", 45.00, 2);
		
		Product[] product_list = {product1, product2, product3};
		
//		Product[] cart = new Product[3];
		ArrayList<Product> carts = new ArrayList<Product>();
        while (exit != 5) {
            System.out.println("1. Show Products");
			System.out.println("2. Add to Cart by ID");
			System.out.println("3. Show Cart");
			System.out.println("4. Checkout");
			System.out.println("5. Exit");
			
			System.out.println("Enter a number: ");
            int num = 0;
            try {
                num = sc.nextInt();
            } catch (Exception e){
                System.out.println("ERROROROROROROROR");
                sc.nextLine();
                continue;
            }
			
			exit = num;
			
			if (num == 1) {
				for (Product prod : product_list) {
					prod.show();
					System.out.println();
				}
			}
			else if (num == 2) {
				Product tempProd = null;
				int ID = sc.nextInt();
				for (Product prod : product_list) {
					if (prod.productID == ID) {
						tempProd = prod;
					}
				}
				carts.add(tempProd);
			}
			else if (num == 3) {
				for (Product x : carts) 
					x.show();
			}
			else if (num == 4) {
				for (Product x : carts) {
					total += x.showPrice();
				}
				System.out.println(total);
				break;
			}
			else
				System.out.println("Invalid Number");
        }
		sc.close();
	}
}
