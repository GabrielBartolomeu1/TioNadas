package edu.fatec.lp2.exercicio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MensagemTexto extends Mensagem{
    private int numChar;

    public MensagemTexto(Contato contato2, String time, String texto, int numero) {
        super(contato2, time, texto);
        this.numChar = numero;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        this.setConteudo(conteudo);
        this.numChar = conteudo.length();
        System.out.println("Conteúdo da mensagem: " + conteudo);
        return this;
    }
}

