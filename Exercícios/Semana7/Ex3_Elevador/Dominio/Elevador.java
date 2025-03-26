package Ex3_Elevador.Dominio;

import java.util.Scanner;

public class Elevador {
    int andarAtual, totalAndares;

    // Contrutor
    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
    }

    Scanner scanner = new Scanner(System.in);
    // metodos
    public void subir(){

        System.out.print("Quantos?: ");
        int qtdAndares = scanner.nextInt();

        if(andarAtual + qtdAndares <= totalAndares){

            andarAtual += qtdAndares;
            System.out.println("Subindo...");
        }
        else if(andarAtual == totalAndares){
            System.out.println("Voce esta no ultimo andar");
        }
        else{  
            System.out.println("Andar invalido");
        }
    }

    public void descer(){

        System.out.print("Quantos?: ");
        int qtdAndares = scanner.nextInt();

        if(andarAtual - qtdAndares >= 0){
            
            andarAtual -= qtdAndares;
            System.out.println("Descendo...");
        }
        else if(andarAtual == 0){
            System.out.println("Voce ja esta no terreo.");
        }
        else{
            System.out.println("Andar invalido.");
        }
    }

    public void exibirAndarAtual(){

        if(andarAtual == 0){
            System.out.println("Terreo");
        }
        else{
            System.out.println("Andar atual: " + andarAtual);
        }
        
    }
}