package outrosProjetos;

import javax.swing.JOptionPane;

public class ProgramaAgenda {
	public static void main(String [] args) {	
		int maxContatos = 1000;
		AgendaEndereco agenda = new AgendaEndereco(maxContatos);
		boolean sair = false;
		while (!sair) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(//guarda quantidade de 1 a 4
					"Digite uma op��o:\n1.Cadastrar contato\n"
							+"2.Pesquisa endere�o\n"
							+ "3.Pesquisa n�mero de contatos do bairro\n"
							+ "4.Apaga contato\n5.Sair\n"));
			switch(opcao) {
			  case 1://Cadrastar
				String nome = JOptionPane.showInputDialog("Qual o nome?");
				String logradouro = JOptionPane.showInputDialog("Qual o logradouro (Rua, Av...)?");
				String numero = JOptionPane.showInputDialog("Qual o n�mero?");
				String bairro = JOptionPane.showInputDialog("Qual o bairro?");
				Endereco end = new Endereco(logradouro,numero,bairro,"Jo�o Pessoa","Para�ba");
				Contato c = new Contato(nome, end);
				agenda.cadastraContato(c);
				break;
			  case 2://pesquisar endere�o por nome
				String nomeContato = JOptionPane.showInputDialog("Qual o nome do contato?");
				Endereco enderecoAchado = agenda.pesquisaEndereco(nomeContato);
				if (enderecoAchado!=null) {
					JOptionPane.showMessageDialog(null, enderecoAchado.toString());
				} else {
					JOptionPane.showMessageDialog(null, "Contato n�o encontrado");
				}
			    break;
			  case 3://quantidade pesquisado
				String nomeBairro = JOptionPane.showInputDialog("Qual bairro?");
				int numContatosBairro = agenda.pesquisarQuantidadeDeContatosDoBairro(nomeBairro);
				JOptionPane.showMessageDialog(null, "Quantidade:"+numContatosBairro);
				break;
			  case 4://apaga contato
				String nomeContatoApagar = JOptionPane.showInputDialog("Qual o nome do contato?");
				boolean apagou = agenda.apagaContato(nomeContatoApagar);
				if (apagou) {
					JOptionPane.showMessageDialog(null, "Contato removido com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Falha: Contato n�o encontrado.");
				}
				break;
			  case 5:// sair
				sair = true;
				break;
			}
				
		}
		JOptionPane.showMessageDialog(null, "At� mais!");
	}
}
