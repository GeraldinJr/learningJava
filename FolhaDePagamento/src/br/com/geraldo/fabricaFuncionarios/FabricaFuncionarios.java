package br.com.geraldo.fabricaFuncionarios;

import br.com.geraldo.folhaPagamento.funcionarios.*;

public class FabricaFuncionarios {

    public static Funcionario criarFuncionarioFromCSV(String linhaCSV) {
        Funcionario f = null;

        String[] info = linhaCSV.split(";");

        for(int i = 0; i < info.length; i++) {
            info[i] = info[i].trim();
        }


        if(info.length < 4 || info.length > 6) {
            throw new RuntimeException("Formato de linha CSV inválido");
        }
        try {
            if(Integer.parseInt(info[0]) == 1) {
                f = new Chefe(info[2], Integer.parseInt(info[1]), Double.parseDouble(info[3]),
                        Double.parseDouble(info[4]), Double.parseDouble(info[5]));

                return f;
            }

            else if(Integer.parseInt(info[0]) == 2) {
                f = new Comissionado(info[2], Integer.parseInt(info[1]),
                        Double.parseDouble(info[3]), Double.parseDouble(info[4]));

                return f;
            }

            else if(Integer.parseInt(info[0]) == 3) {

                f = new Horista(info[2], Integer.parseInt(info[1]),
                        Double.parseDouble(info[4]), Integer.parseInt(info[3]));

                return f;
            }

            else if (Integer.parseInt(info[0]) == 4) {
                f = new Empreiteiro(info[2], Integer.parseInt(info[1]),
                        Double.parseDouble(info[3]));

                return f;
            }

            else {
                throw new RuntimeException("Tipo de funcionario invalido");
            }

        }catch (Exception ex) {
                throw new RuntimeException("Algun dado invalido");
        }
    }
}
