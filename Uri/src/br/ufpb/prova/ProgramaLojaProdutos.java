package br.ufpb.prova;
import java.util.Scanner;

public class ProgramaLojaProdutos {// testa e diz se é verdadeiro ou não
	public static boolean ProdutoTemDesconto(Produto produto) {// da classe Produto
		double valorMinimo = 50;
		if(produto.getPreco() == valorMinimo) {// digo qual o atributo de Produto
			return false;
		} else {
			return true;
		}
	}
	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("quantos produtos você quer cadastrar?");
		int quant = Integer.parseInt(leitor.nextLine());
		Produto[] produtos = new Produto[quant];// cria listas, quantidade de produtos 
		for (int k = 0; k < produtos.length; k++) {//lê a quantidade da lista =>for each
			Produto p = new Produto();
			System.out.println("Qual o nome do produto?");
			p.setNome(leitor.nextLine());// proximo
			System.out.println("qual o preco do produto?");
			p.setPreco(Double.parseDouble(leitor.nextLine()));
			if(ProdutoTemDesconto (p) == true){ //testa e diz se tem
				System.out.println("Produtto com desconto;"+p.toString());
			}else {
				System.out.println("Produto sem desconto"+p.toString());
			}
			produtos[k] = p;
		}
	}
}
