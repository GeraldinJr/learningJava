package br.com.geraldo.folhaPagamento.funcionarios;

public class Empreiteiro extends Funcionario{
    protected double valorEmpreita;

    public Empreiteiro(String nome, int numeroRegistro, double valorEmpreita) {
        super(nome, numeroRegistro);
        this.valorEmpreita = valorEmpreita;
    }

    public double getValorEmpreita() {
        return valorEmpreita;
    }

    public void setValorEmpreita(float valorEmpreita) {
        this.valorEmpreita = valorEmpreita;
    }


    @Override
    public double calcularSalario() {
        return this.valorEmpreita;
    }

    @Override
    public String toString() {
        return "Empreiteiro{" +
                "valorEmpreita=" + valorEmpreita +
                ", nome='" + nome + '\'' +
                ", numeroRegistro=" + numeroRegistro +
                '}';
    }
}
