package Vehiculos;

public class Vehiculo implements GestionVehiculo {
	
	//Atributos principales de la clase vehículo:
	
	protected String marca;
	protected float velocidadActual;
	protected boolean  estaArrancado;
	protected float precio;
	protected float peso;
	protected String color;
	protected float longitud;
	

	//Creamos constructor:
	
	public Vehiculo () {
		
		this.marca="";
		this.velocidadActual=0.0f;
		this.estaArrancado=false;
		this.precio=0.0f;
		this.peso=0.0f;
		this.color="";
		this.longitud=0.0f;
				
	}//cierra contructor.
	
	//Creamos constructor sobrecargado.
	
	public Vehiculo (String marc, float veloAct, boolean estarrancado, float price,float peso, String color,float longit ) {
		this.marca=marc;
		this.velocidadActual=veloAct;
		this.estaArrancado=estarrancado;
		this.precio=price;
		this.peso=peso;
		this.color=color;
		this.longitud=longit;
		
	}//cierra constructor sobrecarga.

	//Getters and setters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(float velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean getEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
	//Creación de métodos propios.
	
	public String print() {
		
	System.out.println("Características del coche: "+this.marca+" - "+this.velocidadActual+" km/hr"+" - "+ this.estaArrancado+" - "+this.precio+ " €"+" - "+this.peso+" kg"+" - "+this.color+" - "+this.longitud+" mts");	
		return"";
	}//cierra método print.
	
	//Implementación de los métodos de la interfaz GestiónVehiculo.


	public boolean acelerar(float incremento) {
		if (this.estaArrancado!=false) {
			this.velocidadActual+=incremento;
			return true;	
		}  
		else {
			return false;
		}
		
	}//cierra acelerar.


	public boolean frenar(float decremento) {
		if (this.estaArrancado!=false) {
			this.velocidadActual-=decremento;
			return true;
		} 
		else {
			return false;
		}
		
	}//cierra frenar.


	public boolean arrancar() {
		if (this.estaArrancado==false) {
			return true;
		} else {
			return false;
		}
		
	}//cierra arrancar.


	public boolean parar() {
		if (this.estaArrancado!=false) {
			return true;
		} else {
			return false;
		}
		
	}//cierra frenar.
	
	
	
	
}//cierra clase Vehículo.



