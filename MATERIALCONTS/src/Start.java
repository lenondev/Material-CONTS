import Edificios.Almacen;
import Edificios.Edificio;
import Edificios.Fabrica;
import Edificios.Oficina;
import Empresa.Empresa;
import Productos.Producto;
import Productos.Puerta;
import Productos.Silla;
import Productos.Ventana;
import Vehiculos.VehiculoElectrico;
import Vehiculos.VehiculoGasoil;
import Vehiculos.VehiculoGasolina;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa emp = new Empresa();
		
		//Vehículos
		
		VehiculoElectrico ve1 = new VehiculoElectrico();
		VehiculoElectrico ve2 = new VehiculoElectrico();
		VehiculoGasolina vg1 = new VehiculoGasolina();
		VehiculoGasoil vd1 = new VehiculoGasoil();
		
		//arrancamos vehiculos electricos
		ve1.setEstaArrancado(true);
		ve2.setEstaArrancado(true);
		ve1.setVelocidadActual(50.0f);
		ve2.setVelocidadActual(50.0f);
		
		//arrancamos vehiculos gasolina y diesel
		vg1.setEstaArrancado(true);
		vd1.setEstaArrancado(true);
		vg1.setVelocidadActual(80.0f);
		vd1.setVelocidadActual(80.0f);
		
		//frenamos vehiculos gasolina y diesel
		vg1.frenar(20.0f);
		vd1.frenar(20.0f);
		
		//metemos los 4 vehiculos a la empresa.
		
		emp.setVe1(ve1);
		emp.setVe2(ve2);
		emp.setVg1(vg1);
		emp.setVd1(vd1);
		
		//creamos edificios de la empresa
		
		Edificio fabrica = new Fabrica();
		Edificio almacen = new Almacen();
		Edificio oficina = new Oficina();
		
		//calculamos precio de pintura de uno de los edificios.
		
		fabrica.costePintura("verde", 40.0f);
		System.out.println(fabrica.costePintura("verde", 40.0f));
		
		
		//creamos productos
		
		Producto puerta1 = new Puerta();
		Producto puerta2 = new Puerta();
		Producto silla1 = new Silla();
		Producto silla2 = new Silla();
		Producto ventana1 = new Ventana();
		Producto ventana2 = new Ventana();
		
		//llamamos la creación de un producto.
		emp.crearProducto(ventana2);
		
		
		//asignamos id de productos
		puerta1.setId(1);
		puerta2.setId(2);
		
		silla1.setId(3);
		silla2.setId(4);
		
		ventana1.setId(5);
		ventana2.setId(6);
		
		//vendemos puerta id 1
		emp.venderProducto(puerta1);
		
		//vendemos silla id 3
		emp.venderProducto(silla1);
		
		//instanciamos puerta nueva
		Producto puertaNueva = new Puerta();
		
		//asignamos id 2
		puertaNueva.setId(2);
		
		//creamos producto puerta nueva.
		emp.crearProducto(puertaNueva);
		
		//instanciamos otra puerta nueva.
		Producto otraPuerta = new Puerta();
		
		//asignamos id 10 a la otraPuerta.
		otraPuerta.setId(10);
		
		//System.out.println(emp.print());
		

	}//cierra método main

}
