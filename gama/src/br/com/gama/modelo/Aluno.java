package br.com.gama.modelo;

public class Aluno {

	private String nome;
	private int matricula;
	private String email;
	private String fone;
	private String endereco;
	
	
	
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, int matricula, String email, String fone, String endereco) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}

	public Aluno(int matricula) {
		this.matricula=matricula;
			
	}
	
	public String getUsuario() {
		if (email.contains("@")==true) {
			return email.substring(0, email.indexOf("@"));
		}
		return "Email incompleto";
		
	}
	
	
	public void setAll(Endereco endereco, String nome, int matricula, String email, String fone) {
		this.endereco = endereco;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
	}
	
	public String toString() {
		return "Aluno [nome=" + nome
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String retornarNome() {
		return nome;
}

	public void preencherNome(String nome) {
		this.nome = nome;
	}
	
}
