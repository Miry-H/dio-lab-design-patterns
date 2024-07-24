package java_puro;

import java_puro.facade.SmartHomeFacade;
import java_puro.singleton.SingletonEager;
import java_puro.singleton.SingletonLazy;
import java_puro.singleton.SingletonLazyHolder;
import java_puro.strategy.AggressiveStrategy;
import java_puro.strategy.DefensiveStrategy;
import java_puro.strategy.NormalStrategy;
import java_puro.strategy.Robot;
import java_puro.strategy.Strategy;

public class Test {

	public static void main(String[] args) {

		System.out.println("Singleton");

		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);

		System.out.println("\nStrategy - robot example");

		Strategy defensive = new DefensiveStrategy();
		Strategy normal = new NormalStrategy();
		Strategy aggressive = new AggressiveStrategy();

		Robot robot = new Robot();
		robot.setStrategy(normal);
		robot.move();
		robot.setStrategy(defensive);
		robot.move();
		robot.setStrategy(aggressive);
		robot.move();
		robot.move();

		System.out.println("\nFacade - Smart Home example");

		SmartHomeFacade smartHome = new SmartHomeFacade();
		smartHome.startDay();
		smartHome.endDay();

	}

}
