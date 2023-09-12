package contabanco;


import java.util.Scanner;

import javax.swing.event.DocumentEvent.EventType;

public class ContaTerminal {

	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, informe os dados da conta!");
		
		
		boolean verificarConta = false;
		String numero = "";
		while (!verificarConta) {
			
			try {
				System.out.println("Informe a Conta com 8 dígitos!");
				numero = entrada.next();
				Integer.valueOf(numero);
				verificarConta = true;
			
			} catch (Exception e) {
				System.out.println("Digite somente números!");
				verificarConta = false;
			}
			
			if (numero.length() != 8) {
				System.out.println("A conta precisa ter 8 digitos!");
				verificarConta = false;
			}
			
		}
		
		boolean verificarAgencia = false;
		String agencia ="";
		while (!verificarAgencia) {
			
			try {
				System.out.println("Informe o numero da agencia de 4 digitos!");
				agencia = entrada.next();
				Integer.valueOf(agencia);
				verificarAgencia = true;
				
			} catch (Exception e) {
				System.out.println("Digite somente números!");
				verificarAgencia = false;
			}
			
			if (agencia.length() != 4) {
				System.out.println("A agencia precisa ter 4 digitos");
				verificarAgencia=false;
			}
		 }
		
		entrada.nextLine();
		
		boolean verificarNome = false;
		String nomeCliente = "";
		while (!verificarNome) {
			System.out.println("Informe nome do usuario!");
			 nomeCliente =entrada.nextLine();
			 
			 if(!nomeCliente.matches(".*\\d+.*")) {
				 verificarNome = true;
				
			}else {
				System.out.println("Nome nao pode conter numeros");	
			}	
		}
		double saldo = 5000.00;
		
		entrada.close(); 
		
		System.out.println("Olá " + nomeCliente + " obrigado por cria uma conta em nosso banco, Sua agancia é " 
		+ agencia +", Conta " + numero + "e seu saldo " + saldo + " já está disponivel para saque.");
		
		
	}
}
