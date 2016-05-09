class GoodDog{
	private int size;

	
	public void bark(){
		if(size > 60){
			System.out.println("Woof! Wooof!");
		}
		else if(size > 14){
			System.out.println("Ruff! Rufff!");
		}

		else{
			System.out.println("Yip! Yip!");
		}
	}


	public void setSize(int x){
		size = x;
		return;
	}

	public int getSize(){
		return size;
	}


}