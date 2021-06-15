class Shuffle {
	public static void main (String [] args) {
		int x =3;
		while (x > 0) {
			if( x > 2) {
				System.out.print ("a");
			} else if (x == 2) {
				System.out.print("b c");
			}else if (x  == 1){
				System.out.print("d");4
				x = x-1;
			}
			x = x-1;
			System.out.print("-");
		}

	}
}