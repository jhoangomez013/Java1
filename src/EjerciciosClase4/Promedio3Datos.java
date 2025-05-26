package EjerciciosClase4;
import java.util.Scanner;

public class Promedio3Datos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primer numero: ");
        int primerNumero = sc.nextInt();

        System.out.println("Segundo numero: ");
        int segundoNumero = sc.nextInt();

        System.out.println("Tercer numero: ");
        int tercerNumero = sc.nextInt();

        double promedio= (primerNumero + segundoNumero + tercerNumero) /3D;

        System.out.println("El resultado es: "+promedio);

        sc.close();
    }
}
