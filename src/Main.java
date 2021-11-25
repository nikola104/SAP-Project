import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice;
		do {

			System.out.println("Hello what would like to do?");
			System.out.println("1) Login.");
			System.out.println("2) Register");
			System.out.println();
			System.out.print("Enter choice: ");
			choice = in.nextInt();

			if (choice < 1 || choice > 2) {
				System.out.println("Invalid choice. Please choose 1-2\n");

			}

		} while (choice < 1 || choice > 2);

		switch (choice) {
		case 1:
			new Login().scannFiles();	
			new User();
			break;
		case 2:
			new Register().getNewAcc();
			break;
		}
		

	}

}
