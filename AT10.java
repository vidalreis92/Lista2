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
public class AT10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l1, l2, l3;

        System.out.println("Insira as medidas do lado 1: ");
        l1 = sc.nextDouble();

        System.out.println("Insira as medidas do lado 2: ");
        l2 = sc.nextDouble();

        System.out.println("Insira as medidas do lado 3: ");
        l3 = sc.nextDouble();

        if ((l1 == l2) && (l2 == l3) && (l1 == l3)) {
            System.out.println("O Triângulo é Equilátero, todos os lados são iguais");
        }
        if (((l1 == l2) || (l1 == l3) || (l2 == l3)) && ((l1 != l2) || (l1 != l3) || (l2 != l3))) {
            System.out.println("O Triâncgulo é Isósceles, possui dois lados iguais");
        }
        if ((l1 != l2) && (l2 != l3) && (l1 != l3)) {
            System.out.println("O Triângulo é Escaleno, todos os lados são diferentes");
        }
    }
}
