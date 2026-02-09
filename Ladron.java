package javanesYmazmoras;

public class Ladron extends Personaje {
	boolean invisible=false;
	
	public Ladron(String nombre, int nivel, int puntosVida, boolean protegido, boolean invisible) {
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
