/**
 * Superclass & Subclass
 */
public class Human extends Mammal {
	
	void communicate() {
		talk();
	}
	
	void talk() {
		System.out.println("I say!");
	}
	
	boolean isBipedal() {
		return true;
	}
}
