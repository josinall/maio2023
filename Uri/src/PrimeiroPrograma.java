import javax.swing.JOptionPane; //biblioteca com classes com janelas
//parseInt  converta para inteiro
public class PrimeiroPrograma {
	public static void main(String[] args) {
		System.out.println("oi Usuário");
		System.out.println("bom dia");
		JOptionPane.showInputDialog("Tudo bem?");// JOptionPane retorna uma string
		
		String nome = "josinaldo";
		String nomeLido = JOptionPane.showInputDialog("Qual seu nome?");
		System.out.println("olá "+nomeLido);
		int idade = 15;
		String i = JOptionPane.showInputDialog("Qual sua idade?");
		idade = Integer.parseInt(i);
		System.out.println("idade "+i);
		double altura1 = 1.75;
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua Altura?"));
		JOptionPane.showMessageDialog(null,"Tchau"+nome);
				
	}
}
