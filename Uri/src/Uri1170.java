import java.util.ArrayList;
import java.util.Scanner;

public class Uri1170 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//System.out.println("informado 5 casas ");
		ArrayList<Colunas> linha = new ArrayList<Colunas>();
		int [] numerosLidos = new int [5];
		String x1 = "3";
		String x2 = "27x";
		String x3 = "10x";
		Colunas linha0 =  new Colunas("3","27","10");
		//String dig1 = "3";
		//String dig1 = "3";
		//int a0 = 3;
		//int a1 = 27;
		linha.add(linha0);
		//String [] nomes ;
		//int digitado[0];
		//String [] nomes = leitor.nextLine().split(",");
		//String nomeMaiorNota = nomes[0];
		for(int i=0; i<5; i++) { //roda 5 vezes
			//System.out.println("informe o num.. ");
			//int digitado0 = 3;
			//int digitado1 = 4;
			//String n = (leitor.nextLine());
			//int n = Integer.parseInt(leitor.nextLine());			
			// testa  se é oi ou olá
			if( linha.get(i).getA() == x1) { //comparação
				//nomeMaiorNota = nomes[k];
				System.out.println("você acertou A1");
				numerosLidos[i] = i;
				//break;
			}else {
				System.out.println("você não acertou A1");
			}
			
			if( linha.get(i).getB() == x2) { //comparação
				//nomeMaiorNota = nomes[k];
				System.out.println("você acertou B1");
				//break;
			}else {
				System.out.println("você não acertou B1");
			}
			
			if( linha.get(i).getC() == x3) { //comparação
				//nomeMaiorNota = nomes[k];
				System.out.println("você acertou C1");
				
			}else {
				System.out.println("você não acertou C1");
			}break;
			//------------------------------------------------
	        		
			//if(digitado1 == 4) { //comparação
			//	numerosLidos[k] = digitado1;
			//	System.out.println("você acertou ");
			//	break;
			//}else {
				//numerosLidos[i] = i;
			//	System.out.println("digite novamente");
			//}
			
		}
		
		for(int i=0; i<5; i++) {// pega dos dados acima roda 5 vezes
			System.out.println("X["+i+"] = "+numerosLidos[i]);			
		}
			
		leitor.close();
		System.out.println(numerosLidos[0]);
		System.out.println(numerosLidos[1]);
		System.out.println(numerosLidos[2]);
		//if (dig1.equals(numerosLidos[0]) ) {
		//	System.out.println("ops");
			
		//}else {
		//	System.out.println("ei");
		//}

	}

}
