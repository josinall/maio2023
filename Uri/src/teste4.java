
import java.util.Scanner;
public class teste4 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("quantos alunos na turma?");
		int N = Integer.parseInt(leitor.nextLine());
		System.out.println("digite os nomes dos alunos separados por ponto e virgula");
		String [] nomes = leitor.nextLine().split(";");
		System.out.println("digite as notas dos alunos separados por ponto e virgula");
		String [] notas = leitor.nextLine().split(";");
		for(int k=0; k<N; k++) {
			System.out.println("nome:" +nomes[k]+"nota:\n"+notas[k]);
						
		}
		//System.out.println("a maior nota eh de"+nomeMaiorNota);
		//System.out.println("a menor nota eh de "+nomeMenorNota);

	}

}
