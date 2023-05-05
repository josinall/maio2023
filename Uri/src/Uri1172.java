import java.util.Scanner;

public class Uri1172 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//System.out.println("informado 5 casas ");
		int [] numerosLidos = new int [5];
		String dig1 = "3";
		
		for(int k=0; k<3; k++) { //roda 3 vezes
			//System.out.println("informe o num.. ");
			String digitado = "3";
			//String n = (leitor.nextLine());
			//int n = Integer.parseInt(leitor.nextLine());			
			// testa  se é oi ou olá
			if(digitado == "3") { //comparação
				numerosLidos[k] = 1;
				System.out.println("oi ");
				break;
			}else {
			//	numerosLidos[k] = n;
				System.out.println("olá");
			}
		}
		for(int k=0; k<5; k++) {// pega dos dados acima roda 5 vezes
			System.out.println("X["+k+"] = "+numerosLidos[k]);
			
		}
		
		leitor.close();
		System.out.println(numerosLidos[0]);
		if (dig1.equals(numerosLidos[0]) ) {
			System.out.println("ops");
			
		}else {
			System.out.println("ei");
		}

	}

}
