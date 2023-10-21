package contabanco;

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso banco!");
        String numeroConta = obterNumeroConta(entrada);
        String numeroAgencia = obterNumeroAgencia(entrada);
        String nomeCliente = obterNomeCliente(entrada);

        double saldoInicial = 5000.00;

        entrada.close();

        System.out.println("Olá, " + nomeCliente + "! Sua conta no banco foi criada com sucesso.");
        System.out.println("Agência: " + numeroAgencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo inicial: R$" + saldoInicial);
    }

    private static String obterNumeroConta(Scanner entrada) {
        String numeroConta;
        boolean contaValida = false;

        do {
            System.out.print("Informe o número da conta com 8 dígitos: ");
            numeroConta = entrada.next();

            if (numeroConta.matches("\\d{8}")) {
                contaValida = true;
            } else {
                System.out.println("Número de conta inválido. Deve conter 8 dígitos.");
            }
        } while (!contaValida);

        return numeroConta;
    }

    private static String obterNumeroAgencia(Scanner entrada) {
        String numeroAgencia;
        boolean agenciaValida = false;

        do {
            System.out.print("Informe o número da agência com 4 dígitos: ");
            numeroAgencia = entrada.next();

            if (numeroAgencia.matches("\\d{4}")) {
                agenciaValida = true;
            } else {
                System.out.println("Número de agência inválido. Deve conter 4 dígitos.");
            }
        } while (!agenciaValida);

        return numeroAgencia;
    }

    private static String obterNomeCliente(Scanner entrada) {
        String nomeCliente;
        boolean nomeValido = false;

        do {
            System.out.print("Informe o nome do cliente: ");
            nomeCliente = entrada.next();

            if (!nomeCliente.matches(".*\\d+.*")) {
                nomeValido = true;
            } else {
                System.out.println("O nome não pode conter números.");
            }
        } while (!nomeValido);

        return nomeCliente;
    }
}
