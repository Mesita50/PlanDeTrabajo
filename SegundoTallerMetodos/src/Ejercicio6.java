
public class Ejercicio6 {

	public static void main(String[] args) {
		int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {4, 5, 6};
        
        int[] resultado = sumarArreglos(arreglo1, arreglo2);
        
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] resultado = new int[arreglo1.length];
        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }
        return resultado;
    }
}