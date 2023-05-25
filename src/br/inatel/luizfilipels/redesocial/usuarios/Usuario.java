package br.inatel.luizfilipels.redesocial.usuarios;

import br.inatel.luizfilipels.redesocial.abstrata.RedeSocial;
import br.inatel.luizfilipels.redesocial.interfaces.Compartilhamento;
import br.inatel.luizfilipels.redesocial.interfaces.VideoConferencia;

public class Usuario {
    private String nome;
    private String email;
    private RedeSocial[] redesSociais;

    public Usuario(String nome, String email, RedeSocial... redeSocial) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redeSocial;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void usarRedes() {
        for(RedeSocial rd : redesSociais) {
            rd.curtirPublicacao();
            rd.postarVideo();
            rd.postarFoto();
            rd.postarComentario();

            if(rd instanceof Compartilhamento) {
                ((Compartilhamento) rd).compartilhar();
            }
            if(rd instanceof VideoConferencia) {
                ((VideoConferencia) rd).fazStreaming();
            }

        }
    }

}
