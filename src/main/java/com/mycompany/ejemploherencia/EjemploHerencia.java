/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploherencia;
import java.util.Scanner;
/**
 *
 * @author labctr
 */
public class EjemploHerencia {
    public static void main(String[] args){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el valor del radio");
        double radio;
        radio=leer.nextDouble();
        //Crear un objeto de la clase circulo
        Circulo circulo1=new Circulo(radio);
        
        //imprimir el valor del area
        System.out.println("El area del circulo es: " + circulo1.CalcularArea());
        
        
 //triangulo 
        System.out.println("Ingrese el valor de la base: ");
        double base;
        base=leer.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        double altura;
        altura=leer.nextDouble();
        
        //Crear un objeto de clase triangulo
        Triangulo triangulo1=new Triangulo(base, altura);
        
        //imprimir el valor del area
        System.out.println("El area del triangulo es: " + triangulo1.CalcularArea());
//rectangulo
         System.out.println("Ingrese el valor de la base: ");
        base=leer.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
     
        altura=leer.nextDouble();
        //Crear un objeto de clase rectangulo
        Rectangulo rectangulo1=new Rectangulo (base, altura);
        
        //imprimir el valor del area
        System.out.println("El area del rectangulo es: " + rectangulo1.CalcularArea());
        
        
    }

}
