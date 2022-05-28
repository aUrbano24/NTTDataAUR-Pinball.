package nttdata.javat1.game;

/**
 * Game Class
 *
 */
public class Game 
{
	private boolean encendido; //Por defecto estara apagado hasta que la partida empieze.
	private int tiradas; //1 tirada equivale a una partida.
	private int fuerza; //Fuerza con la que realizas la tirada. Se evalua del 0 al 9, siendo 1 poca fuerza y 9 mucha, asi como 0, no darle, es decir perder.
	private int tiempo; //
	
	public Game() {
		encendido = true;
		tiradas = Player.contadorCredito();
		fuerza = (int) ((Math.random() * 8) + 1);
		Player.consumirCredito();
	}

	public void launchAndStart() {
		
	}
	
}
