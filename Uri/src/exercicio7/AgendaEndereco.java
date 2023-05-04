package exercicio7;

import javax.swing.JOptionPane;

public class AgendaEndereco{

    private int maxContatos;
    private int contContatos;
    private Contato [] contatos;

    public AgendaEndereco() {
    	this(1000);
    }
    public AgendaEndereco(int maxContatos){
       this.maxContatos = maxContatos;
       this.contContatos = 0;
       this.contatos = new Contato[maxContatos];
    }
    public Endereco pesquisaEndereco(String nomeContato) {
    	for (int k=0; k<contContatos; k++) {
    		Contato c = this.contatos[k];
    		if(c.getNome().equalsIgnoreCase(nomeContato)) {
    			return c.getEndereco();
    		}
    	}
		return null;
    }
    public boolean cadastraContato(Contato c) {
  	  if(this.contContatos < maxContatos) {
		  this.contatos[contContatos] = c;
		  contContatos++;
		  return true;
	  } else {
		  return false;
		  
	  }
    }
   
    public static void main(String [] args){
      AgendaEndereco agenda = new AgendaEndereco(1000);
      boolean sair = false;
      while (!sair) {
         int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n1. Cadastrar contato\n2. Pesquisar endereço\n3.Pesquisar moradores do bairro\n4. Pesquisar contatos começados com ...\n5. Sair"));
         if (opcao==1){ 
            //...TODO: COMPLETAR
        	 String nome = JOptionPane.showInputDialog("qual seu nome? ");
        	 String logradouro = JOptionPane.showInputDialog("qual seu logradouro? ");
        	 String numero = JOptionPane.showInputDialog("qual seu numero? ");
        	 String bairro = JOptionPane.showInputDialog("qual seu bairro? ");
        	 String cidade = JOptionPane.showInputDialog("qual seu cidade? ");
        	 String estado = JOptionPane.showInputDialog("qual seu estado? ");
        	 Endereco end = new Endereco(logradouro, numero, bairro, cidade, estado);
        	 Contato c = new Contato(nome, end);
        	 agenda.cadastraContato(c);
         } else if (opcao ==2){
        	 String nomeContato = JOptionPane.showInputDialog("qual o nome? ");
        	 Endereco enderecoAchado = agenda.pesquisaEndereco(nomeContato);
        	 if(enderecoAchado != null) {
        		 JOptionPane.showMessageDialog(null,enderecoAchado.toString());
        		 JOptionPane.showMessageDialog(null,"nome encontrado ");
        	 } else {
        		 JOptionPane.showMessageDialog(null,"nome não encontrado ");
        	 }
            
         } else if (opcao ==5){
             sair = true;
         }   

      }
      
   }
}