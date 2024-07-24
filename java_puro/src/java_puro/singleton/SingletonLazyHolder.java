package java_puro.singleton;

/**
 * A classe SingletonLazyHolder é uma implementação do padrão Singleton
 * utilizando o "Lazy Initialization Holder Class". Esse padrão é considerado a
 * maneira mais eficiente e thread-safe de implementar singletons em Java. A
 * instância única é criada de forma lazy (somente quando é necessária pela
 * primeira vez), e a inicialização é garantida ser thread-safe sem a
 * necessidade de sincronização explícita.
 */
public class SingletonLazyHolder {

	/**
	 * A classe interna estática InstanceHolder contém a instância única de
	 * SingletonLazyHolder. A classe é carregada apenas quando é acessada,
	 * garantindo a criação lazy da instância.
	 */
	private static class InstanceHolder {
		// A instância única de SingletonLazyHolder, criada quando a classe
		// InstanceHolder é carregada.
		public static SingletonLazyHolder instance = new SingletonLazyHolder();
	}

	/**
	 * O construtor é declarado como privado para evitar a criação de múltiplas
	 * instâncias da classe. Essa é uma prática padrão no padrão Singleton,
	 * assegurando que a instância só possa ser criada a partir do método estático
	 * getInstance().
	 */
	private SingletonLazyHolder() {
		super();
	}

	/**
	 * Método estático que retorna a única instância da classe. A instância é criada
	 * apenas quando o método é chamado pela primeira vez, utilizando a classe
	 * interna InstanceHolder para garantir a inicialização thread-safe e eficiente.
	 *
	 * @return a instância única de SingletonLazyHolder
	 */
	public static SingletonLazyHolder getInstance() {
		return InstanceHolder.instance;
	}

}