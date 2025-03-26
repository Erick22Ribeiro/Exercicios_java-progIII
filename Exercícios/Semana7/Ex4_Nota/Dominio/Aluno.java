package Ex4_Nota.Dominio;

public class Aluno {
    
    String nome;
    double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }


    public boolean validarNota(){
        if(nota >= 0 && nota <= 10){
            return true;
        }
        else{
            System.out.println("Digite uma nota valida.");
            return false;
        }
    }

    public void classificarAluno(){
        
        if(nota >= 7){
            System.out.println("Aprovado");

        }
        else if(nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }

    } 
}

