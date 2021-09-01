package factoryPaquete;

import heroePaquete.Heroe;
import villanoPaquete.Villano;


public interface AbstractFactory {
	

	public Heroe getHeroe(String nombre, String tipoPoder, int vida, int poder, String franquicia);
	public Villano getVillano(String nombre, String tipoPoder, int vida, int poder, String franquicia);
	
}
