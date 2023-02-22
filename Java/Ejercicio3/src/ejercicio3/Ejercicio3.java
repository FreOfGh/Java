/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
// declaramos una clase con el nombre Ejercicio3
public class Ejercicio3 {
    // creamos los 3 atributos necesarios para la clase
    public double salario_neto;
    public double retefuente;
    public double salario_bruto;
    // creamos un constructor para signar los valores iniciales para los atributos de cada instancia.
    public Ejercicio3() {
        salario_neto= 0;
        retefuente = 0;
        salario_bruto = 0;  
    }
    // creamos un método que muestre en pantalla la respuesta
    void metodo_salario(double  horas_de_trabajo,double salario_por_hora, double retefuente_1)
    {
        salario_bruto  =horas_de_trabajo * salario_por_hora;
        retefuente = salario_bruto*(retefuente_1/100);
        salario_neto = salario_bruto-retefuente;
        System.out.println("Salario bruto : " +salario_bruto + "$ a la semana \n" + "Retefuente : " + retefuente + "$ a la semana \n" +"Salario neto : " + salario_neto + "$ a la semana");
    }
    public static void main(String[] args) {
            // llamamos al constructor ejercicio 3 y creamos una nueva instancia 
        Ejercicio3 salario_trabajador =  new Ejercicio3();
        //le asignamos los valores que van a ser mandados al método salario
        salario_trabajador.metodo_salario(48, 5000, 12.5);
    }
    
}
 