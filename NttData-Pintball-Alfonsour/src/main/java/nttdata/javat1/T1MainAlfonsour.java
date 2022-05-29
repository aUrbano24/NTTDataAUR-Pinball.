package nttdata.javat1;

import nttdata.javat1.game.Game;
import nttdata.javat1.game.Player;
import nttdata.javat1.game.Bounce;

public class T1MainAlfonsour {
	public static void main(String[] args) {
		// Objetos creados
		Game g1;
		g1 = new Game();

		Player p1;
		p1 = new Player();
		Bounce b1;
		b1 = new Bounce();
		// Peticiones al usuario (nombre de jugador y rondas a jugar.)
		System.out.print("Introduce tu nombre de jugador: ");
		String nombre = System.console().readLine();
		System.out.print("Cuantas rondas quieres jugar: ");
		int rondas = Integer.parseInt(System.console().readLine());
		// Aplicar los datos consultados;
		p1.cambiarNombre(nombre);
		p1.actualizarCredito(rondas);

		// INICIALIZAR JUEGO
		System.out.print("Pulsa intro para empezar a jugar:\n");
		System.console().readLine();

		g1.launchAndStart();

		do {

			// Comenzar partida

			// Representación de la tirada:

			for (int i = 1; i <= rondas; i++) {
				// Reprentación del nombre y creditos en la parte de arriba.
				System.out.print("Nick: " + p1.mostrarNombre() + "\nRondas restantes: " + p1.monstarCredito() + "\n"
						+ "Score: " + p1.monstarScore() + "\n");
				System.out.println("-------------------------------------------------------------------------");
				b1.resetearRebotes();
				System.out.print("\n" + i + "º Tirada: \n");
				b1.calcularRebotes();
				b1.calcularPuntos(b1.mostrarRebotes());
				System.out.print("Nº Rebotes: " + b1.mostrarRebotes());
				System.out.print("\nNº Puntos: " + b1.mostrarPuntos());
				p1.consumirCredito();
				System.out.print("\nPulsa intro para realizar la siguiente tirada:\n\n");
				System.console().readLine();
			}
			// Comprobar creditos.
			if (p1.contadorCredito() >= 0) {
				g1.finalizarJuego();
			}

		} while (g1.comprobarEstado());

		System.out.print("*******************************************\nResultado final: \nNombre:" + nombre
				+ "\nRondas Jugadas:" + rondas + "\nScore Conseguido: "
				+ p1.monstarScore() + "\n*******************************************");

	}
}