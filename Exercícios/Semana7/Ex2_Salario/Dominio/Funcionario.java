package Ex2_Salario.Dominio;

public class Funcionario {
    
    public String nome;
    public double salario;
    public String categoria;

    //construtor
    public Funcionario(String nome, double salario, String categoria){
        this.nome = nome;
        this.salario = salario;
        this.categoria = categoria;
    }

    public double calcularSalarioFinal(){
        double bonus = 0;

        switch (categoria) {
            case "A":
            case "a":
                bonus = (20 * salario) / 100;
                
            break;

            case "B":
            case "b":
                bonus = (10 * salario) / 100;

            case "C":
            case "c":
                bonus = 0;



        
            default:
                break;
        }

        return bonus;
    }






















}


