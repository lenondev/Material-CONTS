package Empresa;

import Edificios.Almacen;
import Edificios.Edificio;
import Edificios.Fabrica;
import Edificios.Oficina;
import Productos.Producto;
import Productos.Puerta;
import Productos.Silla;
import Productos.Ventana;
import Vehiculos.VehiculoElectrico;
import Vehiculos.VehiculoGasoil;
import Vehiculos.VehiculoGasolina;

public class Empresa {
	
	
	//Vehiculos
	protected VehiculoElectrico ve1;
	protected VehiculoElectrico ve2;
	protected VehiculoGasolina vg1;
	protected VehiculoGasoil vd1;
	
	//Edificios
	protected Fabrica f1;
	protected Almacen a1;
	protected Oficina o1;
	
	//Productos
	protected Puerta p1;
	protected Puerta p2;
	protected Silla s1;
	protected Silla s2;
	protected Ventana v1;
	protected Ventana v2;
	
	
	//Constructor
	public Empresa () {
		ve1=new VehiculoElectrico();
		ve2=new VehiculoElectrico();
		vg1=new VehiculoGasolina();
		vd1=new VehiculoGasoil();
		
		f1=new Fabrica();
		a1=new Almacen();
		o1=new Oficina();
		
		p1=new Puerta();
		p2=new Puerta();
		s1=new Silla();
		s2=new Silla();
		v1=new Ventana();
		v2=new Ventana ();
		
	}//cierra constructor

	//Getters and Setters 

	public VehiculoElectrico getVe1() {
		return ve1;
	}


	public void setVe1(VehiculoElectrico ve1) {
		ve1 = ve1;
	}


	public VehiculoElectrico getVe2() {
		return ve2;
	}


	public void setVe2(VehiculoElectrico ve2) {
		ve2 = ve2;
	}


	public VehiculoGasolina getVg1() {
		return vg1;
	}


	public void setVg1(VehiculoGasolina vg1) {
		vg1 = vg1;
	}


	public VehiculoGasoil getVd1() {
		return vd1;
	}


	public void setVd1(VehiculoGasoil vd1) {
		vd1 = vd1;
	}


	public Fabrica getF1() {
		return f1;
	}


	public void setF1(Fabrica f1) {
		f1 = f1;
	}


	public Almacen getA1() {
		return a1;
	}


	public void setA1(Almacen a1) {
		a1 = a1;
	}


	public Oficina getO1() {
		return o1;
	}


	public void setO1(Oficina o1) {
		o1 = o1;
	}


	public Puerta getP1() {
		return p1;
	}


	public void setP1(Puerta p1) {
		p1 = p1;
	}


	public Puerta getP2() {
		return p2;
	}


	public void setP2(Puerta p2) {
		p2 = p2;
	}


	public Silla getS1() {
		return s1;
	}


	public void setS1(Silla s1) {
		s1 = s1;
	}


	public Silla getS2() {
		return s2;
	}


	public void setS2(Silla s2) {
		s2 = s2;
	}


	public Ventana getV1() {
		return v1;
	}


	public void setV1(Ventana v1) {
		v1 = v1;
	}


	public Ventana getV2() {
		return v2;
	}


	public void setV2(Ventana v2) {
		v2 = v2;
	}
	
	//método print
	
	public String print() {
		
		return ve1.print()+"\n"+ve2.print()+"\n"+vg1.print()+"\n"+vd1.print()+"\n"+a1.print()+"\n"+f1.print()+"\n"+o1.print()+"\n"+s1.print()+"\n"+s2.print()+"\n"+p1.print()+"\n"+p2.print()+"\n"+v1.print()+"\n"+v2.print();
		
		
	}//cierra print
	
	public boolean crearProducto(Producto pro) {
		
		if (this.p1==null||this.p2==null||this.s1==null||this.s2==null||this.v1==null||this.v2==null) 
		{	
			//cabe
			if (pro.getTipo().equals("Puerta")) 
			{
				if ((pro.getId()!=p1.getId()) && (pro.getId()!=p2.getId())) 
				{
					if (p1==null) 
					{
						this.p1= (Puerta) pro;
						return true;
					}
					else if (p2==null) {
						this.p2= (Puerta) pro;
						return true;
					}
					else {//no existe id
						return false;
					}
				}
				else {//existe id
					return false;
				}
			
			
			}
			else if(pro.getTipo().equals("Silla")) 
			{
				if ((pro.getId()!=s1.getId()) && (pro.getId()!=s2.getId())) 
				{
					if(s1==null) 
					{
						this.s1= (Silla) pro;
						return true;
					}
					else if (s2==null) {
						this.s2= (Silla) pro;
						return true;
					}
					else {//no existe id
						return false;
					}
				}
				else {//existe id
					return false;
				}
				
			}
			else if (pro.getTipo().equals("Ventana")) 
			{
				if ((pro.getId()!=v1.getId()) && (pro.getId()!=v2.getId())) 
				{
					if(v1==null) 
					{
						this.v1= (Ventana) pro;
						return true;
					}
					else if (v2==null) {
						this.v2= (Ventana) pro;
						return true;
					}
					else {//no existe id
						return false;
					}
				}
				else {//existe id
					return false;
				}
			}
			
		}
		else {
			return false;
		}
		
		return false;
		
	}//cierra crearProducto
	
	
	public boolean venderProducto(Producto pro) {
		
		if (pro.getTipo().equals("Puerta")) 
		{
			if ((pro.getId()!=p1.getId()) && (pro.getId()!=p2.getId())) 
			{
				return false;
			}
			else 
			{
				if (pro.getId()==p1.getId() && p1.getEdificioActual().getTipoEdificio().equals("Almacen")) 
				{
					//producto vendido
					p1=null;
					return true;	
				}
				if (pro.getId()==p2.getId() && p2.getEdificioActual().getTipoEdificio().equals("Almacen")) 
				{
					//producto vendido
					p2=null;
					return true;	
				}				
			}
			
		}
		else if (pro.getTipo().equals("Silla")) 
		{
			if ((pro.getId()!=s1.getId()) && (pro.getId()!=s2.getId())) 
			{
				return false;
			}
			else 
			{
				if (pro.getId()==s1.getId() && s1.getEdificioActual().getTipoEdificio().equals("Almacen")) 
				{
					//producto vendido
					s1=null;
					return true;	
				}
				if (pro.getId()==s2.getId() && s2.getEdificioActual().getTipoEdificio().equals("Almacen")) 
				{
					//producto vendido
					s2=null;
					return true;	
				}
			}
		}
		else if (pro.getTipo().equals("Ventana")) 
		{
			if ((pro.getId()!=v1.getId()) && (pro.getId()!=v2.getId())) 
			{
				return false;
			}
			else 
			{
				if (pro.getId()==v1.getId() && v1.getEdificioActual().getTipoEdificio().equals("Almacen")) 
				{
					//producto vendido
					v1=null;
					return true;	
				}
				if (pro.getId()==v2.getId() && v2.getEdificioActual().getTipoEdificio().equals("Almacen")) 
				{
					//producto vendido
					v2=null;
					return true;	
				}
			}
		}
		return true;
		
	}//cierra venderProducto.
	
	public boolean cambiarUbicacion(Producto pro, Edificio edi) {
		
		if ((pro.getId()==p1.getId())) {
			p1.setEdificioActual(edi);
		}
		else if ((pro.getId()==p2.getId())) {
			p2.setEdificioActual(edi);
		}
		else if ((pro.getId()==s1.getId())) {
			s1.setEdificioActual(edi);
		}
		else if ((pro.getId()==s2.getId())) {
			s2.setEdificioActual(edi);
		}
		else if ((pro.getId()==v1.getId())) {
			v1.setEdificioActual(edi);
		}
		else if ((pro.getId()==v2.getId())) {
			v2.setEdificioActual(edi);
		}
		return true;
		
	}//cierra cambiarUbicaciónS

}//cierra clase Empresa.
