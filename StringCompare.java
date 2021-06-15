import java.util.*;
import java.io.*;

public class StringCompare {
	String one, two;

	public static void main (String [] args) {
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

		return 0;
	}
}
