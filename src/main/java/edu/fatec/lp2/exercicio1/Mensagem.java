package edu.fatec.lp2.exercicio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Mensagem {
    private Contato destinatario;
    private String horaEnvio;
    private String conteudo;

    public abstract String toString();

    public abstract Mensagem sendMessage(String conteudo);
}
