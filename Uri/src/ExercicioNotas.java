import javax.swing.JOptionPane;
import java.util.Scanner;

public class ExercicioNotas {
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite de quantos alunos quer saber qual maior nota? ");
		int N = Integer.parseInt(leitor.nextLine());
		System.out.println("Digite o nome dos Alunos separando por virgula");
		String [] nomes = leitor.nextLine().split(",");
		//String [] notas =JOptionPane.showInputDialog("Digite as notas dos alunos separando por virgula").split(",");
		System.out.println("Digite as notas dos alunos separando por virgula");
		String [] notas = leitor.nextLine().split(",");	//acima temos arrey de notas ou seja   (uma lista de notas e nomes)
		String nomeMaiorNota = nomes[0];
		String nomeMenorNota = nomes[0];
		double maiorNota = Double.parseDouble(notas[0]);
		double menorNota = Double.parseDouble(notas[0]);
		//System.out.println("Menor nota = "+menorNota+"\nMaior nota = "+maiorNota);
		//for( int k=0; k<nomes.length; k++) {//"acessa/faz rodadas" o for vai varrer o indice da lista de nomes e notas abaixo
		for( int k=0; k<N; k++) { //"acessa/faz rodadas N" vai pegar o inteiro N e rodar como indice no k para varrer nomes e notas
			System.out.println("nome "+nomes[k]+" nota "+notas[k]);
			double notaLida = Double.parseDouble(notas[k]);
			if(notaLida > maiorNota) {  // se nota lida for menor que menor nota
				maiorNota = notaLida; // então nota lida é igual a menor nota
				nomeMaiorNota = nomes[k];
			}
			if(notaLida < menorNota) {  // se nota lida for menor que menor nota
				menorNota = notaLida; // então nota lida é igual a menor nota
				nomeMenorNota = nomes[k];
			}
		
		}
		//JOptionPane.showMessageDialog(null,"A maior nota é do Aluno(a): "+ nomeMaiorNota);
		
		System.out.println("                O Aluno(a): "+ nomeMaiorNota);
		System.out.println("                teve a maior nota sendo "+ maiorNota);
		System.out.println("                O Aluno(a): "+ nomeMenorNota);
		System.out.println("                teve a menor nota sendo "+ menorNota);
		
	}
	

}

