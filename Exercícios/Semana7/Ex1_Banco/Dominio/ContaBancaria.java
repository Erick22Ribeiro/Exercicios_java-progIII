package Ex1_Banco.Dominio;

public class ContaBancaria{
    
    //atributos
    String titular;
    double saldo;

    // Construtor
    public ContaBancaria(String titular) {
        this.titular = titular; 
        this.saldo = 0.0; 
    }


    //metodos 
    public void depositar(double valor){

        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado.");
        }
        else{
            System.out.println("Deposito invalido.");
        }
    }

    public void sacar(double valor){

        if(valor > 0 || saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        }
        else{
            System.out.println("Saque invalido.");
        } 
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
}

