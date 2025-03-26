package Ex3_Elevador.Controle;

import java.util.Scanner;
import Ex3_Elevador.Dominio.Elevador;;

public class SimuladorElevador {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de andares do predio?: ");
        int totalAndares = scanner.nextInt();

        Elevador elevador = new Elevador(totalAndares);

        int opcao = 0;

        do{

            System.out.println("1 - Subir.");
            System.out.println("2 - Descer.");
            System.out.println("3 - Exibir andar.");
            System.out.println("4 - Sair.");
            System.out.print("?: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.exibirAndarAtual();
                    break;
                case 4:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Digite uma opcao valida.");
                
            }

        }while(opcao != 4);

        scanner.close();
        

    }
}
