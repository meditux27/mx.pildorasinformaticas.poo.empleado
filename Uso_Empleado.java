package mx.pildorasInformaticas.poo;

import java.util.Arrays;

public class Uso_Empleado {
	
	
	public static void main(String[] args) {
		
	Gerencia jefe_RRHH=new Gerencia("Paleton", 12000, 2000, 6, 1);
	jefe_RRHH.setIncentivo(4000);
	
	// instanciando con principio de sustitucion 
	Empleado jefe_capacitacion=new Gerencia("Diana", 15000, 2000, 7, 12);
	Comparable empleado_temporal=new Empleado("Fulanito",9000, 2005, 10, 8);
	
		Empleado [] integrantes=new Empleado[7];
		
		integrantes[0]=new Empleado("Miguel", 9800, 2022, 9, 12);
		integrantes[1]=new Empleado("Rocko", 10500, 2022, 5, 10);;
		integrantes[2]=new Empleado("Tita", 7000, 2022, 3, 8);
		integrantes[3]=jefe_RRHH;
		integrantes[4]=new Gerencia("Angel", 20000, 2022, 3, 8);
		integrantes[5]=jefe_capacitacion;
		integrantes[6]=(Empleado) empleado_temporal;
		
		
		Gerencia jefe_Finan= (Gerencia)integrantes[4];
		jefe_Finan.setIncentivo(1);
		
		
		// Ejemplo del uso de instanceof 
		
		if(jefe_capacitacion instanceof Empleado) 
			System.out.println(jefe_capacitacion.getnombre()+" Jefe_capacitacion pertenece a la clase Empleado");
		
		if(jefe_capacitacion instanceof Gerencia) 
			System.out.println(jefe_capacitacion.getnombre()+" Jefe_capacitacion pertenece a la clase Gerencia");
		
		if(jefe_capacitacion instanceof Comparable) 
			System.out.println(jefe_capacitacion.getnombre()+" Jefe_capacitacion pertenece a la clase Comparable");
		System.out.println("::::::::::::::::::");
		
		if(empleado_temporal instanceof Empleado) 
			System.out.println(((Empleado) empleado_temporal).getnombre()+" empleado_temporal pertenece a la clase Empleado");
		
		if(empleado_temporal instanceof Gerencia) 
			System.out.println(((Empleado) empleado_temporal).getnombre()+" empleado_temporal pertenece a la clase Gerencia");
		
		if(empleado_temporal instanceof Comparable) 
			System.out.println(((Empleado) empleado_temporal).getnombre()+" empleado_temporal pertenece a la clase Comparable");
		
		System.out.println("::::::::::::::::::");
		
		// implementacion del metodo de ordenamiento Arrays
		Arrays.sort(integrantes);
		
		for(Empleado i: integrantes) {
			i.incremento(5);
			i.datos();
		}
		
		

		
		
}
  

}


