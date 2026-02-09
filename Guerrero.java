package javanesYmazmoras;

public class Guerrero extends Personaje {

    private Personaje companeroProtegido;
    
    public Guerrero(String nombre, int nivel, int puntosVida, boolean protegido, Personaje companeroProtegido) {
    	super(nombre,nivel,puntosVida,protegido);
    	this.companeroProtegido=companeroProtegido;
    }

    public void proteger(Personaje companero) {
        if (this.companeroProtegido != null) {
            this.companeroProtegido.setProtegido(false);
        }

        this.companeroProtegido = companero;
        companero.setProtegido(true);
    }


    public void dejarDeProteger() {
        if (companeroProtegido != null) {
            companeroProtegido.setProtegido(false);
        }
        companeroProtegido = null;
    }

    public Personaje estaProtegiendo() {
        return companeroProtegido;
    }
}