package Dominio;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(int id, String nome, int idade, double peso, double altura) {
        super();
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public int getIdade() {
        return idade;
    }
 
    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    public double getPeso() {
        return peso;
    }
 
    public void setPeso(double peso) {
        this.peso = peso;
    }
 
    public double getAltura() {
        return altura;
    }
 
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void listarPessoa() {
        System.out.println("\n"+id);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(altura);
    }

    public void CalcIMC(){
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC: %.2f\n", imc);

        if(imc < 18.5){
            System.out.println("Classificação: Magreza");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Classificação: Normal");
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.println("Classificação: Sobrepeso");
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau I");
        }
        else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau II");
        }
        else if(imc > 40){
            System.out.println("Obesidade grau III");
        }
        
    }
 }


