import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Digite a temperatura em graus celsius: ");
        Scanner input = new Scanner(System.in);
        double temperaturaEmCelsius = input.nextDouble();

        double temperaturaEmKelvin = temperaturaEmCelsius + 273.15;

        System.out.println(temperaturaEmCelsius + " graus celsius equivalem a " + temperaturaEmKelvin + " graus kelvin.");

        input.close();
    }
}
