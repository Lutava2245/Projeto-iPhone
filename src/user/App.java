package user;

import aparelho.Celular;

public class App {
    public static void main(String[] args) {
        Celular iPhone = new Celular();

        iPhone.selecionarMusica("Michael Jackson - Billie Jean");
        iPhone.tocar();
        iPhone.pausar();

        iPhone.atender();
        iPhone.ligar("(13)99628-3049");
        iPhone.iniciarCorreioVoz();

        iPhone.exibirPagina("www.google.com");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
