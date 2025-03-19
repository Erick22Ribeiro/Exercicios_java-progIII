/* 3: Calculadora Simples com switch-case 
Descrição: 
Crie um programa que simule uma calculadora simples, permitindo 
ao usuário  escolher uma operação matemática básica (+, -, *, /) e dois números. 
Requisitos: 
• O programa deve solicitar dois números e a operação desejada. 
• Deve usar switch-case para executar a operação correspondente. 
• Caso a operação não seja válida, exibir "Operação inválida.". 
• Se a operação for divisão (/), verificar se o segundo número é zero antes de  
calcular.  */

/* 
observações:

char operacao = scanner.next().charAt(0);  --> salva o valor de um char em uma variável
*/

import java.util.Scanner;

public class Ex3_Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operacoes: +, -, x, /");

        System.out.print("Primero valor: ");
        float num1 = scanner.nextFloat();

        System.out.print("Operador: ");
        char operacao = scanner.next().charAt(0);

        System.out.print("Segundo valor: ");
        float num2 = scanner.nextFloat();

        double resultado;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.printf("Soma: %.2f\n", resultado);

                break;

            case '-':
                resultado = num1 - num2;
                System.out.printf("Subtracao: %.2f\n", resultado);

                break;

            case 'x':
                resultado = num1 * num2;
                System.out.printf("Multiplicacao: %.2f\n", resultado);

                break;

            case '/':

                if(num1 == '0' || num2 == '0'){
                    System.out.print("Operacao com 0 invalida.");
                }
                else{
                    resultado = num1 / num2;
                    System.out.printf("Divisao: %.2f", resultado);
                }

                break;


            default:
                System.out.println("Digite uma operacao valida.");
        }

        scanner.close();

    }
}
