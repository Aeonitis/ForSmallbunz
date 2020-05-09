// Subclass
public class Semah extends Human {
	
	String sleepIn(int bedtime) throws BadGirlException {
		System.out.println("Watched Netflix");
		throw new BadGirlException("It's Ramadan... at " + bedtime);
	}

}
