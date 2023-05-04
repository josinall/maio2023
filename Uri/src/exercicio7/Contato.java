package exercicio7;

public class Contato {
	private String nome;
	private Endereco end;// devo criar uma nova classe com atributos, construtores e metodos
	//construtor 1
	public Contato() {
		this.nome = "";
		this.end = new Endereco();//decaro novo tipo chamando o construtor da classe endereco
		
	}//construtor 2
	public Contato(String nome,Endereco end) {
		this.nome = nome;
		this.end = end;
		
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public Endereco getEndereco() {
		return end;
	}
	public void setEndereco(Endereco novoEnd) {
		this.end = novoEnd;
	}
	public String toString() {
		return "lourdes";
	}
	

}
