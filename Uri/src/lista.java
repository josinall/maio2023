

import javax.swing.JOptionPane;

public class lista {

	public static void main(String[] args) {
		String [] linhaLida = JOptionPane.showInputDialog("digite 3 valores com espaço").split(" ");
		int A = Integer.parseInt(linhaLida[0]);
		double B = Double.parseDouble(linhaLida[1]);
		double C = Double.parseDouble(linhaLida[2]);
		System.out.printf("A="+A+" B="+B+" C="+C);
		
		//System.out.printf("B %d\n ", B);
		//System.out.printf("C %d\n ", C);

	}

}
