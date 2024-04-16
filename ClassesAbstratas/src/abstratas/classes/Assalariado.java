package abstratas.classes;

public class Assalariado  extends Empregado {

	private Double salario;

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public Double vencimento() {
		// TODO Auto-generated method stub
		return salario;
	}
	
	
	
}
