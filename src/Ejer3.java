
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class Ejer3 {
    public static void main(String[] args) {
        Map<String, Double> descuentos = new HashMap<>();

        int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados:"));

        
        Map<Integer, Double> tablaDescuentos = new HashMap<>();
        tablaDescuentos.put(1, 0.02);
        tablaDescuentos.put(2, 0.02);
        tablaDescuentos.put(3, 0.4);
        tablaDescuentos.put(4, 0.4);
        tablaDescuentos.put(5, 0.8);
        tablaDescuentos.put(6, 0.10);
       

        String descuentosInfo = "Descuentos realizados:\n";

        for (int i = 0; i < numEmpleados; i++) {
            String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i + 1) + ":");
            int estratoSocial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato social del empleado " + nombreEmpleado + ":"));

            if (tablaDescuentos.containsKey(estratoSocial)) {
                double descuento = tablaDescuentos.get(estratoSocial);
                descuentos.put(nombreEmpleado, descuento);
                descuentosInfo += nombreEmpleado + ": " + descuento + "\n";
            } else {
                JOptionPane.showMessageDialog(null, "Estrato social no válido. Ingrese un valor del 1 al 6.");
                i--;  
            }
        }
        JOptionPane.showMessageDialog(null, descuentosInfo);
    }
}
