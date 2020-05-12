package javacore.F_associacao.classes;

public class Seminario {
	
	private Estudante[] estudantes;
	private Local local;
	private Professor professor;
	
	private String titulo;
	
	
	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	
	public Seminario() {
		
	} 
	
	public void imprime() {
		System.out.println("======================Seminario=======================");
		System.out.println("Titulo: "+this.titulo);
		
		System.out.println();
		
		if(this.local != null) {
			System.out.println("===================Local==================");
			System.out.println("Rua "+this.local.getRua());
			System.out.println("Bairro "+this.local.getBairro());
		}
		else
			System.out.println("Local: sem local registrado.");
		
		System.out.println();
		
		if(this.professor != null) {
			System.out.println("====================Professor==============");
			System.out.println("Nome: "+this.professor.getNome());
			System.out.println("Especialidade: "+this.professor.getEspecialidade());
		}
		else {
			System.out.println("Professor: nenhum não registrado.");
		}
		
		System.out.println();
		
		if(this.estudantes != null) {
			int count = 0;
			System.out.println("==============Estudantes==============");
			for(Estudante estudantes: this.estudantes) {
				System.out.println("Nome: "+estudantes.getNome()+",Idade: "+estudantes.getIdade());
				count++;
			}
			System.out.println("Total de estudantes: "+count);
			return;
		}
		 
		System.out.println("Estudantes: nenhum estudante registrado.");
		
		
		
		
	}
	
	public Estudante[] getEstudantes() {
		return estudantes;
	}
	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	
}
