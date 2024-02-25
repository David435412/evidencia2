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
class Squared
{
    public static void main( String[] args)
    {
        //entradas
        System.out.println("5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del area y del perimetro");
        System.out.println("Ingrese el lado del cuadrado: ");

        Scanner src = new Scanner(System.in);
        double side = src.nextDouble();

        //proceso
        double area = side * side;
        double perimeter = side * 4;

        //salida 
        System.out.println("El área del cuadrado es " + area + " y el perimetro es " + perimeter);
    }
}
class Cylinder
{
    public static void main( String[] args)
    {
        //entradas
        System.out.println("6. Escribir un algoritmo que determine el area y el volumen de un cilindro");
        System.out.println("Ingrese el radio de la base del cilindro: ");

        Scanner src = new Scanner(System.in);
        double radius = src.nextDouble();

        System.out.println("Ingrese la altura del cilindro: ");
        double height = src.nextDouble();       

        //proceso
        double PI = 3.1416;
        double basearea = PI * radius * radius ;
        double lateralarea = 2 * PI * radius * height;
        double totalarea = basearea + lateralarea;
        double volume = basearea * height;

        //salida 
        System.out.println("El área del cilindro es " + totalarea + " y el volumen es " + volume);
    }
}






