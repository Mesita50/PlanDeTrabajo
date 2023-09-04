
public class GenerarNumeroAleatorio {

	public static void main(String[] args) {
		int numeroAleatorio = generarNumeroAleatorio();
        System.out.println(numeroAleatorio);
    }

    public static int generarNumeroAleatorio() {
        return (int) (Math.random() * 100) + 1;
    }
}