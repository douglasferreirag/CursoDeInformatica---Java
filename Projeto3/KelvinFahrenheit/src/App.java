import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
         System.out.println();
        System.out.println();
        System.out.println();

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Digite a temperatura em graus kelvin: ");
        Scanner input = new Scanner(System.in);
        double temperaturaEmKelvin = input.nextDouble();

        double temperaturaEmFahrenheit = 1.8 * (temperaturaEmKelvin - 273.15) + 32; 

        System.out.println(temperaturaEmKelvin + " graus kelvin equivalem a " + df.format(temperaturaEmFahrenheit) + " graus fahrenheit.");

        input.close();

    }
}
