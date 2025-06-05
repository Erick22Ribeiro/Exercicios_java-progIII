package Ex1.Controle;

import Ex1.Dominio.CartaoCredito;
import Ex1.Dominio.Boleto;
import Ex1.Dominio.Pagamento;

public class ControlaPagamento {

    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new Boleto();
        
        cartao.realizarPagamento(150.00);
        boleto.realizarPagamento(200.00);
    }
}