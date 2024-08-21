package Avaliacao01;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int num1, num2, num3 = 0, num4, num5;
		System.out.println("informe um número inteiro:");
		Scanner ler = new Scanner(System.in);
		num1 = ler.nextInt();
		num2 = num1 * 10;
		if (num2 >= 10) {
			System.out.println("você digitou um número positivo");
		} else {
			System.out.printf("você digitou um número negativo.%nInforme um segundo número inteiro:%n");
			num3 = ler.nextInt();
		}
		num4 = (num1 + num3) * 2;
		System.out.printf(
				"O número informado multiplicado por 2 ou a soma dos números informados multiplicada por 2 é igual a %d",
				num4);
		System.out.printf("%ninforme um novo número inteiro:%n");
		num5 = ler.nextInt();
		if (num5 < 0) {
			num5 = num5 * (-1);
		}
		System.out.printf("Seu número foi transformado para positivo e agora é igual a %d ", num5);
		System.out.printf("%nfim da prova");
		ler.close();

	}

}
