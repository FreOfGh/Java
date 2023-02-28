/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {
    // creamos los 3 atributos necesarios para la clase
    public double salario_hora;
    public double retefuente;
    public double horas_trabajadas;
    // creamos un constructor para signar los valores iniciales para los atributos de cada instancia.
    public Ejercicio3() {
        //Ceamos una nueva instancia para el método Scanner
        Scanner entrada_del_usuario = new Scanner(System.in);
        System.out.println("Ingrese el salario por hora");
        salario_hora = entrada_del_usuario.nextDouble() ;
        System.out.println("Ingrese el porcentaje de retención en la fuente");
        retefuente = entrada_del_usuario.nextDouble() ;
        System.out.println("Ingrese el numero de horas trabajadas");
        horas_trabajadas = entrada_del_usuario.nextDouble() ; 
    }
    // funcion saladio
    void metodo_salario()
    {
        System.out.println("Salario bruto : " + (horas_trabajadas*salario_hora) + "$ a la semana \n" + "Retefuente : " + (horas_trabajadas*salario_hora)*(retefuente*1/100) + "$ a la semana \n" +"Salario neto : " +  ((horas_trabajadas*salario_hora)-(horas_trabajadas*salario_hora)*(retefuente*1/100))+ "$ a la semana");
    }
    public static void main(String[] args) {
        
        // llamamos al constructor ejercicio 3 y creamos una nueva instancia 
        Ejercicio3 salario_trabajador =  new Ejercicio3();
        //le asignamos los valores que van a ser mandados al método salario
        
        salario_trabajador.metodo_salario();
    }
    
}
 