package EjerciciosClase6;

public class Ciclos {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        int contador =0;

        while(contador <=5 ){
            System.out.println(contador);
            contador++;// ====== contador = contador +1
        }
        contador =0;

        System.out.println("-----------------------");

        do{
            System.out.println(contador);
            contador++;// ====== contador = contador +1
        }while (contador<=5);
        System.out.println("-----------------------");


        for(int i =0;i<5;i++){
            System.out.println(i);
        }
        System.out.println(" ------------- ARREGLOS FOR----------");
        int[] numeros = {1,3,4,7,1};
        numeros[2]=10;
        for(int i =0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        System.out.println("-----------ForEach------------");

        for(int num:numeros){
            System.out.println(num);
        }
        System.out.println("-----------ForEach------------");
        for(int i =0; i<numeros.length;i++){
            numeros[i]=0;
        }
        for(int num:numeros){
            System.out.println(num);
        }

        System.out.println("-----------recorrer con while------------");

        int[] estudiantes = {1,2,3,4,5};
        contador =0;
        while(contador<estudiantes.length){
            System.out.println(estudiantes[contador]);
            contador++;
        }
        System.out.println("-----------recorrer con stream------------");
        //  Arrays.stream(estudiantes).forEach(System.out::println);

    }
}
