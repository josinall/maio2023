package outrosProjetos;

import outrosProjetos.Endereco;

public class Contato {                 // um contato 
	private String nome;
	private Endereco endereco;        // nome e endereco get set to string
	
	public Contato (String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	public Contato() {
		this("", new Endereco());//chamo construtor de Endereco
	}
	public String getNome( ) {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String toString() {
		return "contato de nome"+this.nome+"e"+this.endereco.toString();
		
	}

}
