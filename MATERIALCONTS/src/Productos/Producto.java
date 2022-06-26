package Productos;

import Edificios.Edificio;
import Edificios.Oficina;

public class Producto {
	
	protected int id;
	protected String nombre;
	protected String tipo;	
	protected float anchura;
	protected float profundidad;
	protected float altura;
	protected String color;
	protected Edificio edificioActual;
	
	//creamos constructor:
	
	public Producto() {
		
		this.id=0;
		this.nombre="";
		this.tipo="";
		this.anchura=0.0f;
		this.profundidad=0.0f;
		this.altura=0.0f;
		this.color="";
		this.edificioActual = new Oficina();
		
	}//cierra constructor
	
	//creamos constructor sobrecarga
	
	public Producto(int id, String nomb, String type, float anch, float profun, float alt, String col) {
		
		this.id=id;
		this.nombre=nomb;
		this.tipo=type;
		this.anchura=anch;
		this.anchura=anch;
		this.profundidad=profun;
		this.altura=alt;
		this.color=col;
		
	}//cierra constructor sobrecarga
	
	//Getters and setters
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public Edificio getEdificioActual() {
		return edificioActual;
	}

	public void setEdificioActual(Edificio edificioActual) {
		this.edificioActual = edificioActual;
	}
	
	public String print () {
		
		return "Detalles producto: "+this.id+" - "+this.nombre+" - "+this.tipo+" - "+this.anchura+" - "+ this.profundidad+" - "+this.profundidad+" - "+this.color;
		
	}//cierra metodo print.
	

}//cierra clase Producto.
