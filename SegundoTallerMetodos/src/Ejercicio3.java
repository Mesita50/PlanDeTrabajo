import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numeroAleatorio = generarNumeroAleatorio();
        System.out.println("Número aleatorio: " + numeroAleatorio);
    }
    
    public static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}