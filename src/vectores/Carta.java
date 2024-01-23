package vectores;

public class Carta {
	
	private char valor;
	private char palo;
	
	public char getValor() {
		return valor;
	}
	public void setValor(char valor) {
		this.valor = valor;
	}
	public char getPalo() {
		return palo;
	}
	public void setPalo(char palo) {
		this.palo = palo;
	}
	
	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}
	
	
	
	
	
	

}
