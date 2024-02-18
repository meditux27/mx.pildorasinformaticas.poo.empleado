package mx.pildorasInformaticas.poo;

public class Gerencia extends Empleado{

	private double incentivo;
	

	public Gerencia(String nombre,double salario,int year,int month,int day) {
		
		super (nombre, salario, year, month, day);
	}
	
	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
		
	}
	
		
	public double incremento() {
		return incentivo= incentivo+super.getsalario();
	}
	

	
	public void datos() {
		/*System.out.println("Id Gerente " +super.getId()+" \nNombre: "+super.getNombre()+" Salario inicial: "+super.getSalarioI()
		+" Salario actual:"+incremento()+" Fecha ingreso: "+super.getFecha_ingreso()  );*/
		super.datos();
		System.out.println("Salario Gerente "+incremento());
	}
		
	}




	

