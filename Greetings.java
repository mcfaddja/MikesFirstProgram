import java.io.*;

public class Greetings {

//	private static String myName = "Mike\n";

	public static void main ( String[] theArgs ) {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String name;
		try {
			System.out.println("What is your name:");
			name = br.readLine();
			System.out.println("Hello " + name + " nice to meet you");
		} 
		catch (IOException e) {
			System.out.println("Error Meassage Goes Here");
		}
//		System.out.println(myName);
		
	}
}
