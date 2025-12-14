package application;

import java.util.Scanner;
import entities.Reserva;

public class Menu {

    public static final int MAXIMO_DE_RESERVAS = 10;
    public static int contadorReservas = 0;
    public static Reserva[] vetorReserva = new Reserva[MAXIMO_DE_RESERVAS];

    public static void main(String[] args) {

        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Programa de Reservas de Quartos de Hotel!");

        selecionarOpcaoMenuPrincipal(meuScanner);

        meuScanner.close();
    }

    public static void selecionarOpcaoMenuPrincipal(Scanner meuScanner) {
        int opcaoUsuario = 0;

        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1- Cadastrar nova reserva.\n2- Listar reservas.\n3- Buscar reserva por nome do hóspede.\n4- Ordenar reservas por números de dias em ordem crescente.\n5- Sair do programa.");

            System.out.print("\nDigite o número de uma das opções: ");
            opcaoUsuario = meuScanner.nextInt();
            meuScanner.nextLine();

            switch(opcaoUsuario) {
                case 1:
                    cadastrarNovaReserva(meuScanner);
                    break;
                case 2:
                    listarReservas();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.");
            }

        } while(opcaoUsuario != 5); {
            System.out.println("\nObrigado por usar o programa!");
        };
    }

    public static void cadastrarNovaReserva(Scanner meuScanner) {
        if(contadorReservas < MAXIMO_DE_RESERVAS) {

            criarReserva(meuScanner);

        } else {
            System.out.println("Desculpe, o hotel chegou ao máximo de reservas!");
        }
    }

    public static void criarReserva(Scanner meuScanner) {
        System.out.println("\nCadastro de Reserva de Quarto:");

        System.out.print("Digite seu nome: ");
        String nomeUsuario = meuScanner.nextLine();

        String quartoEscolhido = escolherQuarto(meuScanner);

        System.out.print("\nDigite a quantidade de dias que deseja reservar: ");
        int quantidadeDias = meuScanner.nextInt();
        meuScanner.nextLine();

        System.out.print("\nDigite o valor da diária: R$ ");
        double valorDiaria = meuScanner.nextDouble();
        meuScanner.nextLine();

        Reserva novaReserva = new Reserva(nomeUsuario, quartoEscolhido, quantidadeDias, valorDiaria);

        System.out.print("\nInformações da reserva:");
        System.out.println(novaReserva);

        System.out.print("\nConfirmar reserva? (s/n) ");
        char confirmaChar = meuScanner.next().charAt(0);

        if(confirmaChar == 's' || confirmaChar == 'S') {
            vetorReserva[contadorReservas] = novaReserva;
            System.out.println("\nReserva Confirmada!");
            contadorReservas++;
        } else {
            System.out.println("\nReserva Cancelada.");
        }
    }

    public static String escolherQuarto(Scanner meuScanner) {

        int opcaoQuarto;
        String tipoQuarto = null;
        do {
            System.out.println("\nOpções de Quarto:\n1- Quarto básico.\n2- Quarto de Luxo.\n3- Quarto Presidencial.");

            System.out.print("\nDigite o número de uma das opções: ");
            opcaoQuarto = meuScanner.nextInt();
            meuScanner.nextLine();

            switch(opcaoQuarto) {
                case 1:
                    tipoQuarto = "Quarto Básico.";
                    break;
                case 2:
                    tipoQuarto = "Quarto de Luxo.";
                    break;
                case 3:
                    tipoQuarto = "Quarto Presidencial.";
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.");
            }
        } while(opcaoQuarto<1 || opcaoQuarto>3); {
            return tipoQuarto;
        }
    }

    public static void listarReservas() {
        if(vetorReserva[0] == null) {
            System.out.println("\nNenhuma reserva feita.");
        } else {
            for (int reserva = 0; reserva < vetorReserva.length; reserva++) {
                if (vetorReserva[reserva] != null) {
                    System.out.print("\nReserva " + (reserva+1) + ":");
                    System.out.println(vetorReserva[reserva]);
                }
            }
        }
    }
}
