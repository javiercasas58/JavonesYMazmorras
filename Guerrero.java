public class Guerrero extends Personaje {

    private Personaje compañeroProtegido;

    public void proteger(Personaje compañero) {
        this.compañeroProtegido = compañero;
    }

    public void dejarDeProteger() {
        this.compañeroProtegido = null;
    }

    public Personaje estaProtegiendo() {
        return compañeroProtegido;
    }
}
