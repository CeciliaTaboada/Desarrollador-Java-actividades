package claseunoactividades;

import java.util.Scanner;

/* Dado el siguiente texto, vamos a atacar el siguiente problema: “determinar si una
persona pertenece al segmento de ingresos altos”. 

“Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
todas y todos los convivientes:
● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
(3,5 canastas básicas para un hogar tipo 2 según el INDEC).
● Tener 3 o más vehículos con una antigüedad menor a 5 años.
● Tener 3 o más inmuebles.
● Poseer una embarcación, una aeronave de lujo o ser titular de activos
societarios que demuestren capacidad económica plena.” */


public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner ing = new Scanner(System.in);
		System.out.println("Indique sus ingresos mensuales: ");
		int ingresos = ing.nextInt();
		Scanner auto = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de vehiculos que posee: ");
		int vehiculo = auto.nextInt();
		Scanner ant = new Scanner(System.in);
		System.out.println("Si posee vehiculo ingrese su antiguedad: ");
		int antiguedad = ant.nextInt();
		
		Scanner lux = new Scanner(System.in);
		System.out.println("Posee una embarcación, una aeronave o es titular de activos societarios?: indique S/N");
		String luxury = lux.nextLine();
		
		/*********************************************/
		if ( (ingresos >= 489083) || ( vehiculo>0 && antiguedad < 5) || (luxury == "S" || luxury == "s") ) {
		System.out.println("Pertenece al segmento de ingresos altos");
		} else {
		System.out.println("No pertenece al segmento de ingresos altos");
		}

	}

}
