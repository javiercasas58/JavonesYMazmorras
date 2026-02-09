package javanesYmazmoras;

public class Personaje {
	private String nombre = "";
	private int nivel = 0;
	private int puntosVida = 0;
	private boolean protegido = false;
	private Inventario inventario;
	
	public Personaje(String nombre, int nivel, int puntosVida, boolean protegido) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntosVida = puntosVida;
		this.protegido = protegido;
		this.inventario = new Inventario();
	}
	

	public void mostrarInfo(String nombre, int nivel, int puntosVida) {
		System.out.println("Su nombre es " + nombre + " su nivel es " + nivel + " sus puntos de vida son " + puntosVida);
	}

	public void bajarVida(int cantidad) {
		if (cantidad > 0) {
			if (this.protegido==true) {
			puntosVida = puntosVida-cantidad/2;
			}
			else puntosVida = puntosVida-cantidad;
		}
		else
			System.out.println("Cantidad incorrrecta");
	}
	public void curar(int cantidad) {
		if (cantidad > 0) puntosVida = puntosVida+cantidad;
		else System.out.println("Cantidad incorrrecta");
	}
	public Inventario getInventario() {
		return inventario;
	}
	public void agregarEquipamiento(Equipamiento equipamiento) {
		inventario.agregarEquipamiento(equipamiento);
	}
	public void setProtegido(boolean protegido) {
		if (protegido==true) this.protegido=true;
		else this.protegido=false;
	}
	public boolean estaProtegido() {
		return this.protegido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getNivel() {
		return nivel;
	}
	public  void setNivel(int nivel) {
		this.nivel=nivel;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida=puntosVida;
	}
	
}