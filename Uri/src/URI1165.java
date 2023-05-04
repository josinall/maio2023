import java.util.Scanner;

public class URI1165 {
	public static void main(String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite quantas vezes");
		int N = Integer.parseInt(leitor.nextLine());
		for (int k=0; k<N; k++) {
			System.out.println("digite um numero");
			int proximoNumero =Integer.parseInt(leitor.nextLine());
			boolean ehPrimo = true;
			for(int j=2; j<proximoNumero; j++) {
				if(proximoNumero%j == 0){
					ehPrimo = false;
					break;
				}
			}
			if (ehPrimo == true) {
				System.out.println(proximoNumero + " eh primo");
			}else {
				System.out.println(proximoNumero + " não eh primo");
				
			}
			
		}
		
		
		
		leitor.close();
	}

}
