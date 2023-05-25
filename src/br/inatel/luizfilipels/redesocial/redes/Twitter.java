package br.inatel.luizfilipels.redesocial.redes;

import br.inatel.luizfilipels.redesocial.abstrata.RedeSocial;
import br.inatel.luizfilipels.redesocial.interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {

    public Twitter(String senha, int numAmigos, String nome_user) {
        super(senha, numAmigos, nome_user);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Twitter! (Certamente xingando alguém...)");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Twitter!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando alguma coisa no Twitter.");
    }
}
