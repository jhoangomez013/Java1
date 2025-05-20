package Clase6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Introdusca el numero de la semana");


        int diaDeLaSemana= sc.nextInt();

        switch (diaDeLaSemana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("El numero de la semana no existe");

        }

        String respuesta = switch (diaDeLaSemana){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6,7 -> "Fin de semana";
            default -> "El numero de la semana no existe";
        };
        System.out.println(respuesta);
    }
}