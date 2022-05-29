package nttdata.javat1.game;

/**
 * Game Class
 *
 */
public class Game {
	private static boolean encendido; // Por defecto estara apagado hasta que la partida empieze.

	public void launchAndStart() {
		encendido = true;

	}

	public void finalizarJuego() {
		encendido = false;
	}

	public boolean comprobarEstado() {
		return encendido;
	}
}
