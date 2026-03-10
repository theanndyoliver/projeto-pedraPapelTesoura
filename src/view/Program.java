package view;

import controller.Partida;

public class Program {

    public static void main(String[] args) {

        System.out.println("-=========================================================================-");
        System.out.println("Bem vindo ao PEDRA,PAPEL E TESOURA! Quem ganhar 10 partidas primeiro vence!");
        System.out.println("-=========================================================================-");

        Partida x = new Partida();
        x.iniciarJogo();
    }
}
