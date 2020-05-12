package javacore.M_polimorfismo.classes;

public class RelatorioPagamento {
	
	//esse codigo abaixo seria necessario, sem polimorfismo
	/*
	 * public void relatorioPagamentoGerente(Gerente gerente) {
	 * System.out.println("Gerando relatório de pagamento para gerencia:");
	 * gerente.calculaPagamento(); System.out.println("Nome: "+gerente.getNome());
	 * System.out.println("Salario desse mes: "+gerente.getSalario()); }
	 * 
	 * public void relatorioPagamentoVendedor(Vendedor vendedor) {
	 * System.out.println("Gerando relatório de pagamento para vendedores:");
	 * vendedor.calculaPagamento(); System.out.println("Nome: "+vendedor.getNome());
	 * System.out.println("Salario desse mes: "+vendedor.getSalario()); }
	 */
	
	
	//nesse parametro, funcionario é convertido para p ou g implicitamente.
	//basicamente, funcionario vai fazer referencia ao objeto de Gerente ou Vendedor
	//abaixo, estamos usando coiceito de polimorfismo
	public void relatorioPagamenteGenerico(Funcionario funcionario) {
		System.out.println("Gerando relatório de pagamento:");
		funcionario.calculaPagamento();
		System.out.println("Nome: "+funcionario.getNome());
		
		//fazendo casting explicito, e usando if para casos de instancias diferentes
		if(funcionario instanceof Gerente) {
			Gerente g = (Gerente) funcionario;
			System.out.println("Salario desse mes: "+(funcionario.getSalario() - g.getPnl()));
			System.out.println("Participacão no lucro: "+g.getPnl());
			System.out.println("Salario total do mes: "+funcionario.getSalario());
		}
		else {
			Vendedor v = (Vendedor) funcionario;								      
			System.out.println("Salario desse mes: "+(funcionario.getSalario() - (v.getTotalVendas() * 0.05 )) );
			System.out.println("Total de venda e comissao (5% sobre a venda): "+v.getTotalVendas()+", " + (v.getTotalVendas() * 0.05 ));
			System.out.println("Salario total do mes: "+funcionario.getSalario());
		}
		
	}
}
