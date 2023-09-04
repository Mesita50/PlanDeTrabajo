
public class ValorMaximoDeUnArreglo {

	public static void main(String[] args) {
		int[] arreglo = {1, 5, 10, 20, 30};
        int valorMaximo = obtenerValorMaximo(arreglo);
        System.out.println(valorMaximo);
    }

    public static int obtenerValorMaximo(int[] arreglo) {
        int valorMaximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > valorMaximo) {
                valorMaximo = arreglo[i];
            }
        }
        return valorMaximo;
    }
}