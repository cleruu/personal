package exercise;

public class Product {
	int productID;
	String productName;
	double price;
	int quantity;
	
	public Product(int pID, String pName, double prc, int qt) {
		productID = pID;
		productName = pName;
		price = prc;
		quantity = qt;
	}
	
	public void show () {
		System.out.println("ID: " + productID + "\nproductName: " + productName + "\nprice: " + price + "\nquantity: " + "quantity");
	}
	
	public double showPrice () {
		return price;
	}
}
