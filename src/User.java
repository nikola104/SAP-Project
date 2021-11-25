import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class User {
	Scanner in = new Scanner(System.in);
	private String username;
	private String password;
	HashMap<Key, ProductPrice> mapProducts = new HashMap<>();

	public User() {
		this.username = Login.getUsername();
		System.out.println("Hello " + username);
		choice();

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void addProductToMyProducts() {
		String model;
		String brand;
		String descrip;
		double price;
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(username  + "FileWithProducts.txt",true));
				PrintWriter out = new PrintWriter(writer);
				BufferedWriter writer2 = new BufferedWriter(new FileWriter("allProducts.txt",true));
				PrintWriter out2 = new PrintWriter(writer2);
				) {
			in.nextLine();
			System.out.print("What is the MODEL of the product: ");
			model = in.nextLine();
			System.out.print("What is the BRAND of the product: ");
			brand = in.nextLine();
			System.out.print("DESCRIBE THE PRODUCT: ");
			descrip = in.nextLine();
			System.out.print("The PRICE of the product: ");
			price = in.nextDouble();
			mapProducts.put(new Key(model,brand,descrip), new ProductPrice(price));
			out.println(mapProducts);
			out2.println(mapProducts);
			System.out.println("The Product was added Successfully!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void choice() {
		int choice;
		do {

			System.out.println("Hello what would like to do?");
			System.out.println("1) Add product");
			System.out.println("2) Buy product");
			System.out.println();
			System.out.print("Enter choice: ");
			choice = in.nextInt();

			if (choice < 1 || choice > 2) {
				System.out.println("Invalid choice. Please choose 1-2\n");

			}

		} while (choice < 1 || choice > 2);

		switch (choice) {
		case 1:
			addProductToMyProducts();
			break;
		case 2:

			break;
		}

	}

}
