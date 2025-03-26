package Ex5_Caixa.Dominio;

public class CaixaEletronico {
    
    //atributos
    double saldo;

    //contrutor
    public CaixaEletronico(double saldo){
        this.saldo = saldo;
    }

    //metodos
    public void sacar(double valor){

        if(valor % 10 == 0){
            if(valor <= saldo){
                saldo -= valor;
                System.out.println("Saque efetuado.");
            }
        }
        else{
            System.out.println("Só é possível sacar valores multiplos de 10!");
        }
    }

    public void exibitSaldo(){
        System.out.printf("Saldo R$: %.2f\n", saldo);
    }



}
