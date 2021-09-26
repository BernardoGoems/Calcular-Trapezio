/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculos;

import java.util.Scanner;

public class Trapezio {

public static void main(String Args[ ]) {

    float altura, baseMaior, baseMenor, mE, area;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Informe a altura do trapézio: ");
    altura = input.nextFloat();
    
    System.out.println("Informe a base maior do trapézio: ");
    baseMaior = input.nextFloat();
    
    System.out.println("Informe a base menor do trapézio: ");
    baseMenor = input.nextFloat();
    
    area = ((baseMaior+baseMenor)* altura)/2;
    
    mE = (baseMaior-baseMenor)/2;
    
    System.out.println("A area é: " + area);
    
    System.out.println("A mediana de Euler é: " + mE);
   }
}
