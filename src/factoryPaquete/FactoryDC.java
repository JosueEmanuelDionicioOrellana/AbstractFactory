package factoryPaquete;

import heroePaquete.Heroe;
import heroePaquete.HeroeDC;

import villanoPaquete.Villano;
import villanoPaquete.VillanoDC;

public class FactoryDC implements AbstractFactory{

	@Override
	public Heroe getHeroe(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de método generado automáticamente
		return new HeroeDC(nombre,tipoPoder,100,poder,franquicia);
	}

	@Override
	public Villano getVillano(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		// TODO Esbozo de método generado automáticamente
		return new VillanoDC(nombre, tipoPoder, 100, poder, franquicia);
	}

	

} 
