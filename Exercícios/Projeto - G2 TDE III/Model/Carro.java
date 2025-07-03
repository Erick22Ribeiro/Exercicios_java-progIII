package model;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String placa, String marca, String modelo, int portas) {
        super(placa, marca, modelo);
        this.portas = portas;
    }

    @Override
    public double calcularIPVA() {
        return 0.04; // Exemplo: 4% do valor do veículo
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro - Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Portas: " + portas);
    }
}
