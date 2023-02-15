package codigodeotros.ejercicio4;
//Se importa la clase scanner
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		//Agregue el System.in del scanner
		Scanner s = new Scanner(System.in);
		//Elimine el otro scanner
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		//Cambie el nombre de las variables para que se entiendan mejor 
		String jugador1 = s.nextLine();
		//Cambie el string 1 por el 2 del jugador
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		String jugador2 = s.nextLine();
		//Use equals para comparar el valor del objeto y no lareferencia
		if (jugador1.equals(jugador2)) {
			System.out.println("Empate");
		} else {
			int ganador = 2;
			switch (jugador1) {
			//Agregue los break a los case
			//En comparaciones if utilice la funcion equals, ademas de cerrar correctamenete 
			//los parentesis
			case "piedra":
				if (jugador2.equals("tijeras")) {
					ganador = 1;
				}
				break;
			case "papel":
				if (jugador2.equals("piedra")) {
					ganador = 1;
				}
				break;
			case "tijeras":
				if (jugador2.equals("papel")) {
					ganador = 1;
				}
				break;
			default:
			}
			
			System.out.println("Gana el jugador " + ganador);
		}
		s.close();//Cerre el scanner
	}
}
