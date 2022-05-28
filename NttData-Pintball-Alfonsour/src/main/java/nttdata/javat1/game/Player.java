package nttdata.javat1.game;
public class Player {
		private String nick;
		private static int credito;
		
		public static int contadorCredito() {
			return credito;
		}
		public static void consumirCredito() {
			credito -= 1;
		}
	}
	