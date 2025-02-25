package aparelho;

import aparelho.funcionalidades.AparelhoTelefonico;
import aparelho.funcionalidades.NavegadorInternet;
import aparelho.funcionalidades.ReprodutorMusical;

public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web ".concat(url).concat(" utilizando o Navegador de Internet."));
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no Navegador de Internet.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Navegador de Internet.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número ".concat(numero).concat(" no Aparelho Telefônico."));
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ao telefone no Aparelho Telefônico.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Aparelho Telefônico.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música no Reprodutor Musical.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música no Reprodutor Musical.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música ".concat(musica).concat(" no Reprodutor Musical."));
    }
    
}