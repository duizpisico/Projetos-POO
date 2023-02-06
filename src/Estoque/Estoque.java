package Estoque;

import javax.swing.*;

public class Estoque {
    private int idProduto;
    static int quantidadesDeProdutos = 0;
    private int quantidade;

    public Estoque(String quantidade){
        quantidadesDeProdutos++;
        this.idProduto = quantidadesDeProdutos;
        this.quantidade = 0;
    }
    public void EstoqueDisponivel(){
        JOptionPane.showInputDialog("Digite o id do produto" + this.idProduto);
        JOptionPane.showInputDialog("Digite a quantidade do estoque" + this.quantidade);
    }
    public void Amarzenar(int quantidadeEstoque){
        JOptionPane.showMessageDialog(null, "Quantidade disponível antes:" + this.quantidade);
        this.quantidade += quantidadeEstoque;
        JOptionPane.showMessageDialog(null, "Estoque disponível:");
    }
    public void Retirar(int quantidadeEstoque){
        if (quantidadeEstoque <= this.quantidade){
            this.quantidade -= quantidadeEstoque;
            JOptionPane.showMessageDialog(null, "Estoque:" + this.quantidade);
        } else {
            JOptionPane.showMessageDialog(null, "Estoque indisponível");
        }
    }

}
