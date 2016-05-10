public class Test{
	public static void main(String[] args){
		Test c = new Test();

		c.go();
	}

	void go(){
		for(int x = 0; x < 4; x++){
			for(int y = 4; y > 2; y--){
				System.out.println(x + " " + y);
			}

			if(x == 1)
				x++;
		}
	}
}