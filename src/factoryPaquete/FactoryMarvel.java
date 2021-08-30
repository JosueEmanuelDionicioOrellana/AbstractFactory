package factoryPaquete;

import heroePaquete.Heroe;
import heroePaquete.HeroeMarvel;
import villanoPaquete.Villano;
import villanoPaquete.VillanoMarvel;

public class FactoryMarvel implements AbstractFactory {

	@Override
	public Heroe setHeroe(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de método generado automáticamente
		return new HeroeMarvel(nombre, tipoPoder, 100, poder, franquicia);
	}

	@Override
	public Villano setVillano(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de método generado automáticamente
		return new VillanoMarvel(nombre, tipoPoder, 100, poder, franquicia);
	}



}
 


 