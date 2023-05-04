import javax.swing.JOptionPane;

public class ExemploArrays {

	public static void main(String[] args) {
		System.out.println("Vamos ler e Guardar 5 nomes");
		int quantNomes = 5;
		String [] nomes = new String [5];
		for(int k=0; k< quantNomes; k++) {
			nomes[k] = JOptionPane.showInputDialog("digite os nomes: ");
			//System.out.println(nomes[k]);
		}
		System.out.println("foram lidos os nomes");
		for(int k=0; k< nomes.length;k++) {
			System.out.println(nomes[k]);
		}
		

	}

}
