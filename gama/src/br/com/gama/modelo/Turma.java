package br.com.gama.modelo;

public class Turma {
	
	private String sigla;
	private String periodo;
	private Curso curso;
	private Aluno aluno;
	private Professor professor;
	
	
	public String getResumo() {
		return
				
				"Aluno: " + aluno.getNome() +
				"\nProfessor: " + professor.getNome() + 
				"\nCurso: " + curso.
		
	}
	

}
