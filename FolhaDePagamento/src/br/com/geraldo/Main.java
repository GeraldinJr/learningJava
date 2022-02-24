package br.com.geraldo;

import br.com.geraldo.fabricaFuncionarios.FabricaFuncionarios;
import br.com.geraldo.folhaPagamento.funcionarios.Funcionario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            File aqruivo = new File("folha.txt");

            FileReader leitor = new FileReader(aqruivo);

            BufferedReader buff = new BufferedReader(leitor);

            String dado = "";

            double totalFolha = 0;

            do {
                dado = buff.readLine();

                if(dado != null) {
                    try {
                        Funcionario f = FabricaFuncionarios.criarFuncionarioFromCSV(dado);
                        double salario = f.calcularSalario();
                        System.out.println("\n"+f + " | Salario: "+salario);
                        totalFolha += salario;
                    }catch (Exception ex) {
                        System.err.println("Erro ao criar funcionario: "+ ex);
                    }
                }

            }while (dado != null);

            System.out.println("\n\nTotal da folha de pagamento: "+totalFolha);

        }catch (Exception ex) {

        }
    }
}
