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
public class AT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[5];
        int i = 0, x, aux;
        do {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numero[i] = sc.nextInt();
            for (x = 0; x < 5; x++) {
                if (numero[i] == numero[x] && i != x) {
                    System.out.println("Este número já está cadastrado");
                    i--;
                    break;
                }
            }
            i++;
        } while (i < 5);

        do {
            x = 0;
            for (i = 0; i <= 3; i++) {
                if (numero[i] > numero[i + 1]) {
                    aux = numero[i];
                    numero[i] = numero[i + 1];
                    numero[i + 1] = aux;
                    x = 1;
                }
            }
        } while (x != 0);
        System.out.println("A ordem crescente dos números é ");
        for (i = 0; i <= 3; i++) {
            System.out.print(numero[i] + ", ");
        }
        System.out.println(numero[4] + ".");
    }
}
