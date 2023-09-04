
public class SumaDeDosArreglos {

	public static void main(String[] args) {
		int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {6, 7, 8, 9, 10};
        int[] arregloSuma = sumarArreglos(arreglo1, arreglo2);
        for (int i = 0; i < arregloSuma.length; i++) {
            System.out.println(arregloSuma[i]);
        }
    }

    public static int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] arregloSuma = new int[arreglo1.length];
        for (int i = 0; i < arreglo1.length; i++) {
            arregloSuma[i] = arreglo1[i] + arreglo2[i];
        }
        return arregloSuma;
    }
}