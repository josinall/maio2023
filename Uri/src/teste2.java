import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite a quantidade: \n");
		int N = Integer.parseInt(leitor.nextLine());
		String [] nomes= new String[N];
		for(int k=0; k< N; k++) { //repete N vezes
			System.out.println("informe o nome:");
			nomes[k] = leitor.nextLine();
			//System.out.println(nomes[k]);
		}
		for(int k=0; k < nomes.length; k++) {  //varre cada indice da lista e printa
			System.out.println(nomes[k]);
		}
		
	}

}
