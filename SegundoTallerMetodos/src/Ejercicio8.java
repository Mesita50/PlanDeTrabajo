import java.util.HashMap;
import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
        HashMap<String, Double> notasEstudiantes = new HashMap<>();
        
        while (true) {
            String opcionStr = JOptionPane.showInputDialog(
                "1. Agregar estudiante y nota\n" +
                "2. Consultar nota de estudiante\n" +
                "3. Salir\n" +
                "Elija una opción:"
            );
            
            int opcion = Integer.parseInt(opcionStr);
            
            if (opcion == 1) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante: "));
                notasEstudiantes.put(nombre, nota);
                JOptionPane.showMessageDialog(null, "Nota registrada exitosamente.");
            } else if (opcion == 2) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                if (notasEstudiantes.containsKey(nombre)) {
                    double nota = notasEstudiantes.get(nombre);
                    JOptionPane.showMessageDialog(null, "La nota de " + nombre + " es: " + nota);
                } else {
                    JOptionPane.showMessageDialog(null, "El estudiante no está registrado.");
                }
            } else if (opcion == 3) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}