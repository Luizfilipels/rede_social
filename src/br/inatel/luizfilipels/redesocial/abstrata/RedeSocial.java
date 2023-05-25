package br.inatel.luizfilipels.redesocial.abstrata;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;
    protected String nome_user;

    public RedeSocial(String senha, int numAmigos, String nome_user) {
        this.senha = senha;
        this.numAmigos = numAmigos;
        this.nome_user = nome_user;
    }

    //Métodos abstratos
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public abstract void curtirPublicacao();
}
