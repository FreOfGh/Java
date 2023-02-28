/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;
import java.util.Scanner;
public class Ejercicio_2 {
    public double x,y,suma ;
     public void sumatoria(double entrada_usuario_x,double entrada_usuario_y){
        
        suma = suma +  entrada_usuario_x;
        x = entrada_usuario_x + Math.pow(entrada_usuario_y,2);
        suma = suma + entrada_usuario_x/entrada_usuario_y;
        System.out.println("La suma es " + suma);
     }
    public  static void main(String[] args) {  
        double entrada_x,entrada_y;
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Ingrese el valor de x ");
        entrada_x = entrada.nextDouble();
        System.out.println("Ingrese el valor de y ");
        entrada_y = entrada.nextDouble();
        Ejercicio_2 suma_2 = new Ejercicio_2();
        suma_2.sumatoria(entrada_x,entrada_y); 
    }
    
}
