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
public class AT15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angulos = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Escreva o " + (i + 1) + "º angulo do seu triangulo:");
            angulos[i] = sc.nextInt();
        }
        if ((angulos[0] + angulos[1] + angulos[2]) == 180) {
            if (angulos[0] > 90 || angulos[1] > 90 || angulos[2] > 90) {
                System.out.println("O seu triangulo é um Obtusângulo");
            } else {
                if (angulos[0] == 90 || angulos[1] == 90 || angulos[2] == 90) {
                    System.out.println("O seu triângulo é um Obtusângulo");
                } else {
                    System.out.println("O seu triângulo é um Acutângulo");
                }
            }
        } else {
            System.out.println("A soma dos 3 angulos não resulta em 180 graus, logo, não é um triangulo.");
        }
    }
}
