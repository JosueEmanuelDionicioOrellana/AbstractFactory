package factoryPaquete;


import heroePaquete.Heroe;
import heroePaquete.HeroeNintendo;
import villanoPaquete.Villano;
import villanoPaquete.VillanoNintendo;
public class FactoryNintendo implements AbstractFactory{

	@Override
	public Heroe getHeroe(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de método generado automáticamente
		return new HeroeNintendo(nombre, tipoPoder, 100, poder, franquicia);
	}

	@Override
	public Villano getVillano(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de método generado automáticamente
		return new VillanoNintendo(nombre, tipoPoder, 100, poder, franquicia);
	}


}
