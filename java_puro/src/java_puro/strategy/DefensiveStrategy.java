package java_puro.strategy;

public class DefensiveStrategy implements Strategy {

	@Override
	public void move() {
		System.out.println("Moving defensively...");
	}

}
