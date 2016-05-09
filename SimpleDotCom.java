public class SimpleDotCom{
	private int[] locationCells; // the cells where the dotCom will be
	public int numberOfHits; // number of hits on the dotcom


	String checkYourself(String guess){
		String result = "miss";
		int userGuess = Integer.parseInt(guess);
		for(int location : locationCells){
			if(userGuess == location){
				System.out.println("You got a hit at location " + location + "!");
				numberOfHits++;
				result = "hit";
				return result;
			}
		}
		System.out.println("You missed! Enter another guess.");
		return result;
	}
	

	void setLocation(int[] x){
		locationCells =  x;
	}
}