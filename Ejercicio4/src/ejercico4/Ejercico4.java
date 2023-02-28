/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico4;
import java.util.Scanner;

public class Ejercico4 {
        public double radio;
       
        public Ejercico4 (double radio_ingresado_por_usuario)
             
        {
            radio = radio_ingresado_por_usuario;
        }        
        void area (){
            System.out.println("El area es " + Math.PI*(Math.pow(radio,2)));
        }
        void circunferencia (){
            System.out.println("La circunferencia es " + Math.PI*(2*radio));
        }
        public static void main (String[] args) {
                Scanner entrada =  new Scanner(System.in);
                System.out.println("Ingrese el radio de la circunferencia");
                Ejercico4 circulo = new Ejercico4(entrada.nextDouble());
                circulo.area();
                circulo.circunferencia();
            
            
            
    }
    
        
}
