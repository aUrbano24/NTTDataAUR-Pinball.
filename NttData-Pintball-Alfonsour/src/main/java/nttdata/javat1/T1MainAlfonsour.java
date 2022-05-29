package nttdata.javat1;

import nttdata.javat1.game.Game;
import nttdata.javat1.game.Player;

public class T1MainAlfonsour {
	public static void main(String[] args) {
		//Objetos creados
		Game g1;
		g1 = new Game();

		Player p1;
		p1 = new Player();
		//Peticiones al usuario (nombre de jugador y rondas a jugar.)
		System.out.print("Introduce tu nombre de jugador:\n");
		String nombre = System.console().readLine();
		System.out.print("Cuantas rondas quieres jugar:\n");
		int rondas = Integer.parseInt(System.console().readLine());
		//Aplicar los datos consultados;
		Player.cambiarNombre(nombre);
		Player.rondas(rondas);
	}
}