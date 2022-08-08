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
public class AT3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, delta;

        System.out.println("Insira o valor de A");
        a = sc.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
            System.exit(0);
        }

        System.out.println("Insira o valor de B");
        b = sc.nextDouble();

        System.out.println("Insira o valor de C");
        c = sc.nextDouble();

        delta = (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais");
            System.exit(0);
        }
        if (delta == 0) {
            double x3 = ((-b) / (2 * a));
            System.out.println("A equação possui apenas uma raiz real ou dois resultados iguais");
            System.out.println("Sendo ela: " + x3);
            System.exit(0);
        }
        if (delta > 0) {
            x1 = (((-b) + (Math.sqrt(delta))) / (2 * a));
            x2 = (((-b) - (Math.sqrt(delta))) / (2 * a));
            System.out.println("A equação possui duas raízes reais");
            System.out.println("O Delta é: " + delta);
            System.out.println("A Solução é: {" + x1 + "," + x2 + "}");
        }
    }
}
