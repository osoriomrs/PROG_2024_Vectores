package vectores;

import java.util.Arrays;
import java.util.Iterator;

public class MiTermometro {
	
     private float temperaturas[];
     private int donde;
     

	
	public MiTermometro() {
		
		temperaturas=new float[7];
		donde=0;
	}
	public void add(float valor) {
		
		temperaturas[donde]=valor;
		donde++;
		
		if(donde==temperaturas.length) {
			
			donde=0;
		}
	}
	
	public int buscar(float valor) {
		
		int posicion=-1;
		for (int i = 0; i < temperaturas.length; i++) {
			
			if(temperaturas[i]==valor) {
			posicion=i;			
		}
			
		}
		return posicion;
	}
	
	public int buscarPrimero(float valor) {
		
		int posicion=0;
		for(int i=0;i<temperaturas.length;i++) {
			
			if(temperaturas[i]==valor) {
				
				posicion=i;
				
			}
		}
		return posicion;
	}


	@Override
	public String toString() {
		return "MiTermometro [temperaturas=" + Arrays.toString(temperaturas) + ", posicion=" + donde + "]";
	}

	

}
