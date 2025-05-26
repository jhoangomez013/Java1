package EjerciciosClase6;

import java.util.Scanner;

public class EjerciciosParaEntrega2 {
    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
    }

    public static void Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número para determinar si es positivo, negativo o cero");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número ingresado es: Positivo");
        } else if (numero < 0) {
            System.out.println("El número ingresado es: Negativo");
        } else {
            System.out.println("El número ingresado es: Cero");
        }
        sc.close();
    }

    public static void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número 1");
        int numero1 = sc.nextInt();

        sc = new Scanner(System.in);
        System.out.println("Introduzca número 2");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que el número " + numero2);
        } else if (numero1 == numero2) {
            System.out.println("Los números ingresados son iguales");
        } else {
            System.out.println("El número " + numero2 + " es mayor que el número " + numero1);
        }
        sc.close();
    }

    public static void Ejercicio3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un año para determinar si es biciesto");
        int anio = sc.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año ingresado es biciesto");
        } else {
            System.out.println("El año ingresado NO es biciesto");
        }
        sc.close();
    }

    public static void Ejercicio4() {
        int resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número 1");
        int numero1 = sc.nextInt();

        System.out.println("Introduzca número 2");
        int numero2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca operador +,-,*,/");
        String operador = sc.nextLine();

        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println("El Resultado de la suma es: " + resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("El Resultado de la resta es: " + resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("El Resultado de la multiplicación es: " + resultado);
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("El Resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            default:
                System.out.println("La operación no existe");
        }
        sc.close();
    }

}




