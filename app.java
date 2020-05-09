import java.util.ArrayList;
import java.util.List;

public class app {

	public static void main(String[] args) throws BadGirlException {
		// Declared variable
		int time;
		// Initialised variable
		time = 3;
		Semah semahObject = new Semah();
		semahObject.drinkMilk();
		System.out.println(semahObject.isBipedal());		//true
		
		Human personObject = new Human();
		personObject.drinkMilk();
		personObject.isBipedal();
		Dog dogObject = new Dog();
		
		List <Mammal>listOfMammals = new ArrayList();
		listOfMammals.add(dogObject);
		listOfMammals.add(personObject);
		
		for(Mammal eachMammal: listOfMammals) {
			eachMammal.communicate();
		}
		
		Mammal mammal = new Mammal();
		mammal.drinkMilk();
		
		try {
			time++;
			semahObject.sleepIn(time);
			throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("RuntimeExc caught");
		} 
	}

}
