import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double A = Double.parseDouble(leitor.nextLine());
		double B = Double.parseDouble(leitor.nextLine());
		double C = Double.parseDouble(leitor.nextLine());
		double media =  (A*2+B*3+C*5)/10;
		System.out.printf("Media = %.1f\n", media);
		leitor.close();

	}

}
