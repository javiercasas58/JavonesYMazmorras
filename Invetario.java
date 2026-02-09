package javanesYmazmoras;

import java.util.ArrayList;

public class Inventario {
	ArrayList<Equipamiento> equipamiento= new ArrayList<>();
	public void agregarEquipamiento(Equipamiento equipamiento) {
		this.equipamiento.add(equipamiento);
	}
	public void mostrarInventario() {
		for(int i=0;i<equipamiento.size();i++) {
			System.out.println(equipamiento.get(i));
		}
	}
}
