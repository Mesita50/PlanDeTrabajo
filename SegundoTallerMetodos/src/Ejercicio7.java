import java.util.HashMap;
import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hello", "hola");
        diccionario.put("apple", "manzana");
        diccionario.put("car", "coche");
        
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra en inglés: ").toLowerCase();
        
        if (diccionario.containsKey(palabra)) {
            String traduccion = diccionario.get(palabra);
            JOptionPane.showMessageDialog(null, "Traducción al español: " + traduccion);
        } else {
            JOptionPane.showMessageDialog(null, "La palabra no está en el diccionario.");
        }
    }
}