package Projeto_P3;

public class Carro extends SistemaCarro{
    TipoMarca marca;
    private String nome;
    private String modelo;
    private double cavalos;
    private double ano;

    public Carro (TipoMarca marca, String modelo, String nome, double cavalos, double ano){
        this.marca = marca;
        this.nome = nome;
        this.modelo = modelo;
        this.cavalos = cavalos;
        this.ano = ano;
    }

    // gets//


    public TipoMarca getMarca() {
        return marca;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCavalos() {
        return cavalos;
    }

    public double getAno() {
        return ano;
    }

    //set


    public void setMarca(TipoMarca marca) {
        this.marca = marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCavalos(double cavalos) {
        this.cavalos = cavalos;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }

    public String toString(){
        return "Carro " +
                ", de nome " + nome +
                ", modelo " + modelo +
                ", com"+ cavalos + "cavalos "+
                ", do ano " + ano;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}