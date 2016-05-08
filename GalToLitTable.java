public class GalToLitTable{
	public static void main(String[] args){
		//liters = gallons * 3.7854;  


		for(int i = 1; i < 101; i++){
			double liters = i * 3.7854;
			String word = "gallon";

			//System.out.println("i is " + i);
			if(i != 1){
				word += "s";
			}

			if((i-1) % 10 == 0){
				System.out.println("");
			}

			System.out.println(i  + " " + word + " is equal to " + liters + " liters." );
		}
	}
}