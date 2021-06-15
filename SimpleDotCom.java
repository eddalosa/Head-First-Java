import java.util.ArrayList;
public class SimpleDotCom {
	private ArrayList<String> locationCells;

	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}

	public static void main(String [] args) {
		int numOfGuesses = 0;

		GameHelper helper =  new GameHelper ();

		SimpleDotCom  dot = new SimpleDotCom ();

		int randomNum = (int) (Math.random() * 5);

		ArrayList<String> locations = new ArrayList<String>();
		locations.add(String.valueOf(randomNum));
		locations.add(String.valueOf(randomNum + 1));
		locations.add(String.valueOf(randomNum + 2));

		dot.setLocationCells(locations);

		boolean isAlive = true;

		while (isAlive == true){
			String guess = helper.getUserInput("Enter a number");
			String result = dot.checkYourself(guess);
			numOfGuesses++;

			if (result.equals("kill")) {
				isAlive = false;

				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}

	}

	public String checkYourself(String userInput) {
		int index = locationCells.indexOf(userInput);
		String result = "miss";

		if (index >= 0) {
			locationCells.remove(index);

			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		System.out.println(result);
		return result;
	}
}