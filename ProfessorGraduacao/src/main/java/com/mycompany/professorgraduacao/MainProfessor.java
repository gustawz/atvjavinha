/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.professorgraduacao;

/**
 *
 * @author Admin
 */


public class MainProfessor {
    public static void main(String[] args) {
        double salarioBase = 25000.0;

        ProfessorGraduacao prof1 = new ProfessorGraduacao("Juliana", 4);
        ProfessorMestrado prof2 = new ProfessorMestrado("Fernando", 3, 5);

        prof1.exibirDados(salarioBase);
        prof2.exibirDados(salarioBase);
    }
}
