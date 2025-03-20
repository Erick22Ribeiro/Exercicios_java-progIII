/* 4: Média de notas de uma turma
Descrição: 
Desenvolva um programa que calcule a média das notas de uma turma, onde  o usuário informe quantos alunos há na turma e suas respectivas notas. 
Requisitos: 
• O programa deve solicitar a quantidade de alunos. 
• Deve utilizar um loop for para receber as notas de cada aluno. • Utilizar um acumulador para somar todas as notas. 
• No final, exibir a média da turma.  */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int qtdAlunos;
        float somaNotas = 0, media = 0;

        System.out.print("Quantidade de alunos: ");
        qtdAlunos = scanner.nextInt();

        for(int i = 1; i <= qtdAlunos; i++){
            System.out.printf("Digite a nota do aluno %d: ", i);
            somaNotas += scanner.nextFloat();
        }

        media = somaNotas / qtdAlunos;

        System.out.printf("Media das notas: %.2f", media);

        scanner.close();
    }
}
