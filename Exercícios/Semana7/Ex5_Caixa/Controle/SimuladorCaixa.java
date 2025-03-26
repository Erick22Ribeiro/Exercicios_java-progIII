package Ex5_Caixa.Controle;

import java.util.Scanner;
import Ex5_Caixa.Dominio.CaixaEletronico;;

public class SimuladorCaixa {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double saldo1 = 0;
        double valor1 = 0;
        int opcao = 0;
        int opcao2 = 0;

        System.out.print("Seu saldo?: ");
        saldo1 = scanner.nextInt();

        CaixaEletronico caixaE = new CaixaEletronico(saldo1);

        do{

            System.out.println("Disponivel apenas saques multiplos de 10!");
            System.out.println("1 - Sacar.");
            System.out.println("2 - Exibir saldo");
            System.out.print("?: ");
            opcao2 = scanner.nextInt();

            if(opcao2 == 1){
                System.out.print("Quanto deseja sacar?: ");
                valor1 = scanner.nextDouble();

                caixaE.sacar(valor1);
            }
            else if(opcao2 == 2){
                caixaE.exibitSaldo();
            }
            else{
                System.out.println("Opcao invalida");
            }
    
            System.out.print("Voltar ao menu? (1 - sim / 2 - nao): ");
            opcao = scanner.nextInt();
            //opcao = opcao.toLowerCase();


        }while(opcao == 1);

        System.out.println("Operacao encerrada.");

        scanner.close();


        	










    }
}
