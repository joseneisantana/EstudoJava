package abstratas.classes;

public class Programa {

	public static void main(String[] args) {
		
		Assalariado empregado = new Assalariado();
		empregado.setCpf("1");
		empregado.setNome("Brandon");
		empregado.setSobrenome("Covenat");
		empregado.setSalario(100d);
		
		System.out.println(empregado.getNome()+"Tem de salario :"+ empregado.vencimento()); 
		
		
		Comissionado comissionado = new Comissionado();
		comissionado.setCpf("15");
		comissionado.setNome("Brunaon");
		comissionado.setSobrenome("Covenat");
		comissionado.setTotalVenda(2000d);
		comissionado.setTotalcomissao(01d);
		
		System.out.println(comissionado.getNome()+"Tem de salario :"+ comissionado.vencimento()); 
		
		Horista horista = new Horista();
		horista.setCpf("40");
		horista.setNome("terezaia");
		horista.setSobrenome("Covenat");
		horista.setPrecoDaHora(100d);;
		horista.setTotalHoraTrabalhada(60d);
		
		System.out.println(horista.getNome()+"Tem de salario :"+ horista.vencimento()); 
	}

}
