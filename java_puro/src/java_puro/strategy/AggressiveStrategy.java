package java_puro.strategy;

public class AggressiveStrategy implements Strategy {

	@Override
	public void move() {
		System.out.println("Moving aggressively...");
	}

}
