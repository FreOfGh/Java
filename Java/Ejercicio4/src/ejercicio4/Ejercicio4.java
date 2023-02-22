/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
//importamos la clase Scanner
import java.util.Scanner;
public class Ejercicio4 {
    // creamos el atributo numero.
    public double numero;
    // creamos un constructor para signarle los valores iniciales al atributo para cada instancia
    public Ejercicio4(double numero_2)
    {
        numero= numero_2;
    }
    // creamos el metodo cuadrado para mostrar en pantalla el cuadrado del numero, utilizando el tipo void debido a que no vamos a tener ningún retorno.
    void cuadrado(double numero_usuario)
    {
        System.out.println("El cuadrado del numéro es : " + Math.pow(numero_usuario, 2) );
    }
     // creamos el metodo cubo para mostrar en pantalla el cubo del numero, utilizando el tipo void debido a que no vamos a tener ningún retorno.
    void cubo(double numero_usuario)
    {
        System.out.println("El cubo del numéro es : " + Math.pow(numero_usuario, 3) );
    }
    public static void main(String[] args) {
        //llamamos al constructor scanner y creamos un nuevo objeto
        Scanner ingreso_del_usuario = new Scanner(System.in);
        System.out.println("Ingrese el numéro : ");
        // llamamos al contructor y creamos un nuevo objeto a la  vez que le asignamos el valor inicial al atributo numero con el ingreso del usuario
        Ejercicio4 Numero_ing_usuario =  new Ejercicio4(ingreso_del_usuario.nextDouble());
        Numero_ing_usuario.cuadrado(Numero_ing_usuario.numero);
        Numero_ing_usuario.cubo(Numero_ing_usuario.numero);
        
    }
    
}
