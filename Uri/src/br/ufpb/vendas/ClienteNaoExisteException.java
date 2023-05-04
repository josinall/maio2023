package br.ufpb.vendas;

public class ClienteNaoExisteException extends Exception{
	
	private static final long serialVersionUID = 1l;
	
	public ClienteNaoExisteException (String msn) {
		super(msn);
		
	}

}
