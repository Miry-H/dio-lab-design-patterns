package java_puro.singleton;

/**
 * A classe SingletonLazy é uma implementação do padrão Singleton com
 * inicialização preguiçosa. Isso significa que a instância única da classe é
 * criada apenas quando é necessária pela primeira vez, economizando recursos
 * até que a instância seja realmente utilizada.
 */
public class SingletonLazy {

	// A variável estática que mantém a única instância da classe SingletonLazy
	private static SingletonLazy instance;

	/**
	 * O construtor é declarado como privado para evitar a criação de múltiplas
	 * instâncias da classe. Essa é uma prática padrão no padrão Singleton,
	 * assegurando que a instância só possa ser criada a partir do método estático
	 * getInstance().
	 */
	private SingletonLazy() {
		super();
	}

	/**
	 * Método estático que retorna a única instância da classe. Se a instância não
	 * existir, ela é criada. Esse método garante que apenas uma instância da classe
	 * seja criada (lazy initialization).
	 *
	 * @return a instância única de SingletonLazy
	 */
	public static SingletonLazy getInstance() {
		if (instance == null) {
			// Cria a instância única da classe na primeira vez que for chamada
			instance = new SingletonLazy();
		}

		// Retorna a instância única da classe
		return instance;
	}

}
