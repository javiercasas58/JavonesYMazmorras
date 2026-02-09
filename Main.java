package javanesYmazmoras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int opcion=0;
		String nombre="";
		int nivel=0;
		int puntosVida=0;
		boolean protegido=false;
		System.out.println("¿Que personaje quieres crear?");
		System.out.println("(1)Ladron\n(2)Mago\n(3)Guerrero");
		opcion=scan.nextInt();
		scan.nextLine();
		switch (opcion) {
			case(1):{
			boolean invisible=false;
			System.out.println("Dime su nombre");
			nombre=scan.nextLine();
			System.out.println("Dime su nivel");	
			nivel=scan.nextInt();
			System.out.println("Dime sus puntosVida");	
			puntosVida=scan.nextInt();
			scan.nextLine();
			System.out.println("Dime si esta protegido,true o false");
			protegido=scan.nextBoolean();
			System.out.println("Dime si esta invisible, true o false");
			invisible=scan.nextBoolean();
			Ladron a=new Ladron(nombre,nivel,puntosVida,protegido,invisible);
			 a.robar();
             a.hacerseInvisible();
             a.robar();
             System.out.println("¿Quieres añadir equipamiento al ladrón? (true/false)");
             boolean quiere = scan.nextBoolean();
             scan.nextLine();

             if (quiere) {
                 System.out.println("Nombre del equipamiento:");
                 String nomEq = scan.nextLine();

                 System.out.println("Tipo del equipamiento:");
                 String tipoEq = scan.nextLine();

                 Equipamiento e = new Equipamiento(nomEq, tipoEq);
                 a.agregarEquipamiento(e);

                 System.out.println("Inventario del ladrón:");
                 a.getInventario().mostrarInventario();
             }
			break;
			}
			case(2):{
			int manaInicial=0;
			System.out.println("Dime su nombre");
			nombre=scan.nextLine();
			System.out.println("Dime su nivel");	
			nivel=scan.nextInt();
			System.out.println("Dime sus puntosVida");	
			puntosVida=scan.nextInt();
			scan.nextLine();
			System.out.println("Dime si esta protegido,true o false");
			protegido=scan.nextBoolean();
			System.out.println("Dime su mana inicial");
			manaInicial=scan.nextInt();
			Mago b=new Mago(nombre,nivel,puntosVida,protegido,manaInicial);
			b.lanzarHechizo(50);
            b.recargarMana(30);
            System.out.println("¿Quieres añadir equipamiento al mago? (true/false)");
            boolean quiere = scan.nextBoolean();
            scan.nextLine();

            if (quiere) {
                System.out.println("Nombre del equipamiento:");
                String nomEq = scan.nextLine();

                System.out.println("Tipo del equipamiento:");
                String tipoEq = scan.nextLine();

                Equipamiento e = new Equipamiento(nomEq, tipoEq);
                b.agregarEquipamiento(e);

                System.out.println("Inventario del mago:");
                b.getInventario().mostrarInventario();
            }
			break;
			}
			case(3):{
				System.out.println("Dime su nombre");
				nombre=scan.nextLine();
				System.out.println("Dime su nivel");	
				nivel=scan.nextInt();
				System.out.println("Dime sus puntosVida");	
				puntosVida=scan.nextInt();
				scan.nextLine();
				System.out.println("Dime si esta protegido,true o false");
				protegido=scan.nextBoolean();
				Personaje companeroProtegido = null;
				Guerrero c=new Guerrero(nombre,nivel,puntosVida,protegido,companeroProtegido);	
				System.out.println("Ahora mismo protege a: " + c.estaProtegiendo());
				System.out.println("¿Quieres añadir equipamiento al guerrero? (true/false)");
				boolean quiere = scan.nextBoolean();
				scan.nextLine();

				if (quiere) {
				    System.out.println("Nombre del equipamiento:");
				    String nomEq = scan.nextLine();

				    System.out.println("Tipo del equipamiento:");
				    String tipoEq = scan.nextLine();

				    Equipamiento e = new Equipamiento(nomEq, tipoEq);
				    c.agregarEquipamiento(e);

				    System.out.println("Inventario del guerrero:");
				    c.getInventario().mostrarInventario();
				}
				break;
			}
			default:{
				System.out.println("opcion incorrecta");
				break;
			}
		}
		

	}

}
