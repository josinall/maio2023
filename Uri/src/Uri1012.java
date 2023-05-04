import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite o valor de A; ");
		double A = Double.parseDouble(leitor.nextLine());// leio a proxima string e converto para double
		System.out.println("digite o valor de B; ");
		double B = Double.parseDouble(leitor.nextLine());
		System.out.println("digite o valor de C; ");
		double C = Double.parseDouble(leitor.nextLine());
		//System.out.printf("A= %.0f, B= %.2f, C= %.2f\n",A,B,C);
		System.out.printf("A= "+A+", B= "+B+", C= "+C);
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
