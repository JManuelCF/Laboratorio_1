package test;

import carros.CarroBase;
import carros.Crossover;
import carros.Pickup;
import carros.Sedan;
import motores.MotorDiesel;
import motores.MotorGasolina;

public class Test {
		
	public static void main(String[] args) {
	       
		MotorGasolina motorGasolina = new MotorGasolina();
		MotorDiesel motorDiesel = new MotorDiesel();
		
		CarroBase carro = new Pickup(motorGasolina);
		carro.imprimirCategoria();
			
		CarroBase carro2 = new Sedan(motorDiesel);
		carro2.imprimirCategoria();
		
		CarroBase carro3 = new Crossover(motorGasolina);
		carro3.imprimirCategoria();
	}	
}