import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
	Scanner in = new Scanner(System.in);	
	HashMap<String,String> newMap = new HashMap<>();
	private static String username1;
	
	public void  scannFiles(){
		try(BufferedReader reader = new BufferedReader(new FileReader("Users.txt")) ){
			String s;
			while((s = reader.readLine()) != null) {
				String[] arr = s.split(" ");
				newMap.put(arr[0], arr[1]);
			}
			System.out.println("\t\t---------LOGIN---------\n");
			System.out.print("Username: ");
			username1 = in.nextLine();
			System.out.print("Password: ");
			String password1 = in.nextLine();
			if (newMap.containsKey(username1)) {
				if (newMap.get(username1).equals(password1)) {
					System.out.println("Successfully login!");
				} else
					System.out.println("Wrong pass or username");

			} else
				System.out.println("Wrong pass or username");
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
	
	public static String getUsername() {
		return username1;
	}
	 
}
