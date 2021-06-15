import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


class CheckWord {


    public static boolean check_for_word(String sentence, int len) { 	
      	if(sentence.length() <= len) {
      		System.out.println(sentence);
	        try {
	            BufferedReader in = new BufferedReader(new FileReader(
	                    "/usr/share/dict/american-english"));
	            String str;
	            while ((str = in.readLine()) != null) {
	            	String [] splitString = sentence.split("\\P{L}+");
	            	for(int i= 0; i<splitString.length; i++){
	            		if (splitString[i].indexOf(str) != -1) {
	            		    System.out.print(splitString[i] + " ");
	            		}
	            	}
	                
	            }
	            in.close();
	        } 
	        catch (IOException e) {	
        	}
        }

        return false;
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the sentence:");
    	String str = scan.nextLine();
    	System.out.println("Enter the desired length:"); 
    	int len = scan.nextInt();
        check_for_word(str, len);
    }
}
