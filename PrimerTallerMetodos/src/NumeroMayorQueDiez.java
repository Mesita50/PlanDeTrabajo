
public class NumeroMayorQueDiez {

	public static void main(String[] args) {
		imprimirNumeroMayorQueDiez(5);
    }

    public static void imprimirNumeroMayorQueDiez(int numero) {
        if (numero >= 10) {
            System.out.println("El número mayor que 10 es: " + numero);
        }else {
        	System.out.println("No es mayor que 10");
        }
    }
}