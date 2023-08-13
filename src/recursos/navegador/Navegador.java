package recursos.navegador;

import java.util.Scanner;

public class Navegador implements INavegador{
    @Override
    public void apresentar() {
        System.out.println("""
        Bem vindo ao menu do Navegador, escolha a opção desejada
        1 - exibir pagina
        2 - adicionar Nova Aba
        3 - Atualizar pagina
        0 - sair
        """);
        Scanner sc = new Scanner(System.in);
        String opcao = sc.nextLine();

        switch (opcao.toString()) {
            case "1" -> exibirPagina();
            case "2" -> adicionarNovaAba();
            case "3" -> atualizarPagina();
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
    public void exibirPagina() {
        System.out.println("Exibindo página...");
        System.out.println("Retornando ao menu");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        apresentar();
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
        System.out.println("Retornando ao menu");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        apresentar();
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual...");
        System.out.println("Retornando ao menu");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        apresentar();
    }
}
