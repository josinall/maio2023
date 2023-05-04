import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;
public class ListaNomes {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero a ser Lido"));
		for(int k=0; k<quant; k++) { //adiciona na ArrayList indices os nomes
			String nome = JOptionPane.showInputDialog("digite o próximo nome");
			nomes.add(nome);
		}
		System.out.println("IMPRIMIDO A LISTA LIDA");
		for(int k=0; k< nomes.size(); k++) {// cada nome no indice por posição
			System.out.println("posição:"+k+":"+ nomes.get(k));//pega nome na posição:0:jo
		}
		System.out.println("IMRIMINDO DE NOVO");
		Collections.sort(nomes);//coloca em ordem alfabetica os nomes na ArrayLista(nomes)
		for(String nome: nomes) { // repete a quantidade de linhas da ArrayList
			System.out.println("nome:"+nomes);  //nome:[jo, nil, ed]
		}
	}
}
