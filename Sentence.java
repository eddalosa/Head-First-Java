import java.util.*;
import java.io.*;

public class StringCompare {
	String s;
	int len;

	public static void main (String [] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Key in the sentence:");
		s = scan.nextLine();
		System.out.println("Enter the desired length of the string:");
		len = scan.nextInt();
		int count = 0;
		Mix4 [] m4a = new Mix4[20];
		int x = 0;
		while(x < 7) {
			m4a[x] = new Mix4();
			m4a[x].counter = m4a[x].counter + 1;
			count =  count + 1;
			count =  count + m4a[x].maybeNew(x);
			x = x + 1;

		}
		System.out.println(count + " " + m4a[1].counter);
	}

	public void CheckSentence(String str, int num) {
		if (str.lenght() <= num) {

			Mix4 m4 = new Mix4();
			m4.counter = m4.counter + 1;
			return 1;
		}

		return 0;
	}
}
