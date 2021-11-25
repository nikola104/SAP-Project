import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Register {
	Scanner in = new Scanner(System.in); 
	
	public void getNewAcc() {
		System.out.println("\t\t---------REGISTER---------\n");
		System.out.print("Username: ");
		String username = in.nextLine();
		System.out.print("Password: ");
		String password = in.nextLine();
		System.out.println("Successfully Registration!");
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("Users.txt",true));
				PrintWriter out = new PrintWriter(writer)	) {
				out.println(username + " " + password);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}
