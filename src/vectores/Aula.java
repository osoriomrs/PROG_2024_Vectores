package vectores;

import java.io.PrintStream;
import java.util.Arrays;

public class Aula {
	
	private int capacidad;
	private int alumnos[];
	private int cantidadAlumnos;
	
	public Aula(int capacidad) {
		
		this.capacidad=capacidad;
		this.cantidadAlumnos=0;
		this.alumnos=new int[capacidad];
	}
	public void addAlumnos() {
		
        if (cantidadAlumnos < alumnos.length) {
			
			cantidadAlumnos++;
			
		} else {
			
		
		
	}
			
		}
		
	@Override
	public String toString() {
		return "Aula [capacidad=" + capacidad + "]";
	}
	
	
		
		
			
		
	
	
	
	
	
	




	
}
