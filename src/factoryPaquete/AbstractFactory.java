package factoryPaquete;

import heroePaquete.Heroe;
import villanoPaquete.Villano;


public interface AbstractFactory {
	
	public Heroe setHeroe(String nombre, String tipoPoder, int vida, int poder, String franquicia);
	public Villano setVillano(String nombre, String tipoPoder, int vida, int poder, String franquicia);
	
}
