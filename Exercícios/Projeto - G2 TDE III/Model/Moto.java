package model;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int cilindradas) {
        super(placa, marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularIPVA() {
        return 0.02;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto - Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Cilindradas: " + cilindradas);
    }
}
