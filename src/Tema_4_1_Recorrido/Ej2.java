package Tema_4_1_Recorrido;

import java.util.Scanner;

public class Ej2 {

	@SuppressWarnings("resource")
	public void Posicion() {
		boolean valor;
		Scanner sc = new Scanner(System.in);

		int[] posiciones = { 4, 13, 25, 37, 49, 55, 64, 37, 28 };

		System.out.print("Escribe true: ");
		valor = sc.nextBoolean();

		if (valor == true) {
			for (int i = 0; i < posiciones.length; i++) {
				if (i % 2 == 0) {
					System.out.println("Posicion " + i + " -> " + posiciones[i]);
				}
			}

		}
		if (valor == false) {
			for (int i = 0; i < posiciones.length; i++) {
				if (i % 2 != 0) {
					System.out.println("Posicion " + i + " -> " + posiciones[i]);
				}
			}
		}

	}

	public static void main(String[] args) {
		new Ej2().Posicion();

	}

}
