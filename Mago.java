public class Mago extends Personaje {

    private int mana;

    public Mago(int manaInicial) {
        this.mana = manaInicial;
    }

    public void lanzarHechizo(int costeMana) {
        if (mana >= costeMana) {
            mana -= costeMana;
            System.out.println("El hechizo se ha lanzado correctamente.");
        } else {
            System.out.println("No hay maná suficiente para lanzar el hechizo.");
        }
    }

    public void recargarMana(int cantidad) {
        mana += cantidad;
        System.out.println("Maná recargado. Maná actual: " + mana);
    }

    public int getMana() {
        return mana;
    }
}
