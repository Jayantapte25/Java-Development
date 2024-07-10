import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Product {
	String productName;
	String brand;
	String color;
	int price;
	String ownerName;
	String ownerEmail;

	public Product(String productName, String brand, String color, int price, String ownerName, String ownerEmail) {
		this.productName = productName;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getProductName() {
		return this.productName;
	}

	public String getBrand() {
		return this.brand;
	}

	public String getColor() {
		return this.color;
	}

	public int getPrice() {
		return this.price;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public String getOwnerEmail() {
		return this.ownerEmail;
	}
}

public class A2 {

	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean valid(Product obj) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(obj.getOwnerEmail());
		return matcher.find();
	}

	public static void main(String[] args) {
		List<String> productList = new ArrayList<String>();
		String filename = "input.txt";     

		try(BufferedReader br = new BufferedReader(new FileReader((filename)))){
			String line;
			while((line = br.readLine()) != null){
				productList.add(line);
			}
		} catch (IOException e){
			e.printStackTrace();
		}

		List<Product> products = new ArrayList<Product>();

		for(String name : productList){
			String[] product = name.split(",");
			Product obj = new Product(product[0], product[1], product[2], Integer.parseInt(product[3]), product[4], product[5]);
			products.add(obj);
		}

		System.out.printf("%-15s %-10s %-10s %-10s %-15s %-20s\n", "ProductName", "Brand", "Color", "Price", "OwnerName", "OwnerEmail");

		for(Product pro : products) {
			if (!valid(pro)) {
				System.out.println("InvalidEmailException: Email Id invalid " + pro.getOwnerEmail());
			} else {
				System.out.printf("%-15s %-10s %-10s %-10d %-15s %-20s\n",
				pro.getProductName(), pro.getBrand(), pro.getColor(), pro.getPrice(), pro.getOwnerName(), pro.getOwnerEmail());
			}
		}
	}
}
