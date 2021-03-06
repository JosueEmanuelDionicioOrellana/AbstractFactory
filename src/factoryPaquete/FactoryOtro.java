package factoryPaquete;

import heroePaquete.Heroe;
import heroePaquete.HeroeOtro;
import villanoPaquete.Villano;
import villanoPaquete.VillanoOtro;

public class FactoryOtro implements AbstractFactory {

	@Override
	public Heroe getHeroe(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de método generado automáticamente
		return new HeroeOtro(nombre, tipoPoder, 100, poder, franquicia);
	}

	@Override
	public Villano getVillano(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de método generado automáticamente
		return new VillanoOtro(nombre, tipoPoder, 100, poder, franquicia);
	}

}
