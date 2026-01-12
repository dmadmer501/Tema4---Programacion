package Tema_4_1_Recorrido;

public class Ej1 {

	public void Posicion() {
		int[] posiciones = { 0, 1, 2, 3, 4, 5, 6 };
		for (int posicion : posiciones) {
			if (posicion % 2 == 0) {
				System.out.println("Posición " + posicion + "-> Par");
			} else {
				System.out.println("Posición " + posicion + "-> Impar");
			}
		}
	}

	public static void main(String[] args) {
		new Ej1().Posicion();
	}

}
