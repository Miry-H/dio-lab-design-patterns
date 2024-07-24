package java_puro.facade;

import java_puro.facade.subsystem1.LightControl;
import java_puro.facade.subsystem2.HeatingControl;
import java_puro.facade.subsystem3.SecuritySystem;

/**
 * Facade: Sistema de Controle de Casa Inteligente
 * 
 * A classe SmartHomeFacade é uma implementação do padrão de design Facade. O
 * objetivo deste padrão é fornecer uma interface simplificada para um conjunto
 * complexo de subsistemas. No contexto deste exemplo, a "fachada" permite que o
 * usuário controle a luz, o aquecimento e o sistema de segurança da casa de
 * maneira simples e coesa. Em vez de interagir diretamente com cada subsistema,
 * o usuário interage apenas com a fachada, que oculta a complexidade dos
 * detalhes internos e oferece uma interface fácil de usar.
 */
public class SmartHomeFacade {
	// Instâncias dos subsistemas
	private LightControl lightControl;
	private HeatingControl heatingControl;
	private SecuritySystem securitySystem;

	/**
	 * Construtor da Facade que instancia os subsistemas necessários. O construtor
	 * inicializa as instâncias dos subsistemas LightControl, HeatingControl e
	 * SecuritySystem. A Facade é responsável por simplificar a interação com esses
	 * subsistemas, fornecendo uma interface unificada.
	 */
	public SmartHomeFacade() {
		this.lightControl = new LightControl();
		this.heatingControl = new HeatingControl();
		this.securitySystem = new SecuritySystem();
	}

	/**
	 * Método para iniciar o dia, que utiliza os subsistemas para configurar a casa.
	 * Este método demonstra como a Facade fornece uma interface simplificada ao
	 * combinar operações de múltiplos subsistemas. A chamada aos métodos dos
	 * subsistemas é feita de forma sequencial para configurar a casa para o início
	 * do dia.
	 */
	public void startDay() {
		lightControl.turnOnLights(); // Liga as luzes
		heatingControl.turnOffHeating(); // Desliga o aquecimento
		securitySystem.deactivateSecurity(); // Desativa o sistema de segurança
		System.out.println("Good morning! Everything is set for the day.");
	}

	/**
	 * Método para encerrar o dia, que utiliza os subsistemas para preparar a casa
	 * para a noite. Este método mostra como a Facade simplifica operações complexas
	 * ao reunir chamadas para os subsistemas em um único método. A chamada aos
	 * métodos dos subsistemas é feita de forma sequencial para preparar a casa para
	 * a noite.
	 */
	public void endDay() {
		lightControl.turnOffLights(); // Apaga as luzes
		heatingControl.turnOnHeating(); // Liga o aquecimento
		securitySystem.activateSecurity(); // Ativa o sistema de segurança
		System.out.println("Good night! Your home is secure.");
	}
}