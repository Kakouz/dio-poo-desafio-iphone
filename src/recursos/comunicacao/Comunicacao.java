package recursos.comunicacao;

import java.util.Scanner;

public class Comunicacao implements IComunicacao {
    private boolean isOcupado = false;

    @Override
    public void apresentar() {
        isOcupado = false;
        System.out.println("""
                Bem vindo ao menu de comunicação, escolha a opção desejada
                1 - ligar
                2 - atender
                3 - chamar correio de voz
                4 - verificar status do aparelho
                0 - sair
                """);
        Scanner sc = new Scanner(System.in);
        String opcao = sc.nextLine();

        switch (opcao.toString()) {
            case "1" -> atender();
            case "2" -> ligar();
            case "3" -> iniciarCorreioVoz();
            case "4" -> {
                System.out.println("O aparelho está " + (this.isOcupado ? "OCUPADO" : "DISPONÍVEL") + " no momento");
                apresentar();
            }
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
    public void ligar() {
        if (!isOcupado) {
            isOcupado = true;
            System.out.println("Realizando ligação...");
        } else {
            System.out.println("Não foi possivel realizar a ligação pois você está ocupado no momento");
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
    public void atender() {
        if (!isOcupado) {
            isOcupado = true;
            System.out.println("Atendendo ligação...");
        } else {
            System.out.println("Não foi possivel atender a chamada pois você está ocupado no momento");
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
    public void iniciarCorreioVoz() {
        if (!isOcupado) {
            isOcupado = true;
            System.out.println("Chamando correio de voz...");
        } else {
            System.out.println("Não foi possivel chamar correio de voz pois você está ocupado no momento");
        }
        System.out.println("Retornando ao menu");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        apresentar();
    }
}
