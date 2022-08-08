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
public class AT5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, result;

        System.out.println("Insira um valor");
        n = sc.nextInt();

        if (n > 0) {
            result = (n * 2);
            System.out.println("O Valor é positivo");
            System.out.println("O dobro do valor é: " + result);
        } else if (n < 0) {
            result = (n * 3);
            System.out.println("O Valor é negativo");
            System.out.println("O triplo do valor é: " + result);
        } else {
            System.out.println("O Valor é neutro.");
        }
    }
}
