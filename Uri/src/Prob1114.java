import java.util.Scanner;

public class Prob1114 {
	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe a senha");
		boolean continuar = true;
		while(continuar == true) {
			int senha = Integer.parseInt(leitor.nextLine());
			if(senha == 2002) {
				System.out.println("Acesso Permitido");
				continuar = false;
			}else {
				System.out.println("Senha Inválida \ninforme a senha");
			}
		}
		System.out.println("informe a nova senha");
		boolean continua = true;
		while(continua == true) {
			int senha = Integer.parseInt(leitor.nextLine());
			if(senha == 2005) {
				System.out.println("Acesso Permitido");
				continua = false;
			}else {
				System.out.println("Senha Inválida");
				System.out.println("informe a nova senha");
			}
		}
		System.out.println("programa acabou");
		leitor.close();
	}

}
