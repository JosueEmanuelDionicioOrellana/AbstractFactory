package factoryPaquete;

import heroePaquete.Heroe;
import heroePaquete.HeroeOtro;
import villanoPaquete.Villano;
import villanoPaquete.VillanoOtro;

public class FactoryOtro implements AbstractFactory {

	@Override
	public Heroe setHeroe(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return new HeroeOtro(nombre, tipoPoder, 100, poder, franquicia);
	}

	@Override
	public Villano setVillano(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return new VillanoOtro(nombre, tipoPoder, 100, poder, franquicia);
	}

}
