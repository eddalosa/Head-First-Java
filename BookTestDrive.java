class BookTestDrive {
	public static void main(String [] args) {
		Book [] myBook = new Book[3];
		myBook[0] = new Book ();
		myBook[1] = new Book ();
		myBook[2] = new Book ();

		int x = 0;
		myBook[0].title = "The Grapes of Java";
		myBook[1].title = "The Java Gatsby";
		myBook[2].title = "The Java Cookbook";

		myBook[0].author = "Bob";
		myBook[1].author = "Sue";
		myBook[2].author = "Ian";

		while (x < 3) {
			System.out.println(myBook[x].title);
			System.out.print(" by ");
			System.out.println(myBook[x].author);
			x = x + 1;
		}

	}
}