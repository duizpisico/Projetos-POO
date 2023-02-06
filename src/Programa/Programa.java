package Programa;

import Estoque.Estoque;

import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int opcao = 0;
        int valor = 0;
         String exe = null;
        JOptionPane.showInputDialog("Digite o id do estoque" + exe);

        Estoque x1 = new Estoque(null);

        do {
            Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo: " +
                    "(1) Estoques:" +
                    "(2) Adicionar ao estoque:" +
                    "(3) Retirar do estoque" + opcao));

            if (opcao == 1){
                x1.EstoqueDisponivel();
            } else if (opcao == 2) {
                JOptionPane.showInputDialog("Digite a quantidade a ser adicionada ao estoque" + valor);
                x1.Amarzenar(valor);
            } else if (opcao == 3) {
                JOptionPane.showInputDialog("Digite a quantidade para retirar:" + valor);
                x1.Retirar(valor);
            }

        } while (opcao != 0);
    }
}
