package Vehiculos;

public interface GestionVehiculo {
	
		boolean acelerar(float incremento);
		boolean frenar (float decremento);
		boolean arrancar ();
		boolean parar ();

}//cierra interfaz GestionVehiculo
