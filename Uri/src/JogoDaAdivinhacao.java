import javax.swing.JOptionPane;

public class JogoDaAdivinhacao {
	public static void main(String [] args) {
		int pontos = 100;
		int num = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Digite o numero a ser adivinhado (0-100)"));
		boolean terminar = false;
		while(terminar == false) {
			int numLido = Integer.parseInt(
					JOptionPane.showInputDialog("Tente adivinha o numero[0 100]"));
			if(numLido == num){
				JOptionPane.showMessageDialog(null, "Parabens, vc acertou!!");
				terminar = true;
			
			} else if(numLido < num){				
				JOptionPane.showMessageDialog(null, "Errou... o número é maior que esse");
				pontos-=10;
								
			}else {
				pontos = pontos -10;
				JOptionPane.showMessageDialog(null, "Errou... o número é menor que esse");
				
			}
			if (pontos == 0) {
				terminar = true;
				JOptionPane.showMessageDialog(null, "Numero de tentativas excedeu");
		}
		
		}
	}

}
