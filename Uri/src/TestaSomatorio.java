import java.util.Scanner;
public class TestaSomatorio {
	public static int somatorio(int[]numeros) {
		int soma=0;
		for(int k=0; k<numeros.length; k++) {//enquanto k for menor que numero(3) some mais 1
			soma+= numeros[k];
		}
		return soma;//retorna a soma de cada um
	}
	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantos números vc quer somar?");
		int quant = Integer.parseInt(leitor.nextLine());
		int [] listaNumeros = new int[quant];
		for (int k=0; k<quant; k++) {
			System.out.println("Digite o próximo número");
			listaNumeros[k] = Integer.parseInt(leitor.nextLine());
		}
		System.out.println("A soma é "+somatorio(listaNumeros));
		leitor.close();
	}
}
