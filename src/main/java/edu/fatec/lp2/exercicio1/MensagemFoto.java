package edu.fatec.lp2.exercicio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MensagemFoto extends Mensagem{
    private int tamanho;

    public MensagemFoto(Contato contato1, String time, String foto, int tamanho) {
        super(contato1, time, foto);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        this.setConteudo(conteudo);
        System.out.println("Tamanho da foto: " + tamanho);
        return this;
    }
}
