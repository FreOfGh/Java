/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;
// Importamos la clase Scanner para poder utilizarla y crear objetos
import java.util.Scanner;
/**
 *
 * @author 57302
 */
//Creamos la Clase ejercicio1
public class Ejercicio1 {
    // Dentro de la clase Ejercicio 1 creamos 4 atributos, los cuales corresponden a los elementos del ejercicio #1
    public int    edjuan;
    public int    edmama;
    public int    edalber;
    public int    edana;
    // creamos un constructor con el mismo nombre de la clase para asignar los valores iniciales al objeto donde recibiremos la edad de juan y la utilizaremos en las operaciones para encontrar las demás
    
    public  Ejercicio1  (double edad_de_juan_2)
    {
        // operamos las edades según lo indicado en el pdf
        edjuan = (int) edad_de_juan_2;
        edalber = (int) Math.floor(edad_de_juan_2*(2.0/3.0));
        edana= (int) Math.floor((edad_de_juan_2*4.0)/3.0 );
        edmama =  edjuan+edalber+edana; 
    }
    public static void main(String[] args) {
        //mostramos en pantalla el mensaje donde pedimos el ingreso de la edad de Juan
            System.out.println("Ingrese la edad de Juan");
        // Creamos el objeto juan el cual va a pertenecer al método Scanner
            Scanner juan = new Scanner(System.in); 
        // El usuario ingresa la edad de Juan y la enviamos al constructo para asignar los valores iniciales al objeto edades
            Ejercicio1 edades = new Ejercicio1(juan.nextInt());
        //mostramos en pantalla los valores deseados
            System.out.println("Edad de Juan " + edades.edjuan + " Edad de Alberto " + edades.edalber + " Edad de Ana " +edades.edana + " Edad de mamá " + edades.edmama );
            
            
        
    }
    
}
