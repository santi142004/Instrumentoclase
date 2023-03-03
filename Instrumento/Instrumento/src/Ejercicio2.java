import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main (String arg[]) {
		String nombre =""; 
		int edad=0, cant=0;
		double peso =0, talla=0, imc=0;
		
		
		cant= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas a realizar el proceso"));
		for (int i = 1; i <= cant; i++) {
			nombre =JOptionPane.showInputDialog("Ingresa tu nombre");
			do {
				edad= Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
				if (edad<0) {
					JOptionPane.showMessageDialog(null, "No puede ser un numero negativo" , "ERROR" , JOptionPane.ERROR_MESSAGE );
				}
			} while (edad<0);
			
			do {
				peso =Double.parseDouble( JOptionPane.showInputDialog("Ingresa tu peso"));
				if (peso<0) {
					JOptionPane.showMessageDialog(null, "No puede ser un numero negativo" , "ERROR" , JOptionPane.ERROR_MESSAGE );
				}
			} while (peso<0);
			
			do {
				talla =Double.parseDouble( JOptionPane.showInputDialog("Ingresa tu talla"));
				if (talla<0) {
					JOptionPane.showMessageDialog(null, "No puede ser un numero negativo" , "ERROR" , JOptionPane.ERROR_MESSAGE );
				}
			} while (talla<0);
			
			imc= peso /(talla*talla);
			
			if (imc<18) {
				JOptionPane.showMessageDialog(null, "Señor " +nombre+ " de " +edad+ " años, su peso es de " +peso+ " y su talla es de " +talla+ " por"
						+ " lo tanto su IMC es de " +imc+ " y tienes anorexia, debes preocuparte mucho mas por comer" );
			} else if(imc>=18 && imc < 20) {
				JOptionPane.showMessageDialog(null,"Señor " +nombre+ " de " +edad+ " años, su peso es de " +peso+ " y su talla es de " +talla+ " por"
						+ " lo tanto su IMC es de " +imc+ " y tienes delgadez, debes preocuparte un poco mas por comer" );
			}else if(imc >=20 && imc< 27) {
				JOptionPane.showMessageDialog(null,"Señor " +nombre+ " de " +edad+ " años, su peso es de " +peso+ " y su talla es de " +talla+ " por"
						+ " lo tanto su IMC es de " +imc+ " y estas en normalidad, te felicito sigue asi" );
			}else if (imc >=27 && imc <30) {
				JOptionPane.showMessageDialog(null,"Señor " +nombre+ " de " +edad+ " años, su peso es de " +peso+ " y su talla es de " +talla+ " por"
						+ " lo tanto su IMC es de " +imc+ " y estas en obesidad(grado1), estas bien pero debes preocuparte por hacer ejercicio" );
			}else if (imc >= 30 && imc <35) {
				JOptionPane.showMessageDialog(null,"Señor " +nombre+ " de " +edad+ " años, su peso es de " +peso+ " y su talla es de " +talla+ " por"
						+ " lo tanto su IMC es de " +imc+ " y estas en obesidad(grado2), debes preocuparte por hacer ejercicio" );
			}else if (imc >= 35 && imc <40) {
				JOptionPane.showMessageDialog(null,"Señor " +nombre+ " de " +edad+ " años, su peso es de " +peso+ " y su talla es de " +talla+ " por"
						+ " lo tanto su IMC es de " +imc+ " y estas en obesidad(grado3), te recomiendo comer sano y hacer ejercicio" );
			}else if (imc >= 40) {
				JOptionPane.showMessageDialog(null,"Señor " +nombre+ " de " +edad+ " años, su peso es de " +peso+ " y su talla es de " +talla+ " por"
						+ " lo tanto su IMC es de " +imc+ " y estas en obesidad morbida, es preocupante tu caso te recomiendo ir a un medico "
								+ "" );
			}
			
			
			
		}
	}

}
