
public class Ejercicio4 {

	public static void main(String[] args) {
		int[] arreglo = {5, 10, 15, 20, 25};
        int maximo = encontrarValorMaximo(arreglo);
        System.out.println("Valor máximo en el arreglo: " + maximo);
    }
    
    public static int encontrarValorMaximo(int[] arreglo) {
        int max = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }
        return max;
    }
}