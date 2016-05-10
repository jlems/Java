import java.util.ArrayList;

public class DotComBust{
	public static void main(String[] args){
		SimpleDotCom dotcom = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		int startingLocation = (int) (Math.random() * 10);

		ArrayList<Integer> locCells = {startingLocation,startingLocation + 1,startingLocation + 2};
		
		//dotcom.setLocation(locCells);
		dotcom.setLocation(locCells1);


		boolean gameActive = true;
		String usedNumbers = "";
		String result = "miss";
		int numberOfTries = 0;
		while(gameActive){
			String userInput = helper.getUserInput("Enter a number between 0 and 10.");

			if(usedNumbers.contains(userInput)){
				System.out.println("You've already used that number. Pick another number!");
				continue;
			}

			if(Integer.parseInt(userInput) < 0 && Integer.parseInt(userInput) > 9)
				System.out.println("Number must be between 0 and 9.");

			else{
				usedNumbers += userInput;

				result = dotcom.checkYourself(userInput);
				if(result == "miss"){
					System.out.println("You missed. Enter another number.");
					numberOfTries++;
				}
				else if(result == "hit"){
					System.out.println("Hit. Enter another number");
					numberOfTries++;
				}
				else{
					System.out.println("You win!");
					numberOfTries++;
					System.out.println("It took you " + numberOfTries + " tries to win.");
					gameActive = false;
				}
			}
		}
	}
}