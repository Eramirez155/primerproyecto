import java.util.Scanner;
public class Ejercicio8 {
/*Calcular la cantidad de minutos que hay existen en una cantidad de segundos ingresada
por el usuario.
*/
	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		int variable;
		
		System.out.print("ingrese los segundos: ");
		variable = valor.nextInt();
		
		
		double minutos =  (double) variable / 60; 
		
		System.out.println("Hay "+ String.format("%.2f", minutos) + " minutos en " + variable + " segundos");
      
		valor.close();
	}

}
