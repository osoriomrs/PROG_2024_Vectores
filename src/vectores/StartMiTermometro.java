package vectores;

public class StartMiTermometro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiTermometro t=new MiTermometro();
		
		t.add(5);
		t.add(11);
		t.add(15);
		t.add(9);
		t.add(4);
		t.add(3);
		t.add(7);
		
		System.out.println(t);
		System.out.println(t.buscar(3));
		System.out.println(t.buscarPrimero(1));
		

	}

}
