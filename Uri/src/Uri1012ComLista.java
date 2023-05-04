import java.util.Scanner;

public class Uri1012ComLista {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite os tres valorres separando com traço(-) ");
		String [] linhaLida = leitor.nextLine().split(" ");
		
		double A = Double.parseDouble(linhaLida[0]);
		double B = Double.parseDouble(linhaLida[1]);
		double C = Double.parseDouble(linhaLida[2]);
		
		//System.out.printf("A= %.0f, B= %.2f, C= %.2f\n",A,B,C);
		//System.out.printf("A= "+A+", B= "+B+", C= "+C);
		leitor.close();
		double areTriangulo = (A*C)/2;
		System.out.printf("\nTRIANGULO: %.3f\n", areTriangulo);
		double pi = 3.14159;
		double areaCirculo = pi*C*C;
		System.out.printf("CIRCULO: %.3f\n", areaCirculo);
		double areaTrapezio = ((A+B)*C)/2;
		System.out.printf("TRAPÉZIO: %.3f\n", areaTrapezio);
		double areaQuadrado = (B*B);
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		double areaRetangulo = (A*B);
		System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
		
				
	}

}
	
