import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            // Crear objeto
        Calefactor c1 = new Calefactor("Kendal","mk1",(byte)1,2023,false);
            // Encenderlo
        c1.enciende();
            // Cambiar la potencia a medio y desplegar potencia
        c1.setPotencia((byte)2);
        System.out.println("Potencia de c1: "+c1.getPotencia());

            // Cambiar la potencia a alto y desplegar potencia
        c1.setPotencia((byte)3);
        System.out.println("Potencia de c1: "+c1.getPotencia());

            // Generar un 2do objeto con datos distintos a c1
        Calefactor c2 = new Calefactor("Calentito","R1",(byte)1,2005, false);
            // Ingresar una potencia fuera del rango: bajo, medio, alto (1, 2, 3)
        c2.setPotencia((byte)4);

            // Verificar que los dos calefactores creados no son iguales
        System.out.println("Objetos iguales: "+c1.equals(c2));

            // Crear 3er objeto con los datos de c2
        Calefactor c3 = new Calefactor("Calentito","R1",(byte)1,2005, false);
            // Verificar si c3 y c2 son iguales
        if(c3.equals(c2)){
            System.out.println("c2 y c3 son iguales");
        }else{
            System.out.println("c2 y c3 no son iguales");
        }

            // Mostrar los datos de los tres calefactores
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

    }
}