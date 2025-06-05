package Ex3.Controle;

import Ex3.Dominio.DispositivoEletronico;
import Ex3.Dominio.Smartphone;
import Ex3.Dominio.Televisao;
import java.util.Scanner;

public class ControleDispositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        DispositivoEletronico smartphone = new Smartphone();
        DispositivoEletronico televisao = new Televisao();

        System.out.println("Escolha um dispositivo para ligar ou desligar:");
        System.out.println("1 - Smartphone");
        System.out.println("2 - Televisão");
        System.out.print("Digite sua opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Deseja ligar ou desligar o smartphone? (1 para ligar, 2 para desligar): ");
            int acao = scanner.nextInt();
            if (acao == 1) {
                smartphone.ligar();
            } else {
                smartphone.desligar();
            }
        } else if (opcao == 2) {
            System.out.print("Deseja ligar ou desligar a televisão? (1 para ligar, 2 para desligar): ");
            int acao = scanner.nextInt();
            if (acao == 1) {
                televisao.ligar();
            } else {
                televisao.desligar();
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
