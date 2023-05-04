package br.ufpb.vendas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ProgramaVendas {

	public static void main(String[] args) {
		SistemaComercioEletronico sistema = new SistemaComercioEletronicoList();
		boolean sair = false;
		while (!sair) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar cliente\n"
					+ "2.Cadastrar produto\n" + "3.Pesquisar cliente\n" + "4.Pesquisar clientes pelo nome\n"
					+ "5.Pesquisar pedidos com produto\n" + "6.Cadastrar pedido" + "\n7.Sair\n"));
			switch (opcao) {
			case 1:
				String nome = JOptionPane.showInputDialog("Qual o nome do cliente?");
				String endereco = JOptionPane.showInputDialog("Qual o endereco do cliente?");
				String email = JOptionPane.showInputDialog("Qual o email do cliente?");
				String tipo = JOptionPane
						.showInputDialog("Qual o tipo do cliente?1. Pessoa Física ou 2.Pessoa Jurídica");
				Cliente cliente = null;
				if (tipo.equals("1")) {
					String cpf = JOptionPane.showInputDialog("Qual o CPF do cliente?");
					cliente = new ClientePF(nome, endereco, email, cpf);
				} else if (tipo.equals("2")) {
					String cnpj = JOptionPane.showInputDialog("Qual o CNPJ do cliente?");
					cliente = new ClientePJ(nome, endereco, email, cnpj);
				} else {
					JOptionPane.showMessageDialog(null, "Opção Inválida");
				}
				if (cliente != null) {
					boolean cadastrou = sistema.cadastraCliente(cliente);
					if (cadastrou) {
						JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
					} else {
						JOptionPane.showMessageDialog(null, "Cliente já estava cadastrado");
					}
				}
				break;
			case 2://cadastra produto
				String codigo = JOptionPane.showInputDialog("Qual o codigo do produto?");
				String descricao = JOptionPane.showInputDialog("Qual a descri��o do produto?");
				double precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o de venda do produto?"));
				int quantidadeEmEstoque = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade do produto?"));
				String categoria = JOptionPane.showInputDialog("Qual a categoria?");
				
				Produto prod = new Produto(codigo,descricao,precoVenda,quantidadeEmEstoque,categoria);
				
				boolean cadastrou = sistema.cadastraProduto(prod);
				if(cadastrou == true) {
					JOptionPane.showMessageDialog(null,"cadastrou com sucesso?");
				}else {
					JOptionPane.showMessageDialog(null,"produto j� existe");
				}
				
				break;
			case 3:
				String idPesq = JOptionPane.showInputDialog("Qual o Id do Cliente a pesquisar?");
				try {
					Cliente clienteAchado = sistema.pesquisaCliente(idPesq);
					JOptionPane.showMessageDialog(null, "CLIENTE ACHADO:" + clienteAchado.toString());
				} catch (ClienteNaoExisteException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}

				break;
			case 4: //pesquisar por nome
				String prefixo = JOptionPane.showInputDialog("qual � a inicial do cliente");
				List<Cliente>achado =sistema.pesquisaClientesComNomeComecandoCom(prefixo);
				for(Cliente c:achado) {
					JOptionPane.showMessageDialog(null,c.toString());
				}				
				
				break;
			case 5:
				String codigoPesq = JOptionPane.showInputDialog("Qual o codigo do produto a pesquisar?");
				List<Pedido> pedidosAchados = sistema.pesquisaPedidosIncluindoProduto(codigoPesq);
				JOptionPane.showMessageDialog(null, "PEDIDOS ACHADOS:");
				for (Pedido p : pedidosAchados) {
					JOptionPane.showMessageDialog(null, p.toString());
				}
				break;
			case 6: // Cadastrar pedido
				String idCliente = JOptionPane.showInputDialog("Qual o ID do cliente (e.g. CNPJ/CPF?");
				Cliente clientePedido;
				try {
					clientePedido = sistema.pesquisaCliente(idCliente);
				} catch (ClienteNaoExisteException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
					break;

				}
				String dataPedido = JOptionPane.showInputDialog("Qual a data do pedido?");
				String numero = JOptionPane.showInputDialog("Qual o numero do pedido?");
				String formaPagamento = JOptionPane
						.showInputDialog("Qual a forma de pagamento?1. Boleto ou 2.Cartão de crédito");
				String formaPagamentoStr = "";
				if (formaPagamento.equals("1")) {
					formaPagamentoStr = Pedido.PAGAMENTO_BOLETO;
				} else if (formaPagamento.equals("2")) {
					formaPagamentoStr = Pedido.PAGAMENTO_CARTAO;
				}
				int quantItens = Integer.parseInt(JOptionPane.showInputDialog("Quantos tipos de itens há no pedido?"));
				List<ItemDoPedido> itens = new ArrayList<ItemDoPedido>();
				for (int k = 0; k < quantItens; k++) {
					String codigoProd = JOptionPane.showInputDialog("Qual o codigo do produto?");
					int quantidade = Integer
							.parseInt(JOptionPane.showInputDialog("Qual a quantidade de itens deste produto?"));
					ItemDoPedido item = new ItemDoPedido(quantidade, sistema.pesquisaProduto(codigoProd));
					itens.add(item);
				}
				Pedido ped = new Pedido(dataPedido, Pedido.STATUS_REALIZADO, numero, formaPagamentoStr, itens,
						clientePedido);
				sistema.cadastraPedido(ped);
				break;
			case 7:
				sair = true;
				break;
			}

		}
		JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA");

	}

}
