import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main (String arg[]) {
		int numero =0,suma=0, cant=0;
		cant= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces que deseaa realizar el proceso"));
		
		for (int i = 1; i <= cant; i++) {
			
			do {
				numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero natural "));
				if (numero<0) {
					JOptionPane.showMessageDialog(null, "No puede ser un numero negativo" , "WARNING" , JOptionPane.WARNING_MESSAGE);
				}
			} while (numero<0);
			
			suma=numero*(numero+1)/2;
			 JOptionPane.showMessageDialog(null, "el total del proceso es de "+suma);
		}
		
		
		
		
	}

}
