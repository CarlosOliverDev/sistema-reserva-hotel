package application;

import java.util.Scanner;
import entities.Hospede;
import entities.Reserva;
import entities.TipoQuarto;

public class Menu {
    public static final int MAXIMO_DE_RESERVAS = 5;
    public static int contadorReservas = 0;
    public static Reserva[] vetorReserva = new Reserva[MAXIMO_DE_RESERVAS];
    public static Scanner meuScanner = new Scanner(System.in);

    public static void main(String[] args) {
        selecionarOpcaoMenuPrincipal();
        meuScanner.close();
    }

    public static void selecionarOpcaoMenuPrincipal() {
        System.out.println("Bem-vindo ao Programa de Reservas de Quartos de Hotel!");
        int opcaoUsuario = 0;
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1- Cadastrar nova reserva.\n2- Listar reservas.\n3- Buscar reserva por nome do hóspede.\n4- Ordenar reservas por números de dias em ordem decrescente.\n5- Check-Out.\n6- Sair do programa.");

            opcaoUsuario = lerInteiro("\nDigite o número de uma das opções: ");

            opcaoMenu(opcaoUsuario);
        } while(opcaoUsuario != 6);
        System.out.println("\nObrigado por usar o programa!");
    }

    public static void opcaoMenu(int opcaoUsuario) {
        switch(opcaoUsuario) {
            case 1:
                cadastrarNovaReserva();
                break;
            case 2:
                listarReservas();
                break;
            case 3:
                buscarReservaPorNome();
                break;
            case 4:
                ordenarVetorReservas();
                break;
            case 5:
                fazerCheckOut();
                break;
            case 6:
                break;
            default:
                System.out.println("\nOpção inválida, tente novamente.");
        }
    }

    public static void cadastrarNovaReserva() {
        if(contadorReservas < MAXIMO_DE_RESERVAS) {
            criarReserva();
        } else {
            System.out.println("Desculpe, o hotel chegou ao máximo de reservas!");
        }
    }

    public static void criarReserva() {
        System.out.println("\nCadastro de Reserva de Quarto:");

        System.out.print("Digite o nome do hóspede: ");
        String nomeUsuario = meuScanner.nextLine();

        int idadeUsuario = lerInteiro("Digite a idade do hóspede: ");

        System.out.print("Digite o CPF do hóspede: ");
        String identidadeUsuario = meuScanner.nextLine();

        Hospede hospede = new Hospede(nomeUsuario, idadeUsuario, identidadeUsuario);

        TipoQuarto tipoQuarto = escolherQuarto();

        int quantidadeDias = lerInteiro("\nDigite a quantidade de dias que deseja reservar: ");

        while(quantidadeDias < 1) {
            quantidadeDias = lerInteiro("\nÉ necessário se hospedar pelo menos 1 dia." + "\nDigite a quantidade de dias que deseja reservar: ");
        }

        Reserva novaReserva = new Reserva(hospede, tipoQuarto, quantidadeDias);

        System.out.println("\nInformações da Reserva:");
        System.out.println(novaReserva);

        System.out.print("\nConfirmar reserva? (s/n) ");
        char confirmaChar = meuScanner.next().charAt(0);
        meuScanner.nextLine();

        if(confirmaChar == 's' || confirmaChar == 'S') {
            vetorReserva[contadorReservas] = novaReserva;
            System.out.println("\nReserva Confirmada!");
            contadorReservas++;
        } else {
            System.out.println("\nReserva Cancelada.");
        }
    }

    public static TipoQuarto escolherQuarto() {
        int opcaoQuarto;
        do {
            System.out.println("\nOpções de Quarto:\n1- Quarto básico.\n2- Quarto de Luxo.\n3- Quarto Presidencial.");

            opcaoQuarto = lerInteiro("\nDigite o número de uma das opções: ");

            char confirmaChar;
            switch(opcaoQuarto) {
                case 1:
                    System.out.println(TipoQuarto.QUARTOBASICO);
                    System.out.print("Deseja escolher esse quarto? (s/n) ");
                    confirmaChar = meuScanner.next().charAt(0);
                    meuScanner.nextLine();
                    if(confirmaChar == 's' || confirmaChar == 'S') {
                        System.out.println("Quarto Básico Escolhido.");
                        return TipoQuarto.QUARTOBASICO;
                    }
                    opcaoQuarto = 0;
                    break;
                case 2:
                    System.out.println(TipoQuarto.QUARTOLUXO);
                    System.out.print("Deseja escolher esse quarto? (s/n) ");
                    confirmaChar = meuScanner.next().charAt(0);
                    meuScanner.nextLine();
                    if(confirmaChar == 's' || confirmaChar == 'S') {
                        System.out.println("Quarto de Luxo Escolhido.");
                        return TipoQuarto.QUARTOLUXO;
                    }
                    opcaoQuarto = 0;
                    break;
                case 3:
                    System.out.println(TipoQuarto.QUARTOPRESIDENCIAL);
                    System.out.print("Deseja escolher esse quarto? (s/n) ");
                    confirmaChar = meuScanner.next().charAt(0);
                    meuScanner.nextLine();
                    if(confirmaChar == 's' || confirmaChar == 'S') {
                        System.out.println("Quarto Presidencial Escolhido.");
                        return TipoQuarto.QUARTOPRESIDENCIAL;
                    }
                    opcaoQuarto = 0;
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.");
            }
        } while(opcaoQuarto<1 || opcaoQuarto>3);
        return TipoQuarto.QUARTOBASICO;
    }

    public static void listarReservas() {
        if(vetorReserva[0] == null) {
            System.out.println("\nNenhuma reserva feita.");
        } else {
            System.out.print("\nReservas Agendadas:");
            for (int reserva = 0; reserva < vetorReserva.length; reserva++) {
                if (vetorReserva[reserva] != null) {
                    System.out.println("\nReserva " + (reserva+1) + ":");
                    System.out.println(vetorReserva[reserva]);
                }
            }
        }
    }

    public static void buscarReservaPorNome() {
        if(vetorReserva[0] == null) {
            System.out.println("\nNão há quartos reservados.");
        } else {
            System.out.print("\nDigite o nome que deseja buscar: ");
            String nomeBusca = meuScanner.nextLine();
            String nome = nomeBusca.toLowerCase();

            boolean encontrou = false;

            for(int i = 0; i < vetorReserva.length; i++) {
                if(vetorReserva[i] != null) {
                    String aux = vetorReserva[i].getHospede().getNomeHospede().toLowerCase();
                    if(aux.contains(nome)) {
                        System.out.println("\nReserva com parte do nome de \""+ nomeBusca +"\" encontrado:");
                        System.out.println(vetorReserva[i]);

                        encontrou = true;
                    }
                }
            }
            if(!encontrou) {
                System.out.println("\nNenhuma reserva com parte do nome de \""+ nomeBusca +"\" foi encontrado.");
            }
        }
    }

    public static void ordenarVetorReservas() {
        if(vetorReserva[0] != null) {
            for(int i = 0; i < vetorReserva.length; i++) {
                for(int j = i; j < vetorReserva.length; j++) {
                    if(vetorReserva[i] != null && vetorReserva[j] != null && vetorReserva[j].getQuantidadeDias() > vetorReserva[i].getQuantidadeDias() ) {
                        Reserva aux = vetorReserva[i];
                        vetorReserva[i] = vetorReserva[j];
                        vetorReserva[j] = aux;
                    }
                }
            }
            System.out.println("\nOrdenação decrescente concluída.");
        } else {
            System.out.println("\nNão há quartos reservados.");
        }
    }

    public static void fazerCheckOut() {
        listarReservas();
        if(vetorReserva[0] != null) {
            int reservaASerRemovida = 0;
            do {
            reservaASerRemovida = lerInteiro("\nDigite o número da reserva que deseja fazer o Check-Out: ");
            } while(reservaASerRemovida < 1 || reservaASerRemovida > MAXIMO_DE_RESERVAS || vetorReserva[reservaASerRemovida-1] == null);

            System.out.print("Deseja remover a reserva de " + vetorReserva[reservaASerRemovida-1].getHospede().getNomeHospede() + "? (s/n) ");
            char confirmaChar = meuScanner.next().charAt(0);
            meuScanner.nextLine();
            if(confirmaChar == 's' || confirmaChar == 'S') {
                System.out.println("A Reserva de " + vetorReserva[reservaASerRemovida-1].getHospede().getNomeHospede() + " foi removida.");
                vetorReserva[reservaASerRemovida-1] = null;
                contadorReservas--;
                arrumarVetor(vetorReserva);
            } else {
                System.out.println("A Reserva de " + vetorReserva[reservaASerRemovida-1].getHospede().getNomeHospede() + " não foi removida.");
            }
        }
    }

    public static void arrumarVetor(Reserva[] vetorReserva) {
        for(int i = 0; i < vetorReserva.length; i++) {
            if(vetorReserva[i] == null && i+1 != MAXIMO_DE_RESERVAS) {
                vetorReserva[i] = vetorReserva[i+1];
                vetorReserva[i+1] = null;
            }
        }
    }

    public static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                int numero = meuScanner.nextInt();
                meuScanner.nextLine();
                return numero;
            } catch (java.util.InputMismatchException e) {
                System.out.println("\nErro: Entrada inválida. Por favor, digite apenas números inteiros.");
                meuScanner.nextLine();
            }
        }
    }
}
