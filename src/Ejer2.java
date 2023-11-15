import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ejer2{
	public static void main (String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de los arreglos: "));
		
		int [] arreglo1 = new int[num];
		int [] arreglo2 = new int [num];
		int [] arregloResultante = new int [num];

		JOptionPane.showMessageDialog(null, "Ingrese los elementos del primer arreglo");
		for(int i = 0; i <num; i++) {
			arreglo1[i] = Integer.parseInt(JOptionPane.showInputDialog("elemento "+ (i + 1)));
		}
		JOptionPane.showMessageDialog(null, "Ingrese los elementos del segundo arreglo");
		for(int i = 0; i <num; i++) {
			arreglo2[i] = Integer.parseInt(JOptionPane.showInputDialog("elemento "+ (i + 1)));
			arregloResultante[i] = arreglo1[i] + arreglo2[i];
		}
		String arregloInfo = "Contenido de los arreglos:\n" +
		        "Arreglo 1: " + java.util.Arrays.toString(arreglo1) + "\n" +
		        "Arreglo 2: " + java.util.Arrays.toString(arreglo2) + "\n" +
		        "Arreglo Resultante: " + java.util.Arrays.toString(arregloResultante);

		JOptionPane.showMessageDialog(null, arregloInfo);
	
	
	} 
}


