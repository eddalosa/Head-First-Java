public class SimpleDotcomTestDrive {
	public static void main(String [] args) {
		int numOfGuesses = 0;

		GameHelper Helper =  new GameHelper ();

		SimpleDotCom  dot = new SimpleDotCom ();

		int randomNum = (int) (Math.random() * 5);

		int [] locations = {randomNum, randomNum+1, randomNum+2};

		dot.setLocationCells(locations);

		booleanisAlive = true;

		While (isAlive == true) {
			String guess = helper.getUserInput("Enter a number");
			String result = dot.checkYourself(guess);
			numOfGuesses++;

			if (result.equal("Kill")) {
				isAlive = false;

				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}

	}
}