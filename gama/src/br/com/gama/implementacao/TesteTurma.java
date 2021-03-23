package br.com.gama.implementacao;

public class TesteTurma {

	
	public static void main(String[] args) {
		====================Professor============================
				private String nome;
					private String formacao;
					private String area;
					private Endereco endereco;
					
					public Professor() {
						super();
					}


					public Professor(String nome, String formacao, String area, Endereco endereco) {
						super();
						this.nome = nome;
						this.formacao = formacao;
						this.area = area;
						this.endereco = endereco;
					}


					public String getResumo() {
						return "Nome: " + nome + "\nFormação: " + formacao + "\nBairro: " + endereco.getBairro();
					}
					
					
					@Override
					public String toString() {
						return "Professor [nome=" + nome + ", formacao=" + formacao + ", area=" + area + ", endereco=" + endereco + "]";
					}
					public String getNome() {
						return nome;
					}
					public void setNome(String nome) {
						this.nome = nome;
					}
					public String getFormacao() {
						return formacao;
					}
					public void setFormacao(String formacao) {
						this.formacao = formacao;
					}
					public String getArea() {
						return area;
					}
					public void setArea(String area) {
						this.area = area;
					}
					public Endereco getEndereco() {
						return endereco;
					}
					public void setEndereco(Endereco endereco) {
						this.endereco = endereco;
					}
				======================================================

				====================Turma============================
				private String sigla;
					private String periodo;
					private Curso curso;
					private Aluno aluno;
					private Professor professor;
					
					public Turma() {
						super();
					}

					public Turma(String sigla, String periodo, Curso curso, Aluno aluno, Professor professor) {
						super();
						this.sigla = sigla;
						this.periodo = periodo;
						this.curso = curso;
						this.aluno = aluno;
						this.professor = professor;
					}

					public String getResumo() {
						return 
								"Aluno: " + aluno.getNome() + 
								"\nProfessor: " + professor.getNome() + 
								"\nCurso: " + curso.getDescricao() + 
								"\nTurma: " + sigla;
					}

					@Override
					public String toString() {
						return "Turma [sigla=" + sigla + ", periodo=" + periodo + ", curso=" + curso + ", aluno=" + aluno
								+ ", professor=" + professor + "]";
					}



					public String getSigla() {
						return sigla;
					}

					public void setSigla(String sigla) {
						this.sigla = sigla;
					}

					public String getPeriodo() {
						return periodo;
					}

					public void setPeriodo(String periodo) {
						this.periodo = periodo;
					}

					public Curso getCurso() {
						return curso;
					}

					public void setCurso(Curso curso) {
						this.curso = curso;
					}

					public Aluno getAluno() {
						return aluno;
					}

					public void setAluno(Aluno aluno) {
						this.aluno = aluno;
					}

					public Professor getProfessor() {
						return professor;
					}

					public void setProfessor(Professor professor) {
						this.professor = professor;
					}
				======================================================

				====================Curso============================
				private String sigla;
					private String descricao;
					private boolean ativo;
					private float valor;
					private byte duracao;
					
					public Curso() {
						super();
					}

					public Curso(String sigla, String descricao, boolean ativo, float valor, byte duracao) {
						super();
						this.sigla = sigla;
						this.descricao = descricao;
						this.ativo = ativo;
						this.valor = valor;
						this.duracao = duracao;
					}

					public void atualizarValor(float porcentagem) {
						valor = valor + valor * (porcentagem/100);
					}
					
					@Override
					public String toString() {
						return "Curso [sigla=" + sigla + ", descricao=" + descricao + ", ativo=" + ativo + ", valor=" + valor
								+ ", duracao=" + duracao + "]";
					}
					public String getSigla() {
						return sigla;
					}
					public void setSigla(String sigla) {
						this.sigla = sigla;
					}
					public String getDescricao() {
						return descricao;
					}
					public void setDescricao(String descricao) {
						this.descricao = descricao;
					}
					public boolean isAtivo() {
						return ativo;
					}
					public void setAtivo(boolean ativo) {
						this.ativo = ativo;
					}
					public float getValor() {
						return valor;
					}
					public void setValor(float valor) {
						this.valor = valor;
					}
					public byte getDuracao() {
						return duracao;
					}
					public void setDuracao(byte duracao) {
						this.duracao = duracao;
					}

		
				===========================================

				public void setAll(Endereco endereco, String nome, int matricula, String email, String fone) {
						this.endereco = endereco;
						this.nome = nome;
						this.matricula = matricula;
						this.email = email;
						this.fone = fone;
					}
		
		
		
		
		
		//Preenchendo Curso
		curso.setAtivo(true);
		curso.setDescricao("JAVA");
		curso.setDuracao( (byte) 6);
		curso.setSigla("JV");
		curso.setValor(10000));
		
		//Preenchendo Aluno
		aluno.setEmail("regina@gama.academy");
		aluno.setEndereco(endereco);
		aluno.setFone("1234-5678");
		aluno.setMatricula(1234);
		aluno.setNome("Bruna Corinthins");
		
		//Preenchendo Professor
		professor.setArea("EXATAS");
		professor.setEndereco(endereco);
		professor.setFormacao("ENGENHARIA");
		professor.setNome("CLEBAO");
		
		//Preenchendo Turma
		turma.setAluno(aluno);
		turma.setCurso(curso);
		turma.setPeriodo("VESPERTINO");
		turma.setProfessor(professor);
		turma.set("J01");
		
		/Exibindo
		System.out.printn(turma.toString());
		System.out.println("Resumo Professor: " + turma.getProfessor().getResumo());
		turma.getCurso().atualizarValor(10);
		System.out.println("Valor atualizado: " + turma.getCurso().getValor());
		System.out.println("Usuario Aluno: " + turma.getAluno().getUsuario());
		
		
	}
	
}
