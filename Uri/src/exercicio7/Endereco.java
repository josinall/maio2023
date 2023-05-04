package exercicio7;

public class Endereco {
	//atributos
		private String logradouro;
		private String numero;
		private String bairro;
		private String cidade;
		private String estado;
		//construtor 1
		public Endereco() {
			this.logradouro = "";
			this.numero = "";
			this.bairro = "";
			this.cidade = "";
			this.estado = "";
		}
		//contrutor 2
		public Endereco(String logradouro,String numero,String bairro,String cidade,String estado ) {
			this.logradouro = logradouro;
			this.numero = numero;
			this.bairro = bairro;
			this.cidade = cidade;
			this.estado = estado;
		}
		public String getLogradouro() {
			return this.logradouro;
		}
		
		public void setLogradouro(String novoLogradouro) {
			this.logradouro = novoLogradouro;
		}
		public String getNumero() {
			return this.numero;
		}
		
		public void setNumero(String novoNumero) {
			this.numero = novoNumero;
		}
		public String getBairro() {
			return this.bairro;
		}
		
		public void setBairro(String novoBairro) {
			this.bairro = novoBairro;
		}
		public String getCidade() {
			return this.cidade;
		}
		
		public void setCidade(String novoCidade) {
			this.cidade = novoCidade;
		}
		public String getEstado() {
			return this.estado;
		}
		
		public void setEstado(String novoEstado) {
			this.estado = novoEstado;
		}
		public String toString() {
			return "Endereco [logradouro=" + logradouro +", numero=" + numero+ ", bairro=" +bairro+
				"]";
		}
		

}
		
