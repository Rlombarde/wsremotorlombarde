package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;

public class TesteAluno {

	public static void main(String [] args) {
		
		Aluno aluno = new Aluno();
		aluno.setEndereco(endereco);
		aluno.setEmail(JOptionPane.showInputDialog("Email:").toLowerCase());
		aluno.setFone(JOptionPane.showInputDialog("Fone:"));
		aluno.setNome(JOptionPane.showInputDialog("Nome:").toUpperCase());
		aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("matricula:")));
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Email: " + aluno.getEmail());
		System.out.println("Fone: " + aluno.getFone());
		System.out.println("Matricula: " + aluno.getMatricula());		
		System.out.println("Endereco: " + aluno.getEndereco());
		
		//OU
		
		Aluno aluno2 = new Aluno();
		aluno2.setAll(
			endereco,
			JOptionPane.showInputDialog("Nome2").toUpperCase(),
			Integer.parseInt(JOptionPane.showInputDialog("Matricula2")),
			JOptionPane.showInputDialog("Email2").toLowerCase(),
			JOptionPane.showInputDialog("Telefone2"),
			
			
			
			System.out.println(aluno2.toString());
				
				System.out.println("Bairro: " + aluno.getEndereco().getBairro());
				System.out.println("Cidade: " + aluno.getEndereco().getCidade());
		
	}
	
	
	
	
	
}
