package edu.fatec.lp2.exercicio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListaCompra implements Calculavel{
    private ItemCompra[] itensCompra;
    private int qtdeMax;
    private int qtdeAtual = 0;

    public void incluir(ItemCompra item) {
        if (qtdeAtual < qtdeMax) {
            itensCompra[qtdeAtual] = item;
            qtdeAtual++;
        } else {
            System.out.println("Lista de compras cheia");
        }
    }

    @Override
    public double calcularPreco() {
        double precoTotal = 0.0;
        for (int i = 0; i < qtdeAtual; i++) {
            precoTotal += itensCompra[i].calcularPreco();
        }
        return precoTotal;
    }

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ItemCompra[qtdeMax];
    }

}
