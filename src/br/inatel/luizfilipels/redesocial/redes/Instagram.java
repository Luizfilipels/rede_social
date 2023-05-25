package br.inatel.luizfilipels.redesocial.redes;

import br.inatel.luizfilipels.redesocial.abstrata.RedeSocial;

public class Instagram extends RedeSocial {

    public Instagram(String senha, int numAmigos, String nome_user) {
        super(senha, numAmigos, nome_user);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Publicou um reels no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Instagram!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Instagram!");
    }
}
