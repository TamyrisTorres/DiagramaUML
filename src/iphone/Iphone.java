package iphone;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    public void ligar() {
        System.out.println("Ligando");
    }


    public void atender() {
        System.out.println("Atendendo");
    }


    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de Voz");
    }


    public void exibiPagina() {
        System.out.println("Exibindo pagina");
    }


    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }


    public void atualizarPagina() {
        System.out.println("Atualizando");
    }


    public void tocar() {
        System.out.println("Tocar Musica");
    }


    public void pausar() {
        System.out.println("Pausar musica");
    }


    public void selecionarMusica() {
        System.out.println("Escolhendo a musica");
    }
}
