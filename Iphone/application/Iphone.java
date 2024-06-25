package Iphone.application;

import java.util.Scanner;

import Iphone.interfaces.AparelhoTelefonico;
import Iphone.interfaces.NavegadorNaInternet;
import Iphone.interfaces.ReprodutorMusical;

public class Iphone implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Música em pausa");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Atualizando a página");
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao;
        do {
            System.out.println("Selecione uma opção no menu: \n +" + "1: Efetuar ligação \n +"
                    + "2: Atender ligação \n +" + "3: Iniciar correio de voz \n +" + "4: Selecionar música \n +"
                    + "5: Tocar música \n +" + "6: Pausar música \n +" + "7: Exibir página no navegador \n +"
                    + "8: Abrir nova aba no navegador \n +" + "9: Atualizar página no navegador \n +" + "0: Desligar");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    iphone.ligar();
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 4:
                    iphone.selecionarMusica();
                    break;
                case 5:
                    iphone.tocar();
                    break;
                case 6:
                    iphone.pausar();
                    break;
                case 7:
                    iphone.exibirPagina();
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    break;
                case 9:
                    iphone.atualizarPagina();
                    break;
                case 0:
                    System.out.println("Desligando o aparelho");
                    break;
                default:
                    System.out.println("Opção inválida. Insira um número de 0 a 9.");
            }
        } while (opcao != 0);
        scanner.close();
    }

}
