import java.util.Scanner;

public class tudoDelicia {

	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantos funcionários há na empresa? ");
		int N = Integer.parseInt(leitor.nextLine());
		System.out.println("Digite o nome dos funcionarios separados por virgula");
		String [] nomes = leitor.nextLine().split(",");
		System.out.println("Digite a pontuação dos funcionarios separados por ,");
		String [] notas = leitor.nextLine().split(",");	//acima temos arrey de notas (uma lista de notas)
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
		}
		System.out.println("               Na Panificadora Tudo Delicia: "+ nomeMaiorNota);
		System.out.println("               tem a maior pontuação: "+ maiorNota);
	}
	

}
