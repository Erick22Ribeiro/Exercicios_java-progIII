package Ex1.Dominio;

public class Boleto implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Boleto Bancário.");
    }
}
