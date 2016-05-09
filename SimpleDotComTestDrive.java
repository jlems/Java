public class SimpleDotComTestDrive{


	public static void main(String[] args){
		// idea is to write a test code that will test the code we have in mind of writing.

	 	// step 1: create a simpledotcom obejct

	 	SimpleDotCom dotcom = new SimpleDotCom();

	 	// step 2: create the list that will hold the location of the object

	 	int[] locCells = {2,3,4};

	 	dotcom.setLocation(locCells);

	 	String result = dotcom.checkYourself("5");

	 	if(result == "miss")
	 		System.out.println("checkYourself method is working.");
	 	
	 	else
	 		System.out.println("checkYourself method is not working.");
	 	

	 	
 	}
}