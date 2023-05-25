package br.inatel.luizfilipels.redesocial.redes;

import br.inatel.luizfilipels.redesocial.abstrata.RedeSocial;
import br.inatel.luizfilipels.redesocial.interfaces.Compartilhamento;
import br.inatel.luizfilipels.redesocial.interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia , Compartilhamento {

    public GooglePlus(String senha, int numAmigos, String nome_user) {
        super(senha, numAmigos ,nome_user);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no GooglePlus!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no GooglePlus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando alguma coisa no GooglePlus.");
    }
}
