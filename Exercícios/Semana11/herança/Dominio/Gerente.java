package heranca.Dominio;

public class Gerente extends Funcionario{

    public void Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    
    @Override
    public double calcularSalarioBase(){
        return(salarioBase + (salarioBase * 20 / 100));
    }



}
