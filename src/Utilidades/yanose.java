package Utilidades;

import Entidades.Fruta;
import Entidades.Lacteo;
import Entidades.Limpieza;
import Entidades.NoPerecible;
import Entidades.Producto;

public class yanose {
	
	public static void main(String[] args) {
		
		Producto cosas[] = new Producto [8];
		cosas [0] = new Fruta("pepe", 20, 20, "roja");
		cosas [1] = new Fruta("Uva", 500, 1400, "violeta");
		cosas [2] = new Limpieza("Jabon", 500, "para el cuerpo", 1500);
		cosas [3] = new Limpieza ("trapo", 0,  "para el piso", 1000);
		cosas [4] = new Lacteo ("Leche", 1000, 50, 2500);
		cosas [5] = new Lacteo ("yogurt", 800, 20, 3000);
		cosas [6] = new NoPerecible ("Fideos", 1200, 300, 2000);
		cosas [7] = new NoPerecible ("Arroz", 1000, 500, 2200);
		
		System.out.println("Cosas de producto");
		
	    for (int i = 0; i < 8; i++) {
            System.out.print(cosas[i].toString());
        }
	}
}
