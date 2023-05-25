package br.inatel.luizfilipels.redesocial.redes;

import br.inatel.luizfilipels.redesocial.abstrata.RedeSocial;
import br.inatel.luizfilipels.redesocial.interfaces.Compartilhamento;
import br.inatel.luizfilipels.redesocial.interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook(String senha, int numAmigos, String nome_user) {
        super(senha, numAmigos, nome_user);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Facebook!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Facebook!");
    }

    //Metodo veio do Implements
    @Override
    public void fazStreaming() {
        System.out.println("Fazendo um streaming no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando alguma coisa no Facebook.");
    }
}
