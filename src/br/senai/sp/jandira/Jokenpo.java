package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();

		int jogador;
		int pc = aleatorio.nextInt(3);

		System.out.println("*******************************");
		System.out.println("         J O K E N P Ô         ");
		System.out.println("*******************************");
		System.out.println("");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("");

		System.out.println("--------------------------------");
		System.out.println("Faça sua escolha (1 à 3)");

		jogador = teclado.nextInt();

		System.out.println("");

		if (jogador == 1) {
			System.out.println("Você escolheu ---> PEDRA!");

		} else if (jogador == 2) {
			System.out.println("Você escolheu ---> PAPEL!");

		} else {
			System.out.println("Você escolheu ---> TESOURA!");
		}

		if (pc == 0) {
			pc = aleatorio.nextInt(3);

		} else if (pc == 1) {
			System.out.println("O PC escolheu ---> PEDRA!");

		} else if (pc == 2) {
			System.out.println("O PC escolheu ---> PAPEL!");

		} else if (pc == 3) {
			System.out.println("O PC escolheu ---> TESOURA!");
		}

		System.out.println("");

		if (pc == jogador) {
			System.out.println("*******************************");
			System.out.println("*********** EMPATE!! **********");
			System.out.println("*******************************");

		} else {
			if ((jogador == 1 && pc == 3) || (jogador == 2 && pc == 1) || (jogador == 3 && pc == 2)) {
				System.out.println("*******************************");
				System.out.println("*********** PARABÉNS! *********");
				System.out.println("********* VOCÊ VENCEU! ********");
				System.out.println("*******************************");
			} else {
				System.out.println("*******************************");
				System.out.println("*********** QUE PENA! *********");
				System.out.println("********* O PC VENCEU! ********");
				System.out.println("*******************************");

			}
		}
	}
}