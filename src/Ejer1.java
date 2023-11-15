import javax.swing.JOptionPane;

public class Ejer1 {
	public static void main (String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas a registrar: "));
		
		int totalPersonas = 0;
		int mayoresEdad= 0;
		int menoresEdad= 0;
		
		
		for( int i = 0; i< n;i++) {
			JOptionPane.showMessageDialog(null, "Persona" + (i+1));
			
			String nombre= JOptionPane.showInputDialog("Nombre: ");
			String documento= JOptionPane.showInputDialog("Documento: ");
			String profesion= JOptionPane.showInputDialog("Profesion: ");
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
			
			
			if(edad >= 18) {
				mayoresEdad++;
			}else {
				menoresEdad++;
			}
			totalPersonas++;
		}
		
		String infoMessage = "Informacion : \n"+
				"Total personas registradas: "+ totalPersonas + "\n"+
				"Cantidad de personas mayores edad: " + mayoresEdad + "\n"+ 
				"Cantidad de personas menores de edad: " + menoresEdad;
		
		JOptionPane.showMessageDialog(null, infoMessage);
		
    }
}
