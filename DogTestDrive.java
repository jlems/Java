public class DogTestDrive{
	public static void main(String[] args){

		Dog dog1 = new Dog(); // dog1 is a reference to a Dog object
		dog1.bark();  // even though dog1 doesn't have a name, it can still bark. His name is null. 
		dog1.name = "Bart";

		Dog[] myDogs = new Dog[3]; // myDogs is a reference to an array of Dog objects. There are 3 Dog objects in this array. Each
								   // element of this array is a reference to a Dog object. Right now, the Dog objects do not exist. 

		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		//System.out.println("Last dog's name is " + myDogs[2].name);
		//myDogs[2].bark();

		int x = 0;

		while(x < myDogs.length){
		 	myDogs[x].bark();
		 	x += 1;
		}
	}
}