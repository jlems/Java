import java.util.*;

public class DotComBust{
	public static void main(String[] args){
		// 1: create the instance variables
		private GameHelper helper = new GameHelper(); 
		private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
		private int numOfGuesses = 0;

		private void setUpGame();{
			//first make some dotcom objects and give them names
			DotCom one = new DotCom();
			DotCom two = new DotCom();
			DotCom three = new DotCom();

			one.setName("Pets.com");
			two.setName("eToys.com");
			three.setName("Go2.com");

			//now add these dotcom objects to the dotcomeList 
			dotComList.add(one);
			dotComList.add(two);
			dotComList.add(three);

			System.out.println("Your goal is to sink three dot coms.");
			System.out.println("Pets.com, eToys.com, Go2.com");
			System.out.println("Try to sink them all in the fewest number of Guesses.");

			// now call the helper method to get a random location for these dotcome objects and then
			// use the setLocation method from the Dotcom class to actually set their locations

			
		}

	}
}