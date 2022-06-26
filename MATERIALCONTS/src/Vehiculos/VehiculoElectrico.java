package Vehiculos;

public class VehiculoElectrico extends Vehiculo {
	
	//Atributos exclusivos de VehiculoElectrico:
	
	private float potencia;
	private float velocidadMaxima;
	
	//creamos contructor:
	
	public VehiculoElectrico() {
		
		this.potencia=0.0f;
		this.velocidadMaxima=0.0f;
		
	}//cierra constructor.
	
	//Creamos constructor sobrecarga.
	
	public VehiculoElectrico(float poten, float velMax) {
		
		this.potencia=poten;
		this.velocidadMaxima=velMax;
		
	}//cierra constructor sobrecarga.
	
	//Getters and setters

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//Creamos métodos propios.
	
	/*public void print() {
		
		super.print();
		System.out.println("Combustible Electricidad "+this.potencia+" - "+this.velocidadMaxima+" Km/hr");
		
	}//cierra metodo print.*/

}//cierra clase VehiculoElectrico.
