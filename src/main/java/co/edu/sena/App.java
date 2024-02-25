package co.edu.sena;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        //entradas
        System.out.println( "1. Calcular el area de un triángulo" );
        System.out.println( "Ingrese la base del triángulo: " );

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();

        System.out.println("Ingrese la altura del triángulo: ");
        double height = src.nextDouble();

        //proceso
        double result = (base * height)/ 2;

        //salida
        System.out.println("El área del triángulo es: " + result);    
    }    
}
class Sumnumbers
{
    public static void main( String[] args )
    {
        //entradas
        System.out.println( "2. Ingresar 2 numeros y sumarlos" );
        System.out.println( "Ingrese el primer número: ");

        Scanner src = new Scanner(System.in);
        double number1 = src.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double number2 = src.nextDouble();

        //proceso
        double sum = number1 + number2;

        //salida
        System.out.println("La suma es: " + sum);
    }
}
class NumberSquared
{
    public static void main( String[] args)
    {
        //entradas
        System.out.println("3. Ingresar un número y visualizar el número al cuadrado");
        System.out.println("Ingrese un número: " );

        Scanner src = new Scanner(System.in);
        double number = src.nextDouble();

        //proceso
        double squared = number * number;

        //salida
        System.out.println("El número al cuadrado es: " + squared);
    }
}
class EuroDollar
{
    public static void main( String[] args)
    {
        //entradas
        System.out.println("4. Escribir un algoritmo que convierta de euros a dólares");
        System.out.println("Ingrese la cantidad en Euros para convertir a dólar: ");

        Scanner src = new Scanner(System.in);
        double euro = src.nextDouble();

        //proceso
        double dollar = euro * 1.08;

        //salida 
        System.out.println("Sus euros equivalen a " + dollar +" dólares");
    }
}







