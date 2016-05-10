public class SimpleDotCom{
	private int[] locationCells; // the cells where the dotCom will be
	public int numberOfHits; // number of hits on the dotcom


	public String checkYourself(String guess){
		String result = "miss";
		int userGuess = Integer.parseInt(guess);
		for(int location : locationCells){
			if(userGuess == location){
				numberOfHits++;
				result = "hit";
			}
		}
		if(numberOfHits == locationCells.length){
			result = "kill";
			return result;
		}	

		return result;
	}
	

	void setLocation(int[] x){
		locationCells =  x;
	}
}