/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Ingrese un valor para el numero 1");
        valor1 = t.nextInt();
        System.out.println("Ingrese un valor para el numero 2");
        valor2 = t.nextInt();
        int suma = valor1 + valor2;
        System.out.println("La suma de los números da un total de "+suma);
        double div, n1, n2;
        System.out.println("Ingrese valor para numero 1");
        n1 = t.nextDouble();
        System.out.println("Ingrese el valor para numero 2");
        n2 = t.nextDouble();
        div = n1 / n2;
        System.out.println("El resultado de la división es "+div);
    }
    
}
