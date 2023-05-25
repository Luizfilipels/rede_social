package br.inatel.luizfilipels.redesocial;

import br.inatel.luizfilipels.redesocial.redes.Facebook;
import br.inatel.luizfilipels.redesocial.redes.GooglePlus;
import br.inatel.luizfilipels.redesocial.redes.Instagram;
import br.inatel.luizfilipels.redesocial.redes.Twitter;
import br.inatel.luizfilipels.redesocial.usuarios.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Luiz Filipe", "luiz.lopes@get.inatel.br", new GooglePlus("senha_segura", 20, "Luizfilipesl"), new Facebook("senha_super_segura", 25, "Luiz Filipe Silva Lopes"));
        Usuario user2 = new Usuario("Chris", "christopher@inatel.br", new Twitter("chris2022xd", 300, "Chrislima2023"), new Instagram("chris2023_computacao", 500, "chrislimasf"));

        System.out.println("--- Redes Sociais ---");
        System.out.println("Logado como: " + user1.getNome() + " usando o email: " + user1.getEmail());
        user1.usarRedes();
        System.out.println("----------------------------");
        System.out.println("Logado como: " + user2.getNome() + " usando o email: " + user2.getEmail());
        user2.usarRedes();


    }
}
