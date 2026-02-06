package javanesYmazmoras;

public class Guerrero extends Personaje {

    private Personaje companeroProtegido;
    
    public Guerrero(String nombre, int nivel, int puntosVida, boolean protegido, Personaje companeroProtegido) {
    	super(nombre,nivel,puntosVida,protegido);
    	this.companeroProtegido=companeroProtegido;
    }

    public void proteger(Personaje compañero) {
        this.companeroProtegido = compañero;
    }

    public void dejarDeProteger() {
        this.companeroProtegido = null;
    }

    public Personaje estaProtegiendo() {
        return companeroProtegido;
    }
}