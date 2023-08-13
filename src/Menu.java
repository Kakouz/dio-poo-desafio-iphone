import recursos.comunicacao.Comunicacao;
import recursos.itunes.ITunes;
import recursos.navegador.Navegador;

import java.util.Scanner;

public class Menu {
    public static void iniciar() {
        System.out.println("""
        Bem vindo ao menu do Iphone, escolha a opção desejada
        1 - Comunicação
        2 - iTunes
        3 - Web
        0 - sair
        """);

        Scanner sc = new Scanner(System.in);
        String opcao = sc.nextLine();

        switch (opcao.toString()) {
            case "1":
                Comunicacao comunicacao = new Comunicacao();
                comunicacao.apresentar();
                break;
            case "2":
                ITunes iTunes = new ITunes();
                iTunes.apresentar();
                break;
            case "3":
                Navegador navegador = new Navegador();
                navegador.apresentar();
                break;
            case "0":
                break;
            default:
                System.out.println("Opção invalida escolha outra opção!");
                iniciar();
        }

        System.out.println("Voltando ao menu incial! Deseja continuar no menu? S/N");
        String opcaoSaida = sc.nextLine();
        if (opcaoSaida.equalsIgnoreCase("S")) {
            iniciar();
        } else {
            System.out.println("Obrigado por utilizar");
            System.exit(0);
        }

    }
}
