package controller;

import model.*;
import model.excecao.*;

import java.util.ArrayList;
import java.util.Optional;

public class VeiculoController {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (Veiculo v : veiculos) {
                v.exibirDetalhes();
            }
        }
    }

    public void atualizarVeiculo(String placa, Veiculo novoVeiculo) throws VeiculoNaoEncontradoException {
        Optional<Veiculo> encontrado = buscarPorPlaca(placa);
        if (encontrado.isPresent()) {
            int index = veiculos.indexOf(encontrado.get());
            veiculos.set(index, novoVeiculo);
        } else {
            throw new VeiculoNaoEncontradoException("Veículo com placa " + placa + " não encontrado.");
        }
    }

    public void removerVeiculo(String placa) throws VeiculoNaoEncontradoException {
        Optional<Veiculo> encontrado = buscarPorPlaca(placa);
        if (encontrado.isPresent()) {
            veiculos.remove(encontrado.get());
        } else {
            throw new VeiculoNaoEncontradoException("Veículo com placa " + placa + " não encontrado.");
        }
    }

    private Optional<Veiculo> buscarPorPlaca(String placa) {
        return veiculos.stream()
                .filter(v -> v.getPlaca().equalsIgnoreCase(placa))
                .findFirst();
    }
}
