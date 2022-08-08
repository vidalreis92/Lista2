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
public class AT12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double[] notas = new double[3];
        double mediaAtv;
        System.out.println("Insira o número de identificação do aluno:");
        int matricula = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.println("Insira a " + (i + 1) + "º nota:");
            notas[i] = sc.nextDouble();
        }
        System.out.println("Qual foi a média das atividades?");
        mediaAtv = sc.nextDouble();
        double notaFinal = ((((notas[0] + notas[1]) * 2) + (notas[2] * 3) + mediaAtv) / 8);
        System.out.println("O aluno com o seu número de identificação " + matricula);
        System.out.println("teve as seguintes notas:");
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Segunda nota: " + notas[1]);
        System.out.println("Terceira nota: " + notas[2]);
        System.out.println("Média das atividades: " + mediaAtv);
        System.out.println("Média de aproveitamento: " + notaFinal);
        if (notaFinal >= 90) {
            System.out.println("O aluno está APROVADO com um conceito A");
        } else {
            if (notaFinal >= 75) {
                System.out.println("O aluno está APROVADO com um conceito B");
            } else {
                if (notaFinal >= 60) {
                    System.out.println("O aluno está APROVADO com um conceito C");
                } else {
                    if (notaFinal >= 40) {
                        System.out.println("O aluno está REPROVADO com um conceito D");
                    } else {
                        System.out.println("O aluno está REPROVADO com um conceito E");
                    }
                }
            }
        }
    }
}
