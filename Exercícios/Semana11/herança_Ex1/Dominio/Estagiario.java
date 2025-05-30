package herança.Dominio;

public class Estagiario extends Funcionario{

    public void Estagiario(String nome, double salarioBase){
        super(nome, salarioBase);
    }
        
    @Override
    public double calcularSalarioBase(){
        return(salarioBase + (salarioBase * 5 / 100));
    }
    
    
    
}
