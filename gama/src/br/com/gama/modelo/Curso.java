package br.com.gama.modelo;

public class Curso {
	
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
		valor=valor+valor*(porcentagem/100);
	}

	@Override
	public String toString() {
		return "Curso [sigla=" + sigla
	}
	
}
