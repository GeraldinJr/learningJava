package br.com.geraldo.folhaPagamento.funcionarios;

public class Horista extends Funcionario{
    protected double valorHora;
    protected int numeroHoras;

    public Horista(String nome, int numeroRegistro, double valorHora, int numeroHoras) {
        super(nome, numeroRegistro);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }


    @Override
    public double calcularSalario() {
        return this.numeroHoras * this.valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "nome='" + nome + '\'' +
                ", numeroRegistro=" + numeroRegistro +
                ", valorHora=" + valorHora +
                ", numeroHoras=" + numeroHoras +
                '}';
    }
}
