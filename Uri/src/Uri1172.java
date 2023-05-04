import java.util.Scanner;

public class Uri1172 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("informado 5 casas ");
		int [] numerosLidos = new int [5];
		for(int k=0; k<5; k++) {
			System.out.println("informe o num.. ");
			int n = Integer.parseInt(leitor.nextLine());
			if(n <= 0) {
				numerosLidos[k] = 1;
				System.out.println("oi ");
			}else {
				numerosLidos[k] = n;
				System.out.println("olá");
			}
		}
		for(int k=0; k<5; k++) {// roda 5 vezes
			System.out.println("X["+k+"] = "+numerosLidos[k]);
			
		}
		leitor.close();

	}

}
