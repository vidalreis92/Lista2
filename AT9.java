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
public class AT9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sexo;
        double h, form;

        System.out.println("Insira sua altura");
        h = sc.nextDouble();

        System.out.println("Insira seu sexo");
        System.out.println("F para mulher");
        System.out.println("M para homem");
        sexo = sc.next();

        if ("M".equals(sexo)) {
            form = ((72.7 * h) - 58);
            System.out.println("O peso ideal do homem é de: " + form);
        } else {
            form = ((62.1 * h) - 44.7);
            System.out.println("O peso ideal da mulher é de: " + form);
        }
    }
}
