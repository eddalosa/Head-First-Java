import java.util.*;
public class DotcomBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom>  dotComsList= new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame() {
		//first make some dotcoms and give the locatiobs
		DotCom one = new Dotcom ();
		one.setName("Pets.com");
		DotCom two = new Dotcom ();
		two.setName("eToys.com");
		DotCom three = new Dotcom ();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);

		System.out.println("Your goal is to sink the three dot coms.");
		System.out.println("Pets.com. eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses.");

		for (DotCom dotComToSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}

	}

	private void startPlaying() {
		while(!dotComList.isEmpty()) {
			String userGuess = helper.getUseInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";

		for (DotCom dotComToSet : dotComList) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equal("hit")) {
				break;
			}
			if (result.equal("kill")) {
				dotComList.remove(dotComToSet);
				break;
			}
		}
		System.out.println(result);
	}

	private void finishGame () {
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if (numOfGuess <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got our before your options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}
}