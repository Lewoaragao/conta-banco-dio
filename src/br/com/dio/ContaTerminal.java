package br.com.dio;

import java.util.Scanner;

@SuppressWarnings("resource")
public class ContaTerminal {

	public static void main(String[] args) {
		// TODO: Conhecer e importar a classe Scanner
		Scanner scanner = new Scanner(System.in);
		
		// TODO: Exibir as mensagens para o nosso usuário
		System.out.println("Olá, seja bem vindo(a) a nossa agência");
		System.out.println("siga os seguintes passos para criar uma conta.");
		System.out.println();
		
		// TODO: Obter pela Scanner os valores digitados no terminal
		System.out.print("Digite o número da conta: ");
		Integer numeroConta = scanner.nextInt();
		
		System.out.print("Digite a agência: ");
		String agencia = scanner.next();
		
		System.out.print("Digite seu nome: ");
		String nomeCliente = scanner.next();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenomeCliente = scanner.next();
		String nomeCompletoCliente = nomeCliente.concat(" ").concat(sobrenomeCliente);
		
		System.out.print("Digite o saldo na conta: ");
		Float saldo = scanner.nextFloat();
		
		// TODO: Exibir a mensagem da conta criada
		System.out.println();
		System.out.print("Olá " + nomeCompletoCliente + ", obrigado por criar uma");
		System.out.print("conta em nosso banco, sua agência é " + agencia + ", ");
		System.out.print("conta " + numeroConta + " e seu saldo " + saldo + " ");
		System.out.print("já está disponível para saque.");
	}

}
