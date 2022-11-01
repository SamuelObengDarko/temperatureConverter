/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scannerkeyboard;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class samTemperature {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println();
        
        
        String name;
       /*input name*/ 
        System.out.println("Enter your name: ");
        name= input.next();
        /* input temperature in degree celsius*/
        System.out.println( "Enter your temperature in Celsius: ");
        Double C = sc.nextDouble();
        
        /* convert degree celsius to degree Fahrenheit*/
        Double F= C * (9f/5) + 32;
        /* print output*/
        System.out.println("Hello," + " " + name + " " + " your temperature" + " " + C + " degree celsius is equal to " + F + " degree Fahrenheit." );
                
    }
    
}
