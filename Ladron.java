package javanesYmazmoras;

public class ladron extends personaje {
	boolean invisible=false;
	
	public ladron(String nombre, int nivel, int puntosVida, boolean protegido, boolean invisible) {
		 super(nombre, nivel, puntosVida, protegido);
	       this.invisible = invisible;
	}
	public void robar() {
		if (invisible==true) System.out.println("El ladrón roba sin ser visto...");
		else System.out.println("El ladrón roba a plena vista!!!");
	}
	public void hacerseInvisible() {
		invisible=!invisible;
	}
	public boolean estaInvisible() {
		return invisible;
	}
	
}
