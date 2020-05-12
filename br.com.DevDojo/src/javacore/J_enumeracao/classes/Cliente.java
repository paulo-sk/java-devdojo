package javacore.J_enumeracao.classes;

public class Cliente {
	
	public enum TipoPagamento{
		A_VISTA, A_PRAZO;
	}
	
	private String nome;
	private TipoCliente tipo;
	private TipoPagamento tipoPagamento;
	
	public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipo = tipo;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipo=" + tipo.getNome() + ", numero do tipo=" + tipo.getTipo() +", tipoPagamento=" + tipoPagamento + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoCliente getTipo() {
		return tipo;
	}
	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}
	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

}
