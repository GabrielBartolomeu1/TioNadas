package edu.fatec.lp2.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Cleber", "123456789");
        Contato contato2 = new Contato("Igor", "987654321");

        MensagemTexto mensagemTexto = new MensagemTexto(contato1, "10:00", "Hello, Alice!", "Hello, Alice!".length());
        MensagemFoto mensagemFoto = new MensagemFoto(contato2, "10:05", "photo.jpg", 1024);
        MensagemAudio mensagemAudio = new MensagemAudio(contato1, "10:10", "audio.mp3", 180);

        mensagemTexto.sendMessage("Se quiser sim mano");
        mensagemFoto.sendMessage("Foto de gato");
        mensagemAudio.sendMessage("Se quiser não mano");

        List<Contato> contatos = new ArrayList<>();
        contatos.add(contato1);
        contatos.add(contato2);

        List<Mensagem> mensagens = new ArrayList<>();
        mensagens.add(mensagemTexto);
        mensagens.add(mensagemFoto);
        mensagens.add(mensagemAudio);

        Whatsapp whatsapp = new Whatsapp(contatos, mensagens);

        System.out.println("Lista de contatos:");
        whatsapp.listarContatos();

        System.out.println("\nLista de mensagens:");
        whatsapp.listarMensagens();
    }
}

