
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexi
 */
public class Actividad5 {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa primer número");
    int x = sc.nextInt();
    System.out.println("Ingresa segundo número");
    int y = sc.nextInt();
    
    System.out.println("Suma: " + (x+y) + "\n" + "Resta: " + (x-y) + "\n" + "Multiplicación: " + (x*y) + "\n" + "División: " + (x/y) + "\n" + "Módulo: " + (x%y));
       
    }
}
