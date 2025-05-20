package Clase6;

import java.util.ArrayList;
import java.util.List;

public class EstructurasDeDatos {
    public static void main(String[] args) {

        // Nombre de estructuras basicas.
        // Arreglos,listas doblemente enlazadas, map, listas , colas,  tuplas, pilas, , grafos, arboles.

        // ARREGLOS
        //  finitos. NO ES DINAMICA.
        // CONDICION 1- YO DEBO DEFINIR EL TAMAÑO
        // CONDICION 2- DEBO DEFINIR EL TIPO DE DATO

        int[] miAreglo= new int[4];
        System.out.println(miAreglo[0]);
        System.out.println(miAreglo[1]);
        System.out.println(miAreglo[2]);
        System.out.println(miAreglo[3]);
        System.out.println("---------------------");
        miAreglo[0]=10;
        miAreglo[1]=1;
        miAreglo[2]=10;
        miAreglo[3]=11;
        System.out.println(miAreglo[0]);
        System.out.println(miAreglo[1]);
        System.out.println(miAreglo[2]);
        System.out.println(miAreglo[3]);
        System.out.println("---------------------");

        //LISTAS
        //ESTRUCTURAS DINAMICAS mas pesadas

        List<String> estudiantes= new ArrayList<String>();

        estudiantes.add("Mauricio");
        estudiantes.add("Carlos");
        estudiantes.add("Andres");
        System.out.println("---------------------");
        System.out.println(estudiantes.size());
        estudiantes.remove("Carlos");
        System.out.println(estudiantes.size());


    }

}
