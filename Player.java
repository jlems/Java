public class Player{
	public int guessedNumber = 0;


    public void guess(){
    	this.guessedNumber = (int) (Math.random() * 100);
    }

    
}