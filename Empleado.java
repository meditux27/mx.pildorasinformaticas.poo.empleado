package mx.pildorasInformaticas.poo;
import java.util.*;

public class Empleado implements Comparable {

	private String nombre;
	private double salario;
	

	private double salarioI;
	private Date fecha_ingreso;
	 double porcentaje;
	 private static int idE=0;
	 private int id;
	 
	 
	 @Override
		public int compareTo(Object o) {
		 Empleado objeto=(Empleado)o;
		 
		 if(this.salario<objeto.salario)return -1;
		 if(this.salario>objeto.salario)return 1;
			return 0;
		}


	public Empleado(String nombre,double salario,int year,int month,int day) {
		
		this.nombre=nombre;
		this.salario=salario;
		this.salarioI=salario;
		GregorianCalendar fecha= new GregorianCalendar(year,month-1,day );
		fecha_ingreso=fecha.getTime();
		idE++;
		id=idE;
	}
	
	
	
	
	public void incremento(double porcentaje){
		
		this.porcentaje= (porcentaje/100)*salario;
		salario=this.porcentaje+salario;
		
		
	}
	
	
	
	public void datos() {
		System.out.println("\nId empleado "+id +" Nombre: "+nombre+" Salario inicial: "+salarioI+" Salario actual:"+this.salario+" Fecha ingreso: "+ fecha_ingreso );
	}
	

public double getsalario() {
		
		return salario;
	}


public String getnombre() {
	return nombre;
}






}
