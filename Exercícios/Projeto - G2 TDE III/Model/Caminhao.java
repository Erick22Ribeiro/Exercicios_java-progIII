package model;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, String marca, String modelo, int eixos) {
        super(placa, marca, modelo);
        this.eixos = eixos;
    }

    @Override
    public double calcularIPVA() {
        return 0.03;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão - Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Eixos: " + eixos);
    }
}
