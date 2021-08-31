package factoryPaquete;

import heroePaquete.Heroe;
import heroePaquete.HeroeMarvel;
import villanoPaquete.Villano;
import villanoPaquete.VillanoMarvel;

public class FactoryMarvel implements AbstractFactory {

	@Override
	public Heroe getHeroe(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return new HeroeMarvel(nombre, tipoPoder, 100, poder, franquicia);
	}

	@Override
	public Villano getVillano(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return new VillanoMarvel(nombre, tipoPoder, 100, poder, franquicia);
	}



}
 


 