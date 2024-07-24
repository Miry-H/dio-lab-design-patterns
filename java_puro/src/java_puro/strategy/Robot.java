package java_puro.strategy;

/**
 * A classe Robot utiliza o padrão Strategy para definir seu comportamento de
 * movimento. O padrão Strategy é um padrão de projeto comportamental que
 * permite a definição de uma família de algoritmos, encapsulando cada um deles
 * e tornando-os intercambiáveis. Este padrão permite que o algoritmo varie
 * independentemente dos clientes que o utilizam, promovendo a flexibilidade e o
 * desacoplamento.
 *
 * Na classe Robot, o padrão Strategy é aplicado para permitir que o robô altere
 * seu comportamento de movimento dinamicamente em tempo de execução, sem
 * alterar seu código base. Isso é alcançado através da interface Strategy, que
 * define um método move() a ser implementado por diferentes estratégias de
 * movimento.
 */
public class Robot {
	// A variável strategy mantém a estratégia atual do robô.
	private Strategy strategy;

	/**
	 * O método setStrategy permite alterar a estratégia de movimento do robô. Este
	 * método aceita uma implementação da interface Strategy, que define o
	 * comportamento de movimento. Isso permite que o comportamento do robô seja
	 * alterado em tempo de execução, sem modificar o código da classe Robot.
	 * 
	 * @param strategy a nova estratégia de movimento a ser usada
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * O método move utiliza a estratégia atual para definir como o robô deve se
	 * mover. A chamada ao método move() da estratégia permite a alteração do
	 * comportamento sem modificar a classe Robot.
	 * 
	 * O polimorfismo é aplicado aqui: o método move() é chamado na referência de
	 * interface Strategy, que pode apontar para qualquer implementação concreta
	 * dessa interface. Isso significa que a classe Robot não precisa saber qual é a
	 * implementação específica (ex.: NormalStrategy, DefensiveStrategy, etc.),
	 * apenas que a implementação possui um método move(). Assim, diferentes
	 * comportamentos podem ser executados sem que a classe Robot precise mudar.
	 */
	public void move() {
		strategy.move();
	}
}
