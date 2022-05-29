package nttdata.javat1.game;

public class Bounce {
	private int puntos; // Dependiendo donde rebote, el player obtendra unos puntos u otros (25, 50,
	// 100, 200, 500, 1000 ptos).
	private int nRebotes; // Numero de rebotes que se producen.

	public void calcularRebotes() { // Rebotes máximos : 15
		int probabilidad = 60;
		boolean continuar = true;
		while (continuar) {
			int aleatorio = (int) ((Math.random() * 659) + 1);
			if (aleatorio > probabilidad) {
				nRebotes++;
				probabilidad += 40;
			} else {
				continuar = false;
			}

		}
	}

	public int mostrarRebotes() {
		return nRebotes;
	}

	public void calcularPuntos(int nRebotes) {
		for (int i = 1; i <= nRebotes; i++) {
			int puntuar = (int) ((Math.random() * 5) + 1);
			switch (puntuar) {
				case 1:
					puntos += 25;
					break;
				case 2:
					puntos += 50;
					break;
				case 3:
					puntos += 100;
					break;
				case 4:
					puntos += 200;
					break;
				case 5:
					puntos += 500;
					break;
				case 6:
					puntos += 1000;
					break;

				default:
					break;
			}
		}
		Player.actualizarScore(puntos);
	}

	public int mostrarPuntos() {
		return puntos;
	}

	public void resetearRebotes() {
		puntos = 0;
		nRebotes = 0;
	}

}