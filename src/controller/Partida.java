package controller;

import model.Jogada;

import java.util.Random;

import static model.Jogador.jogadax;

public class Partida {


    int vitoriasJogador= 0;
    int vitoriasComputador = 0;

    public void iniciarJogo() {

        Random x = new Random();
        Jogada jogador = null;

        while(jogador != Jogada.EXIT) {

            System.out.println();

            jogador = Jogada.values()[jogadax()];

            if(jogador == Jogada.EXIT ){
                System.out.println("-=- Partida encerrada... -=-");
                break;
            }

            Jogada computador = Jogada.values()[x.nextInt(0, 3)];

            System.out.println("Você jogou: " + jogador);
            System.out.println("O computador jogou: " + computador);




            if (jogador == computador) {
                System.out.println("Empate!");
            } else {

                if (jogador.venceDe(computador)) {
                    vitoriasJogador ++;
                    System.out.println("Você venceu! Wins: " +vitoriasJogador);
                } else {
                    vitoriasComputador++;
                    System.out.println("O computador venceu. Wins: "+ vitoriasComputador);
                }

                if(vitoriasJogador == 10 ) {
                    System.out.println("Você completou "+vitoriasJogador +" vitórias.Você venceu!");
                    jogador = Jogada.EXIT;
                }if(vitoriasComputador == 10){
                    System.out.println("O computador completou "+ vitoriasComputador +" vitórias.Você perdeu!");
                    jogador = Jogada.EXIT;

                }


            }
        }
    }
}