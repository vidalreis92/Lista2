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
public class AT13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos lados tem o seu polígono?");
        int lados = sc.nextInt();
        System.out.println("Qual é o tamanho destes lados?");
        int tamanho = sc.nextInt();
        if (lados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else {
            if (lados > 5) {
                System.out.println("POLÍGONO NÃO IDENTIFICADO");
            } else {
                switch (lados) {
                    case 3 -> {
                        System.out.println("O SEU POLÍGONO É UM TRIÂNGULO");
                        System.out.println("A ÁREA DELE É DE " + ((Math.pow(tamanho, 2) * Math.sqrt(3)) / 4) + "CM²");
                    }
                    case 4 -> {
                        System.out.println("O SEU POLÍGONO É UM QUADRADO");
                        System.out.println("A ÁREA DELE É DE " + (tamanho * tamanho));
                    }
                    case 5 ->
                        System.out.println("O SEU POLÍGONO É UM PENTAGONO");

                }
            }
        }
    }
}
