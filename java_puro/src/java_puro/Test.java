package java_puro;

import java_puro.singleton.SingletonEager;
import java_puro.singleton.SingletonLazy;
import java_puro.singleton.SingletonLazyHolder;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
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
		
	}

}
