package Vehiculos;

public class VehiculoGasolina extends Vehiculo {
	
	//Atributos propios de VehiculoGasolina:
	
	private float contaminacion;
	private float tamanyoDeposito;
	
	//Creamos constructor:
	
	public VehiculoGasolina() {
		
		this.contaminacion=0.0f;
		this.tamanyoDeposito=0.0f;
		
	}//cierra constructor
	
	//Creamos contrusctor sobrecarga:
	
	public VehiculoGasolina(float contamin, float tdepot) {
		
		this.contaminacion=contamin;
		this.tamanyoDeposito=tdepot;
		
	}//cierra constructor sobrecarga
	
	//Getters and setters

	public float getContaminacion() {
		return contaminacion;
	}

	public void setContaminacion(float contaminacion) {
		this.contaminacion = contaminacion;
	}

	public float getTamanyoDeposito() {
		return tamanyoDeposito;
	}

	public void setTamanyoDeposito(float tamanyoDeposito) {
		this.tamanyoDeposito = tamanyoDeposito;
	}
	
	//creación de metodos propios:
	
	/*public void print () {
		
		super.print();
		System.out.println("Combustible Gasolina "+" - "+"Contaminación "+this.contaminacion+" - "+"Deposito"+this.tamanyoDeposito+" litros");
		
		
	}//cierra metodo print*/
	

}//cierra clase VehiculoGasolina
