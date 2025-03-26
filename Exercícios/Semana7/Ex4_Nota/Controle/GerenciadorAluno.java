/* package Ex4_Nota.Controle;

import java.util.Scanner;
import Ex4_Nota.Dominio.Aluno;

public class GerenciadorAluno {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String nome;
        double nota = 0;

        System.out.print("Seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Sua nota: ");
        nota = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota);

        
        do{

            if(aluno.validarNota(nota)){
                aluno.classificarAluno(nota);
            }
            else{
                System.out.println("Digite uma nota valida.");
            }
    
        }while(aluno.validarNota(nota) == false);

        scanner.close();

    }
}
 */

package Ex4_Nota.Controle;

import java.util.Scanner;
import Ex4_Nota.Dominio.Aluno;

public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        double nota;
        Aluno aluno; // Declar antes para criar depois da validação

        while (true) {
            System.out.print("Digite a nota do aluno (0 a 10): ");
            nota = scanner.nextDouble();

            aluno = new Aluno(nome, nota); 

            if (aluno.validarNota()) { 
                break; // Sai do loop se a nota for válida
            } else {
                System.out.println("Nota inválida! Insira um valor entre 0 e 10.");
            }
        }

        aluno.classificarAluno();

        scanner.close();
    }
}
