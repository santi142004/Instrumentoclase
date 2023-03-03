import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	public static void main (String arg[]) {
	//	1. Dado un número ingresado por un usuario, deberá imprimir su tabla hasta el 10 (0.5) este proceso lo deberá
	//	realizar las veces que el usuario decida (0.5), valide que no ingrese números negativos (0.5) 
	//  para esto debe usar ciclos anidados.
		
		int numero =0, cant,resultado=0;
		cant= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces que desea realizar el proceso"));
		String msj = "";
		for (int i = 1; i <= cant; i++) {
			
			do {
				numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
				if (numero<0) {
					JOptionPane.showMessageDialog(null, "No puede ser un numero negativo" , "ERROR" , JOptionPane.ERROR_MESSAGE );
				}
			} while (numero<0);
		
			for (int j = 1; j <= 10; j++) {
				resultado= numero * j;
				msj += numero+ " * " +j+ " = " +resultado + "\n";
				
		}	
			JOptionPane.showMessageDialog(null, msj);
	}
	}

}
