package nttdata.javat1.game;
public class Player {
		private static String nick;
		private static int credito;
		
		public static int contadorCredito() {
			return credito;
		}
		public static void consumirCredito() {
			credito -= 1;
		}
		public static void cambiarNombre(String nombre) {
			nick = nombre;
		}
		public static void rondas (int rondas) {
			credito = rondas;
		}
	}
	