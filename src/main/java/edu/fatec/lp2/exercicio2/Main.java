package edu.fatec.lp2.exercicio2;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado("SuperCarlão ");

        Produto produto1 = new Produto(supermercado);
        produto1.setNome("Morango");
        produto1.setUnidade("kg");
        produto1.setDescricao("bom pra fazer bolu de murango");
        produto1.setPreco(90);
        produto1.setDescontoMaximo(10.0);

        Produto produto2 = new Produto(supermercado);
        produto2.setNome("Serra Eletrica");
        produto2.setUnidade("um");
        produto2.setDescricao("bom pra cortar arvore");
        produto2.setPreco(1300);
        produto2.setDescontoMaximo(15);

        ItemCompra item1 = new ItemCompra(produto1, 0.0);
        item1.setQuantidade(10);

        ItemCompra item2 = new ItemCompra(produto2, 15.0);
        item2.setQuantidade(100);

        ListaCompra listaCompra = new ListaCompra(5);

        listaCompra.incluir(item1);
        listaCompra.incluir(item2);

        System.out.println("Preço total da lista de compras: " + listaCompra.calcularPreco());
    }
}
