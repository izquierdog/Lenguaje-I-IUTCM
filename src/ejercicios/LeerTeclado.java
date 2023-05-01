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
public class LeerTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su  nombre");
        String nombre = teclado.nextLine();
        System.out.println("Su nombre es "+nombre);
        System.out.println("su nombre contiene "+nombre.length()+" caracteres ");
    }
    
}
