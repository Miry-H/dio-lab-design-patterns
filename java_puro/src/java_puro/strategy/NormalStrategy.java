package java_puro.strategy;

public class NormalStrategy implements Strategy {

	@Override
	public void move() {
		System.out.println("Moving normally...");
	}

}
