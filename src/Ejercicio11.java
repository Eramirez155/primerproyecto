
import java.util.Scanner;

public class Ejercicio11 {
     /*Dado 3 numeros naturales que representan los lados de un triángulo, se pide determinar
      si el triángulo es Isosceles, Escaleno o Equilatero.
	*/
	
	
	public static void main(String[] args) {
		
		int lado1;
		int lado2;
		int lado3;
		
		Scanner lectura = new Scanner(System.in);
		System.out.println("Ingrese los valores de los lado del triangulo: ");
		
		
		lado1 = lectura.nextInt();
		lado2 = lectura.nextInt();
		lado3 = lectura.nextInt();

		if (lado1 == lado2 && lado1 == lado3 ) {
		System.out.println("El triangulo es equilatero");
		
		}	else if ((lado1 != lado2 && lado1 != lado3) || (lado2 != lado3 && lado2 != lado1) )      {
			System.out.println("El triangulo es Escaleno");	
		}else {
		System.out.println("El triangulo es Isosceles");
		}
	}

}
