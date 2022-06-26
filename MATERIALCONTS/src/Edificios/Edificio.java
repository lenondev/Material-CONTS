package Edificios;

public abstract class Edificio {
	
	//Atributos genéricos que compartiran los Edificios.
	
	protected float anchura;
	protected float altura;
	protected float profundidad;
	protected String material;
	protected String tipo;
	protected float precioMercado;
	protected String color;
	
	//creamos constructor:
	
	public Edificio() {
		this.anchura=0.0f;
		this.altura=0.0f;
		this.profundidad=0.0f;
		this.material="";
		this.tipo="";
		this.precioMercado=0.0f;
		this.color="";
		
	}//cierra constructor.
	
	//Sobrecarga constructor:
	
	public Edificio (float anch, float altu, float profun, String mater, String tipEdi, float price, String col) {
		this.anchura=anch;
		this.altura=altu;
		this.profundidad=profun;
		this.material=mater;
		this.tipo=tipEdi;
		this.precioMercado=price;
		this.color=col;
		
	}//cierra constructor sobrecarga
	
	//Getters and Setters

	public float getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTipoEdificio() {
		return tipo;
	}

	public void setTipoEdificio(String tipoEdificio) {
		this.tipo = tipoEdificio;
	}

	public float getPrecioMercado() {
		return precioMercado;
	}

	public void setPrecioMercado(float precioMercado) {
		this.precioMercado = precioMercado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Creación de métodos propios:
	
	public String print() {
		return "Datos del edificio: "+this.anchura+" - "+this.altura+" - "+this.profundidad+" - "+this.material+" - "+this.tipo+" - "+ this.precioMercado+" - "+this.color;
		
	}//cierra método print.
	
	
	//Creamos método abstracto:
	
	public abstract String funcionalidadEdificio();
	
	//Creamos metodo costePintura.
	
	public float costePintura (String c, float precioXMetro) {
		float coste;
		if (precioXMetro >= 0) {
			coste = precioXMetro+this.anchura*this.altura*this.profundidad;
			return coste;
		} else {
			return -1;
			
		}
		
		
	}//cierra método costePintura
	
	//Creamos metodo costePintura con sobrecarga.
	
	public float costePintura (String c, float precioXMetro, String parametro) {
		float coste =0.0f;
		float negativo = -1;
		if (parametro.equals("ladoanchura")) {
			coste = precioXMetro*this.anchura*this.altura;
		}
		else if (parametro.equals("ladoprofundidad")) {
			coste = precioXMetro*this.altura*this.profundidad;
		}
		else if (coste<=0) {
			coste=negativo;
		}
		return coste;
		
	}//cierra método costeEdificio
	

}//cierra clase edificio.
