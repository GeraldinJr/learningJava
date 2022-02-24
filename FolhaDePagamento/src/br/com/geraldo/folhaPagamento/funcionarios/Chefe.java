package br.com.geraldo.folhaPagamento.funcionarios;

public class Chefe extends Funcionario{
    protected double salarioBase;
    protected double adicionalFucao;
    protected double benefioTerno;

    public Chefe(String nome, int numeroRegistro, double salarioBase, double adicionalFucao, double benefioTerno) {
        super(nome, numeroRegistro);
        this.salarioBase = salarioBase;
        this.adicionalFucao = adicionalFucao;
        this.benefioTerno = benefioTerno;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase * (1 + this.adicionalFucao/100.0) + this.benefioTerno;
    }

    @Override
    public String toString() {
        return "Chefe{" +
                "salarioBase=" + salarioBase +
                ", adicionalFucao=" + adicionalFucao +
                ", benefioTerno=" + benefioTerno +
                ", nome='" + nome + '\'' +
                ", numeroRegistro=" + numeroRegistro +
                '}';
    }
}
