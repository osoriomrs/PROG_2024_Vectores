package vectores;

public class Alumnos {

	private String nombre;
	private int DNI;
	
   public Alumnos(String nombre) {
		
		this.nombre=nombre;
		setgenerarDNI();
	}
	
   

     public String getNombre() {
       return nombre;
   }
	
	 public void setgenerarDNI() {
		
		DNI=(int)((Math.random()*99999999)+10000000);
	}

	@Override
	 public String toString() {
		return "Alumno [" + nombre + "( DNI=" + DNI + ")"+"]";
	}



	 public int getDNI() {
		// TODO Auto-generated method stub
		return DNI;
	}
	
   
   

}
