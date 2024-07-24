package java_puro.singleton;

/**
 * A classe SingletonEager é uma implementação do padrão Singleton com inicialização antecipada.
 * Isso significa que a instância única da classe é criada no momento do carregamento da classe,
 * independentemente de quando ou se ela será realmente usada.
 */
public class SingletonEager {

	/**
	 * A variável estática que mantém a única instância da classe SingletonEager
	 * É inicializada de forma antecipada, garantindo que a instância esteja disponível
	 * imediatamente após o carregamento da classe.
	 */ 
	private static SingletonEager instance = new SingletonEager();
	
	/**
     * O construtor é declarado como privado para evitar a criação de múltiplas instâncias da classe.
     * Essa é uma prática padrão no padrão Singleton, assegurando que a instância só possa ser criada
     * a partir do método estático getInstance().
     */
	private SingletonEager() {
		super();
	}
	
	/**
     * Método estático que retorna a única instância da classe.
     * Como a instância é criada antecipadamente, este método simplesmente retorna
     * a instância já existente, garantindo que apenas uma instância da classe seja usada.
     *
     * @return a instância única de SingletonEager
     */
	public static SingletonEager getInstance() {
		return instance;
	}
}
