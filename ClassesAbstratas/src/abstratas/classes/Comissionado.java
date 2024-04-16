package abstratas.classes;

public class Comissionado extends Empregado{

	private double totalVenda;
	private double totalcomissao;
	
	
	@Override
	public Double vencimento() {
		// TODO Auto-generated method stub
		return totalVenda*totalcomissao;
	}


	public double getTotalVenda() {
		return totalVenda;
	}


	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}


	public double getTotalcomissao() {
		return totalcomissao;
	}


	public void setTotalcomissao(double totalcomissao) {
		this.totalcomissao = totalcomissao;
	}
	

	
	
}
