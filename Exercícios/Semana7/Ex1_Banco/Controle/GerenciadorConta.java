package Ex1_Banco.Controle;

import java.util.Scanner;
import Ex1_Banco.Dominio.ContaBancaria;

public class GerenciadorConta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        // Cria um objeto da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria(nomeTitular);

        int opcao;

        do {

            System.out.println("==_MENU_==");
            System.out.print("Operacoes: \n\n");

            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Encerrar");
            System.out.print("Qual operacao deseja realizar?: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Valor de deposito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito); // Chama o método depositar()

                    break;

                case 2:
                    System.out.print("Valor de saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque); // Chama o método sacar()
                    break;

                case 3:
                    conta.exibirSaldo();
                    break;

                case 4:
                    System.out.print("Encerrando...");
                    break;

                default:
                    System.out.print("Digite uma opcao valida.");

            }

        } while (opcao != 4);

        scanner.close();

    }
}
