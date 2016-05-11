import java.util.*;

public class DotComBust{
	public static void main(String[] args){
		// 1: create the instance variables
		private GameHelper helper = new GameHelper(); 
		private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
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
			dotComsList.add(one);
			dotComsList.add(two);
			dotComsList.add(three);

			System.out.println("Your goal is to sink three dot coms.");
			System.out.println("Pets.com, eToys.com, Go2.com");
			System.out.println("Try to sink them all in the fewest number of Guesses.");

			
			for(DotCom dotCom : dotComsList){ // for each dotCom object in the ArrayList named 									 // dotComList
				// make an ArrayList of String called new location. Note that this will be 
				// different for every dotcom in dotComList because each dotCom in this 
				// ArrayList is pointing to a different object on the heap. 
				ArrayList<String> newLocation = new ArrayList<String>(); 
				
				// using the newlocation arraylist, set the newlocation for the current dotcom object.
				dotCom.setLocation(newLocation); 
			}

			private void startPlaying(){
				while(!dotComsList){
					String userGuess = helper.getUserInput("Enter a guess");
					checkUserGuess(userGuess);
				}
			}

			private void checkUserGuess(String userGuess){
				numOfGuesses++; // increment number of guesses for each object
				String result = "miss"// assume that the guess is a miss
				for(DotCom dotCom : dotComsList){ // for each dotCom object in dotComsList
					//use the checkUserGuessMethod with the userGuess passed from the
					//startPlaying function. Save the return value in the variable
					// called result. 
					String result = dotCom.checkUserGuess(userGuess);
					if(result.equals("hit")){
						break; // if there's a hit, no need to check the rest of the array.
					}
					if(result.equals("kill")){
						//if there is a kill, remove the dotcom from the dotComsList.
						dotComsList.remove(dotCom); 
						break;

					}
				}
				System.out.println(result);
			}
		}


	}
}