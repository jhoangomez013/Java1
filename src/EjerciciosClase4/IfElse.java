package EjerciciosClase4;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdusca su edad");

        int edad = sc.nextInt();
        System.out.println("Tiene Permiso del padre");
        boolean tienePermisoDelPadre = sc.nextBoolean();


        if (edad >= 18 && tienePermisoDelPadre) {
            System.out.println("Puede salir en la noche");
        }else{
            System.out.println("No Puede salir en la noche");
        }
        sc.close();
    }
}