package application;

import java.util.Scanner;
import entities.Reserva;

public class Menu {
    public static void main(String[] args) {

        Scanner meuScanner = new Scanner(System.in);
        final int MAXIMO_DE_RESERVAS = 10;

        System.out.println("Bem-vindo ao Programa de Reservas de Quartos de Hotel!");

        selecionarOpcaoMenu(meuScanner);

        meuScanner.close();
    }

    public static void selecionarOpcaoMenu(Scanner meuScanner) {
        int opcaoUsuario = 0;

        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1- Cadastrar nova reserva.\n2- Listar reservas.\n3- Buscar reserva por nome do hóspede.\n4- Ordenar reservas por números de dias em ordem crescente.\n5- Sair do programa.");
            System.out.print("\nDigite o número de uma das opções: ");
            opcaoUsuario = meuScanner.nextInt();
            meuScanner.nextLine();

            switch(opcaoUsuario) {
                case 1:
                    break;
                case 2:
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
}
