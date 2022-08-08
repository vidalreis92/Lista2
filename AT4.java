/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2;

import java.util.Scanner;

/**
 *
 * @author Vidal Reis
 */
public class AT4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a, b, c;
       
        System.out.println("Insira o primeiro valor");
        a = sc.nextInt();
        
        System.out.println("Insira o segundo valor");
        b = sc.nextInt();
        
        if (a == b) {
            c = (a + b);
            System.out.println("A soma dos dois valores é: " + c);
        } else {
            c = (a * b);
            System.out.println("A multiplicação entre os dois é: " + c);
        }
    }
}
