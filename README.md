# Projeto
Implementação de classes e métodos simulando um iPhone.

## Diagrama UML utilizando Mermaid
```mermaid
classDiagram
    class iPhone {
    }
    class ReprodutorMusical {
    <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    class AparelhoTelefonico {
    <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    class NavegadorInternet {
    <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```