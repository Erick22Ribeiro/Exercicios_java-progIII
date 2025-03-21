package Controle;

import Dominio.*;
import java.util.Scanner;

public class ControlaPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
 System.out.print("Digite a ID: ");
    int id = scanner.nextInt();
    scanner.nextLine();
 System.out.print("Digite o nome: ");
    String nome = scanner.nextLine();
 System.out.print("Digite a idade: ");
    int idade = scanner.nextInt();
 System.out.print("Digite o peso: ");
    double peso = scanner.nextDouble();
 System.out.print("Digite a altura: ");
    double altura = scanner.nextDouble();
    
    Pessoa pessoa = new Pessoa(id,nome,idade,peso,altura);
    
    pessoa.listarPessoa();

    double imc = peso / (altura * altura);

    System.out.printf("Seu IMC: %.2f\n", imc);

    if(imc < 18.5){
        System.out.println("Classificação: Magreza");
    }
    else if(imc >= 18.5 && imc <= 24.9){
        System.out.println("Classificação: Normal");
    }
    else if(imc >= 25 && imc <= 29.9){
        System.out.println("Classificação: Sobrepeso");
    }
    else if(imc >= 30 && imc <= 34.9){
        System.out.println("Obesidade grau I");
    }
    else if(imc >= 35 && imc <= 39.9){
        System.out.println("Obesidade grau II");
    }
    else if(imc > 40){
        System.out.println("Obesidade grau III");
    }

    scanner.close();
    }
}
