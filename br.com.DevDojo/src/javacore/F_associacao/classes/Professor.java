package javacore.F_associacao.classes;

public class Professor {
	
	private Seminario[] seminarios;
	private String nome;
	private String especialidade;
	
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public Professor() {
		
	}
	
	public void imprime() {
		
		if(this.nome != null) {
			System.out.println("Nome: "+this.nome);
		}
		else
			System.out.println("Nome: não registrado.");
		
		
		if(this.especialidade != null) {
			System.out.println("Especialidade: "+this.especialidade);
		}
		else
			System.out.println("Especialidade: não registrado.");
		
		
		if(this.seminarios != null) {
			System.out.println("Seminarios participantes:");
			for(Seminario seminario: this.seminarios) {
				System.out.println(seminario.getTitulo());
			}
			return;
		}
			System.out.println("Seminarios participantes: nem um.");
	}
		
	
	public Seminario[] getSeminarios() {
		return seminarios;
	}
	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	

}
