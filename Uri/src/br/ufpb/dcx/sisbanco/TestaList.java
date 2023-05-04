package br.ufpb.dcx.sisbanco;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class TestaList {
	public static void main(String [] args) {
		
		ArrayList<String> listaPalavras = new ArrayList<String>();
		System.out.println( "Vamos ler algumas palavras?");
		int numPalavras = Integer.parseInt(JOptionPane.showInputDialog("Quantas palavras vc quer ler?"));
		for (int k=0; k<numPalavras; k++) {
			String p = JOptionPane.showInputDialog("Digite uma palavra");
			listaPalavras.add(p);
		}
		
		System.out.println("Palavras lidas:");
		for (int k=0; k< listaPalavras.size(); k++) {
			String palavra = listaPalavras.get(k);
			System.out.println(palavra);
		}
		
		Collections.sort(listaPalavras);
		
		System.out.println("Palavras lidas ordenadas:");
		for (String palavra: listaPalavras) {
			System.out.println(palavra);
		}
		
		
		
	}
}
