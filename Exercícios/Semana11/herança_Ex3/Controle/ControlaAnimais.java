package herança_Ex3.Controle;

import herança_Ex3.Dominio.Cachorro;
import herança_Ex3.Dominio.Gato;

public class Programa {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5);
        Gato gato = new Gato("Mimi", 3);

        System.out.println("=== Cachorro ===");
        cachorro.emitirSom();
        cachorro.exibirInformacoes();

        System.out.println("\n=== Gato ===");
        gato.emitirSom();
        gato.exibirInformacoes();
    }
}
