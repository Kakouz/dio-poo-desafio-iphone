package recursos.itunes;

import java.util.Scanner;

public class ITunes implements IITunes {

    private boolean isTocando;

    @Override
    public void apresentar() {
        System.out.println("""
        Bem vindo ao menu do iTunes, escolha a opção desejada
        1 - tocar
        2 - pausar
        3 - selecionar musica
        0 - sair
        """);
        Scanner sc = new Scanner(System.in);
        String opcao = sc.nextLine();

        switch (opcao.toString()) {
            case "1" -> tocar();
            case "2" -> pausar();
            case "3" -> selecionarMusica();
            case "0" -> {
                break;
            }
            default -> {
                System.out.println("Opção invalida escolha outra opção!");
                apresentar();
            }
        }

        System.out.println("Deseja continuar no menu? S/N");
        String opcaoSaida = sc.nextLine();
        if (opcaoSaida.equalsIgnoreCase("S")) {
            apresentar();
        }
    }

    @Override
    public void tocar() {
        if (isTocando) {
            System.out.println("O aparelho já está tocando uma música");
        } else {
            isTocando = true;
            System.out.println("Tocando música escolhida...");
        }
        System.out.println("Retornando ao menu");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        apresentar();
    }

    @Override
    public void pausar() {
        if (!isTocando) {
            System.out.println("O aparelho já está pausado");
        } else {
            isTocando = false;
            System.out.println("Pausando a reprodução...");
        }
        System.out.println("Retornando ao menu");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        apresentar();
    }

    @Override
    public void selecionarMusica() {
        isTocando = true;
        System.out.println("Reproduzindo faixa selecionada...");
        System.out.println("Retornando ao menu");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        apresentar();
    }

}
