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
    }
    
}
