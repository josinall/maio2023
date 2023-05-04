package br.ufpb.dcx.sisbanco;

import java.util.Scanner;

public class MenuBanco {
	public static void main(String[] args) {		
		Banco meuBanco = new Banco(" D'Lourdes Bank", "03.847.655/0001-98", new Conta[1000]);
		System.out.println("Bem vindo ao " + meuBanco.toString());		
		Scanner leitor = new Scanner(System.in);
		boolean sair = false;
		while (!sair) {
			System.out.println("Digite uma op��o:\n1.Abrir conta\n2.Sacar\n3.Depositar\n"
					+ "4.Transferir\n5.Verificar saldo\n6.Sair");
			int opcao = Integer.parseInt(leitor.nextLine());
			switch (opcao) {
			case 1: // Abrir conta
				String numConta = input("Digite o número da conta", leitor);
				String numAgencia = input("Digite o número da agência", leitor);
				String cpf = input("Digite o cpf do titular", leitor);
				double saldoInicial = inputComDouble("Qual o depósito inicial?", leitor);
				meuBanco.abrirConta(cpf, numConta, numAgencia, saldoInicial);
				System.out.println("Conta aberta!");
				break;
			case 2: // Sacar
				String numContaSaque = input("Digite o número da conta", leitor);
				String numAgenciaSaque = input("Digite o número da agência", leitor);
				double valorSaque = inputComDouble("Qual o valor a sacar?", leitor);
				double novoSaldo = meuBanco.sacarDeConta(numContaSaque, numAgenciaSaque, valorSaque);
				if (novoSaldo != -1) { // TODO: tratamento de erro temporário
					System.out.println("Saque realizado com sucesso. Novo saldo:" + "R$" + novoSaldo);
				} else {
					System.out.println("Erro");
				}
				break;
			// outros cases...
			case 3: //Depositar	
				String numContaDep = input("Digite o número da conta", leitor);
				String numAgenciaDep = input("Digite o número da agência", leitor);
				double valorDep = inputComDouble("Qual o valor a sacar?", leitor);
				double novoSaldoDep = meuBanco.depositarEmConta(numContaDep, numAgenciaDep, valorDep);
				System.out.println("O novo saldo da conta é de :"+novoSaldoDep);
				break;		
			case 4: //Transferir
				String numContaO = input("Digite o número da conta para débito", leitor);
				String numAgenciaO = input("Digite o número da agência para débito", leitor);
				String numContaD = input("Digite o número da conta para crédito", leitor);
				String numAgenciaD = input("Digite o número da agência para crédito", leitor);
				double valorTransf = inputComDouble("Qual o valor a transferir?", leitor);
				meuBanco.transferir(numContaO, numAgenciaO, numContaD, numAgenciaD, valorTransf);
				break;
			
				
			case 5://Verificar saldo
				String numContaConsulta = input("Digite o número da conta", leitor);
				String numAgenciaConsulta = input("Digite o número da agência", leitor);
				double valorSaldo = meuBanco.consultarSaldoDeConta(numContaConsulta, numAgenciaConsulta);
				System.out.println("O saldo desta conta é de: R$ " + valorSaldo);
				break;
			case 6:
				sair = true;
				break;
			}
		}
		System.out.println("Fim do programa");
		leitor.close();
	}

	private static String input(String textoMostrado, Scanner leitor) {
		System.out.println(textoMostrado);
		return leitor.nextLine();
	}

	private static double inputComDouble(String textoMostrado, Scanner leitor) {
		return Double.parseDouble(input(textoMostrado, leitor));
	}
}
