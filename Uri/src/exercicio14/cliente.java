package exercicio14;

import javax.swing.JOptionPane;

public class cliente {
	public static void main(String [] args) {
		//int k = 5;//quantidade de vezes fixa
		//while(k >= 1){// enquanto k(5,4,3,2,1) for maior igual 1
		//	int j = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
			//if(j == 3) {
				//System.out.println("oi vc acertou ");
				//break;
			//}else {
				//System.out.println("olá vc errou e tem mais "+k);
			//}
			//k--;//diminua um
		//}
		boolean acertou = false;
		while(acertou == false){// enquanto k(5,4,3,2,1) for maior igual 1
			int j = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
			if(j == 6) {
				System.out.println("oi vc acertou ");
				acertou = true;
			}else {
				System.out.println("olá vc errou e tem mais ");
			}
			//diminua um
		}
		acertou = false;
		JOptionPane.showMessageDialog(null,"vamos para o próximo");
		while(acertou == false){// enquanto k(5,4,3,2,1) for maior igual 1
			int j = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
			if(j == 4) {
				System.out.println("oi vc acertou ");
				acertou = true;
			}else {
				System.out.println("olá vc errou e tem mais ");
			}
			//diminua um
		}
		JOptionPane.showMessageDialog(null,"vamos para o próximo");
		acertou = false;
		while(acertou == false){// enquanto k(5,4,3,2,1) for maior igual 1
			int j = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
			if(j == 10) {
				System.out.println("oi vc acertou ");
				acertou = true;
			}else {
				System.out.println("olá vc errou e tem mais ");
			}
			//diminua um
		}
	}

}
