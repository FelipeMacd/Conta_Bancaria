package conta.model;

public class ContaCorrente extends Conta {
	
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
		
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) { //Ainda está confuso, perguntar: porque usar o this. ao invés de limite.get..
		
		if(this.getSaldo() + this.getLimite() < valor) { //this. usado em função do objeto "limite" para referenciar que é ele que está sendo usado.
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de crédito: "+this.limite);
	}
	
}
