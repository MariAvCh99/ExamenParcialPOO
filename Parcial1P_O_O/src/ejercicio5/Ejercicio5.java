package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		String palabra;
		char [] polindromo;
		int izq, der;
		System.out.println("Ingrese la palabra");
		palabra =s.nextLine();
		palabra =palabra.toLowerCase();
		polindromo = palabra.toCharArray();
		izq= 0;
		der= polindromo.length-1;
		
		while(izq < der) {
			if(polindromo[izq]== polindromo[der]) {
				der--;
				izq++;
				
			}else {
				System.out.println("No es polindromo");
				break;
			}
		}
		
		if(izq== der) {
			System.out.println("Es polindromo");
		}

	}

}
