package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Turma;

public class TesteTurma2 {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	
	public static void main(String[] args) {
		Turma turma = new Turma(
				JOptionPane.showInputDialog("Sigla turma"),
				JOptionPane.showInputDialog("Periodo"),
				new Curso(
						JOptionPane.showInputDialog("Sigla curso")
						"Java Gama",
						true,
						Floa.parseFloat(JOptionPane.showInputDialog("Valor))
						(byte) 6
						),
				new Aluno(
						"REGINA",
						12345,
						"bruna@gama.academy",
						"1234-5678",
						),						),
				new Professor(
						"CLEBERSON",
						"ENGENHEIRO",
						"EXATAS",
						new Endereco(
								
								
								)
						)
				);
			
		System.out.println(turma.toString());
		
	}}