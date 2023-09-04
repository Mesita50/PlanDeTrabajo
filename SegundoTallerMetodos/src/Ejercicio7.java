import java.util.HashMap;
import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hello", "hola");
        diccionario.put("apple", "manzana");
        diccionario.put("car", "coche");
        
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra en ingl�s: ").toLowerCase();
        
        if (diccionario.containsKey(palabra)) {
            String traduccion = diccionario.get(palabra);
            JOptionPane.showMessageDialog(null, "Traducci�n al espa�ol: " + traduccion);
        } else {
            JOptionPane.showMessageDialog(null, "La palabra no est� en el diccionario.");
        }
    }
}