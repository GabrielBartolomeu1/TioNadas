package edu.fatec.lp2.exercicio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemCompra implements Calculavel{
    private int quantidade;
    private Produto produto;
    private double desconto;

    @Override
    public double calcularPreco() {
        double precoTotal = produto.getPreco() * quantidade;
        double valorDesconto = precoTotal * (desconto / 100);
        return precoTotal - valorDesconto;
    }

    public ItemCompra(Produto produto, double desconto) {
        this.produto = produto;
        setDesconto(desconto);
    }
}
