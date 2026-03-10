package model;

import java.util.Scanner;

public class Jogador {

    public static int jogadax() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua jogada (1-PEDRA, 2-PAPEL , 3-TESOURA , 4- SAIR ): ");
        int jogadax = sc.nextInt()-1;

        return jogadax;
    }

}
