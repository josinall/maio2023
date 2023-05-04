package br.ufpb.prova;

public class TestaProdudo {
	public static void main(String [] args) {
		Produto p1 = new Produto("Caneta", 2.50);
		System .out.println(p1);
		
		Produto p2 = new Produto("lapiz", 3.50);
		System .out.println(p2);
		
		Produto p3= new Produto();
		System.out.println(p3.toString());
		p3.setNome("borracha");
		p3.setPreco(1.50);
		System.out.println(p3.toString());
	}

	;
}
