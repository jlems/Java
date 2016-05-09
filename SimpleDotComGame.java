import java.util.Arrays;

public class SimpleDotComGame{
	public static void main(String[] args){
		SimpleDotCom dotcom = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		int startingLocation = (int) (Math.random() * 10);
		System.out.println(startingLocation);

		int[] locCells = {startingLocation,startingLocation + 1,startingLocation + 2};
		dotcom.setLocation(locCells);
		
		boolean gameActive = true;
		String usedNumbers = "";
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

				dotcom.checkYourself(userInput);
				if(dotcom.numberOfHits == 3){
					System.out.println("You win!");
					gameActive = false;
				}
			}
		}
	}
}