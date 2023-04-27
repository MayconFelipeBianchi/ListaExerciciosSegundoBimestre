/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_ingressos;

/**
 *
 * @author aluno
 */
public class Exercicio_Ingressos {

    public static void main(String[] args) {

        ingresso ingresso = new ingresso(50.0);
        IngressoVip ingressoVip = new IngressoVip(50.0, 20.0);

        System.out.println(ingresso.toString());
        System.out.println(ingressoVip.toString());
    }
    
}