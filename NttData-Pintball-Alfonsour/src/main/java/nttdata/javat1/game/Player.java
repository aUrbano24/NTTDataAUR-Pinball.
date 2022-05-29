package nttdata.javat1.game;

public class Player {
	private String nick;
	private int credito;
	private static int score;

	public int contadorCredito() {
		return credito;
	}

	public void consumirCredito() {
		credito -= 1;
	}

	public void cambiarNombre(String nombre) {
		nick = nombre;
	}

	public String mostrarNombre() {
		return nick;
	}

	public void actualizarCredito(int rondas) {
		credito = rondas;
	}

	public int monstarCredito() {
		return credito;
	}

	public static void actualizarScore(int puntos) {
		score += puntos;
	}

	public int monstarScore() {
		return score;
	}
}
