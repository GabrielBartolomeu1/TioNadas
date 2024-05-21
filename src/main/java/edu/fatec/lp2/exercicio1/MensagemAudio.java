package edu.fatec.lp2.exercicio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MensagemAudio extends Mensagem{
    private int duracao;

    public MensagemAudio(Contato contato1, String time, String string, int duracao) {
        super(contato1, time, string);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        this.setConteudo(conteudo);
        System.out.println("Duração da mensagem: " + duracao);
        return this;
    }
}
