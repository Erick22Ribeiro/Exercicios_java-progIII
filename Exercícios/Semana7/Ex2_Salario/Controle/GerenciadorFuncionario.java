package Ex2_Salario.Controle;

import java.util.Scanner;
import Ex2_Salario.Dominio.Funcionario;

public class GerenciadorFuncionario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome, categoria;
        double salarioBase, bonus = 0;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua categoria: ");
        categoria = scanner.nextLine();

        System.out.print("Digite seu salario base: ");
        salarioBase = scanner.nextDouble();

        switch (categoria.toUpperCase()){
            case "A":
                bonus = 20;        
                break;

            case "B":
                bonus = 10;        
                break;

            case "C":
                bonus = 0;        
                break;
        
            default:
                System.out.println("Digite uma categoria valida.");
                break;
        }

        Funcionario funcionario = new Funcionario(nome, salarioBase, categoria);

        System.out.println("Categoria " + "|"+categoria.toUpperCase()+"|" + " Bonus de " + bonus + ", salario final: R$:" + (salarioBase + funcionario.calcularSalarioFinal()));
        
        scanner.close();
    }
}
