import java.util.ArrayList;

public class Ejercicio5 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.add(20);
        lista.add(25);
        
        int maximo = encontrarValorMaximo(lista);
        System.out.println("Valor máximo en la lista: " + maximo);
    }
    
    public static int encontrarValorMaximo(ArrayList<Integer> lista) {
        int max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        return max;
    }
}