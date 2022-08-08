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
public class AT11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pet, result, perc;
        String menu;

        System.out.println("Insira o preço de etiqueta do produto");
        pet = sc.nextDouble();

        System.out.println("Qual a condição do pagamento?");

        System.out.println("1-Á vista em dinheiro ou cheque, recebe 10% de desconto");
        System.out.println("2-Á vista no cartão de crédito, recebe 15% de desconto");
        System.out.println("3-Em duas vezes, preço normal de etiqueta sem juros");
        System.out.println("4-Em duas vezes, preço normal de etiqueta mais juros de 10%");
        menu = sc.next();

        if ("1".equals(menu)) {
            perc = ((pet * 10) / 100);
            result = (pet - perc);
            System.out.println("Total a pagar: " + result + "R$");
        }
        if ("2".equals(menu)) {
            perc = ((pet * 15) / 100);
            result = (pet - perc);
            System.out.println("Total a pagar: " + result + "R$");
        }
        if ("3".equals(menu)) {
            result = (pet / 2);
            System.out.println("Parcelado em 2 vezes, o valor de cada parcela é: " + result + "R$");
        }
        if ("4".equals(menu)) {
            perc = ((pet * 10) / 100);
            result = ((pet + perc) / 2);
            System.out.println("Parcelado em duas vezes, com 10% de juros");
            System.out.println("Total a pagar em duas vezes: " + result + "R$");
        }
    }
}
