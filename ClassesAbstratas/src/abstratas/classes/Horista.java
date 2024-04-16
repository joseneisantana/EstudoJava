package abstratas.classes;

public class Horista extends Empregado {
	
	
	private  Double precoDaHora;
	
	private  Double TotalHoraTrabalhada;

	@Override
	public Double vencimento() {
		// TODO Auto-generated method stub
		return precoDaHora*TotalHoraTrabalhada;
	}

	public Double getPrecoDaHora() {
		return precoDaHora;
	}

	public void setPrecoDaHora(Double precoDaHora) {
		this.precoDaHora = precoDaHora;
	}

	public Double getTotalHoraTrabalhada() {
		return TotalHoraTrabalhada;
	}

	public void setTotalHoraTrabalhada(Double totalHoraTrabalhada) {
		TotalHoraTrabalhada = totalHoraTrabalhada;
	}
	
	

}
