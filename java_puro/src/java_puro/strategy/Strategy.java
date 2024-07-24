package java_puro.strategy;

/**
 * A interface Strategy define o método que todas as estratégias de movimento
 * devem implementar. Este é o núcleo do padrão Strategy, permitindo que
 * diferentes comportamentos sejam intercambiáveis.
 */
public interface Strategy {
	void move();
}
