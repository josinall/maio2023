import java.util.Scanner;

public class Uri1001 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int a = Integer.parseInt(leitor.nextLine());
		int b = Integer.parseInt(leitor.nextLine());
		int soma = a+b;
		System.out.printf("Soma = %d\n", soma);
		leitor.close();
	}

}
