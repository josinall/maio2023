

import javax.swing.JOptionPane;

public class tabelaDeMesa2 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Digite o n�mero a ser adivinhado"));
		int tentativas = 0;
		boolean sair = false;
		while(!sair) {
			int caixa1 = Integer.parseInt(JOptionPane.showInputDialog("digite o valor"));
			
			if(caixa1 == 3) {
				System.out.println(" acertou N�mero de tentativas: "+tentativas);
				sair = true;
			
			}else {
				System.out.println("vc errou, tente nomvamente");				
			}
		}	
	}
}





