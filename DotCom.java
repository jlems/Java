import java.util.ArrayList

public class DotCom{
	//private int[] locationCells; // the cells where the dotCom will be
	//public int numberOfHits; // number of hits on the dotcom
	ArrayList<String> locationCells = new ArrayList<String>();
	String name = "";


	public String checkYourself(String userInput){
		String result = "miss";
		int index = locationCells.indexOf(userInput);

		if(index >= 0){
			locationCells.remove(index);
		}

		if(locationCells.isEmpty()){
			result = "kill";
			return result;
		}
	}
	

	void setLocation(ArrayList<String> x){

		locationCells1 =  x;
	}

	void setName(String n){
		name = n;
	}
}





