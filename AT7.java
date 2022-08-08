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
public class AT6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;
        double seq1, seq2, seq3;

        System.out.println("Insira o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.println("Insira o segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("Insira o terceiro número: ");
        n3 = sc.nextDouble();

        if ((n1 < n2) && (n1 < n3) && (n2 < n3)) {

            seq1 = n1;
            seq2 = n2;
            seq3 = n3;

            System.out.println("A Decrescente é: " + seq3 + ", " + seq2 + " e " + seq1);
        }
        if ((n1 < n2) && (n1 < n3) && (n3 < n2)) {

            seq1 = n1;
            seq2 = n3;
            seq3 = n2;

            System.out.println("A Decrescente é: " + seq3 + ", " + seq2 + " e " + seq1);
        }
        if ((n2 < n1) && (n2 < n3) && (n1 < n3)) {

            seq1 = n2;
            seq2 = n1;
            seq3 = n3;

            System.out.println("A Decrescente é: " + seq3 + ", " + seq2 + " e " + seq1);
        }
        if ((n2 < n1) && (n2 < n3) && (n3 < n1)) {

            seq1 = n2;
            seq2 = n3;
            seq3 = n1;

            System.out.println("A Decrescente é: " + seq3 + ", " + seq2 + " e " + seq1);
        }
        if ((n3 < n1) && (n3 < n2) && (n2 < n1)) {

            seq1 = n3;
            seq2 = n2;
            seq3 = n1;

            System.out.println("A Decrescente é: " + seq3 + ", " + seq2 + " e " + seq1);
        }
        if ((n3 < n1) && (n3 < n2) && (n1 < n2)) {

            seq1 = n3;
            seq2 = n1;
            seq3 = n2;

            System.out.println("A Decrescente é: " + seq3 + ", " + seq2 + " e " + seq1);
        }
    }
}
