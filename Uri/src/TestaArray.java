import javax.swing.JOptionPane;

public class TestaArray {

	public static void main(String[] args) {
		int quantNomes = 3;
		String [] nomes = new String [3];
		for( int k=0; k< quantNomes; k++) {
			nomes [k] = JOptionPane.showInputDialog("Digite um nome");
		}
		JOptionPane.showMessageDialog(null,"o numero digitado foi: "+nomes[0]);
		JOptionPane.showMessageDialog(null,"o último número digitado foi: "+nomes[nomes.length-1]);

	}

}
