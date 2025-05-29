package heranca.Dominio;

public class Funcionario {

    public class ControlaFuncionario {

        protected String nome;
        protected double salarioBase;
    
    
        public ControlaFuncionario(String nome, double salarioBase) {
            this.nome = nome;
            this.salarioBase = salarioBase;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
        }
    
    
        public double calcularSalarioBase(){
    
            return salarioBase;
        }
    
    }

}
