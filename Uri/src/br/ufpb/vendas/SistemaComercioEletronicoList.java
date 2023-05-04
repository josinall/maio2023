package br.ufpb.vendas;

import java.util.ArrayList;
import java.util.List;


public class SistemaComercioEletronicoList implements SistemaComercioEletronico {
	private List<Cliente> clientes;
	private List<Pedido> pedidos;
	private List<Produto> produtos;
	
	public SistemaComercioEletronicoList() {
		this.clientes = new ArrayList<Cliente>();
		this.produtos = new ArrayList<Produto>();
		this.pedidos = new ArrayList<Pedido>();
	}
	

	public List<Cliente> getClientes(){
		return this.clientes;
	}
	
	public void setClientes( List<Cliente> clientes) {
		this.clientes = clientes;
	}

	
	@Override
	public boolean existeProduto(Produto produto) {
		for(Produto p: this.produtos) {
			if (p.getCodigo().equals(produto.getCodigo())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Produto pesquisaProduto(String codigoProduto) {
		for(Produto p: this.produtos) {
			if (p.getCodigo().equals(codigoProduto)) {
				return p;
			}
		}
		return null;
	}
	
	@Override
	public boolean cadastraProduto(Produto produto) {
		if (existeProduto(produto)) {
			return false;
		} else {
			this.produtos.add(produto);
			return true;
		}
	}
	
	@Override
	public boolean cadastraPedido(Pedido pedido) {
		if (existePedido(pedido)) {
			return false;
		} else {
			this.pedidos.add(pedido);
			return true;
		}
	}
	@Override
	public boolean existePedido(Pedido pedido) {
		for (Pedido p: this.pedidos) {
			if (p.getNumero().equals(pedido.getNumero())) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public boolean cadastraCliente(Cliente cliente) {
		if (existeCliente(cliente)) {
			return false;
		} else {
			this.clientes.add(cliente);
			return true;
		}
	}
	@Override
	public boolean existeCliente(Cliente cliente) {
		for (Cliente c: this.clientes) {
			if (c.getId().equals(cliente.getId())) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Pesquisa no sistema o cliente com um dado identificador
	 * @param id O identificador do cliente a pesquisar
	 * @return O cliente do sistema que tem um dado identificador (id, e.g. CPF, CNPJ)
	 */
	@Override
	public Cliente pesquisaCliente(String id)throws ClienteNaoExisteException {
		for(Cliente c: this.clientes) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		throw new ClienteNaoExisteException("n�o encontrado cliente com Id "+id);
	}
	/**
	 * Pesquisa os clientes cujo nome começa com um certo prefixo
	 * @param prefixo O prefixo a pesquisar
	 * @return a lista dos clientes cujo nome começa com certo prefixo
	 */
	@Override
	public List<Cliente> pesquisaClientesComNomeComecandoCom(String prefixo){
		List<Cliente> lista = new ArrayList<>();
		for (Cliente c: this.clientes) {
			if(c.getNome().startsWith(prefixo)) {// come�ar com startsWith
				lista.add(c);
			}
		}
		//TODO: Implementar
		return lista;  //Implementação temporária
	}
	
	/**
	 * Pesquisa os pedidos que incluem produtos cujo código é passado como parâmetro
	 * @param codigoProduto O código do produto a pesquisar nos itens de pedido
	 * @return a lista dos pedidos que incluem um dado produto.
	 */
	@Override
	public List<Pedido> pesquisaPedidosIncluindoProduto(String codigoProduto){
		List<Pedido> lista = new ArrayList<>();
		for(Pedido p: this.pedidos) {//for it
			List <ItemDoPedido> itens = p.getItens();
			for(ItemDoPedido i: itens) {
				if(i.getProduto().getCodigo().equals(codigoProduto)) {
					lista.add(p);
				}
			}
			
		}
		return lista;
	}
	
}
