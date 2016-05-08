public class BeerSong{
	public static void main(String[] args){
		int numberOfBottlesOfBeerOnTheWall = 99;
		//String numberOfBottlesOfBeerOnTheWall;
		String word = "bottle";
		String firstText = " bottles of beer on the wall, ";
		String secondText = " bottles of beer.";
		String thirdText = "You take one down, you pass it around, ";


		while(numberOfBottlesOfBeerOnTheWall > 0){

			
			
			if(numberOfBottlesOfBeerOnTheWall == 1){
				firstText = ", bottle of beer on the wall ";
				secondText = " bottle of beer.";

			}

			System.out.println(numberOfBottlesOfBeerOnTheWall + firstText + numberOfBottlesOfBeerOnTheWall + secondText);
			numberOfBottlesOfBeerOnTheWall -= 1;

			if(numberOfBottlesOfBeerOnTheWall == 1){
				firstText = ", bottle of beer on the wall ";
				secondText = " bottle of beer.";

			}

			if(numberOfBottlesOfBeerOnTheWall == 0){
				firstText = ", bottles of beer on the wall ";
				secondText = " bottles of beer.";

			}

			System.out.println(thirdText + numberOfBottlesOfBeerOnTheWall + firstText);
			System.out.println("");
			
			
		}
	}
}