package view;

import controller.VeiculoController;
import model.*;
import model.excecao.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VeiculoController controller = new VeiculoController();

        int opcao = 0;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Listar Veículos");
            System.out.println("3 - Atualizar Veículo");
            System.out.println("4 - Remover Veículo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcao) {
                    case 1:
                        cadastrarVeiculo(scanner, controller);
                        break;
                    case 2:
                        controller.listarVeiculos();
                        break;
                    case 3:
                        System.out.print("Placa do veículo a atualizar: ");
                        String placaUpdate = scanner.nextLine();
                        Veiculo novoVeiculo = criarVeiculo(scanner);
                        controller.atualizarVeiculo(placaUpdate, novoVeiculo);
                        System.out.println("Veículo atualizado com sucesso.");
                        break;
                    case 4:
                        System.out.print("Placa do veículo a remover: ");
                        String placaRemove = scanner.nextLine();
                        controller.removerVeiculo(placaRemove);
                        System.out.println("Veículo removido com sucesso.");
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarVeiculo(Scanner scanner, VeiculoController controller) throws EntradaInvalidaException {
        Veiculo veiculo = criarVeiculo(scanner);
        controller.adicionarVeiculo(veiculo);
        System.out.println("Veículo cadastrado com sucesso.");
    }

    private static Veiculo criarVeiculo(Scanner scanner) throws EntradaInvalidaException {
        System.out.println("Tipo de veículo (1-Carro, 2-Moto, 3-Caminhão): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Número de portas: ");
                int portas = scanner.nextInt();
                return new Carro(placa, marca, modelo, portas);
            case 2:
                System.out.print("Cilindradas: ");
                int cilindradas = scanner.nextInt();
                return new Moto(placa, marca, modelo, cilindradas);
            case 3:
                System.out.print("Quantidade de eixos: ");
                int eixos = scanner.nextInt();
                return new Caminhao(placa, marca, modelo, eixos);
            default:
                throw new EntradaInvalidaException("Tipo de veículo inválido.");
        }
    }
}
