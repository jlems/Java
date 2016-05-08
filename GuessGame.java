import java.util.Random;

public class GuessGame{
	public int correctNumber = 0;
	
	
	

	
		public void correctAnswer(){
			this.correctNumber = (int) (Math.random() * 100);
		}




		public void startGame(){
			Player player1 = new Player();
			Player player2 = new Player();
			Player player3 = new Player();
			GuessGame actualGame = new GuessGame();

			actualGame.correctAnswer();


			int correctAnswer = actualGame.correctNumber;

			;


			boolean gameContinues = true;
			int count = 0;
			while(gameContinues){

				player1.guess();
				player2.guess();
				player3.guess();

				boolean p1GuessCorrectly = false;
				boolean p2GuessCorrectly = false;
				boolean p3GuessCorrectly = false;


				int p1Guess = player1.guessedNumber;
				int p2Guess = player2.guessedNumber;
				int p3Guess = player3.guessedNumber;

				if(p1Guess == correctAnswer){
					p1GuessCorrectly = true;
				}

				if(p2Guess == correctAnswer){
					p2GuessCorrectly = true;
				}

				if(p3Guess == correctAnswer){
					p3GuessCorrectly = true;
				}

				if(p1Guess == correctAnswer || p2Guess == correctAnswer || p3Guess == correctAnswer){
					System.out.println("there is a winner");
					System.out.println("Player 1 guessed Correctly? " + p1GuessCorrectly);
					System.out.println("Player 2 guessed Correctly? " + p2GuessCorrectly);
					System.out.println("Player 3 guessed Correctly? " + p3GuessCorrectly);
					gameContinues = false;
				}

				else{
					System.out.println("Players have to guess again");
				}
				
			}
		}





}