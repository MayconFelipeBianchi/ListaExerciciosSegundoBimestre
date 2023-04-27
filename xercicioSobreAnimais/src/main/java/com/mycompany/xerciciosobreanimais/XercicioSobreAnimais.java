/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.xerciciosobreanimais;

/**
 *
 * @author aluno
 */
public class XercicioSobreAnimais {

public static void main(String[]args){
    Peixe tubarao = new Peixe("Tubarão", "Barbatanas e cauda", 300, 1.5f);

    tubarao.dados ();

    Mamifero urso = new Mamifero("Urso-do-Canadá", "Castanho", "Mel", 180, 0.5f, 4);

    urso.dados ();
}
}
