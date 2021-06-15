import java.util.*;
import java.io.*;

public class Task2 {

	public static void main (String [] args) {
		String one, two;
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter your first string:");
		one = scan.nextLine();
		System.out.println("Enter your second string:");
		two = scan.nextLine();
		
	}

	public void compareStrings(String first, String second) {
		if (first.equals(second)) {
			System.out.println(first + " = " + second);
		}
	}
}
