/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.professorgraduacao;

/**
 *
 * @author Admin
 */


public class ProfessorMestrado extends ProfessorGraduacao {
    private int artigos;

    public ProfessorMestrado(String nome, int disciplinas, int artigos) {
        super(nome, disciplinas);
        this.artigos = artigos;
    }

    // Sobrecarga do método salario
    public double salario(double salarioBase, int disciplinas, int artigos) {
        double salarioGrad = super.salario(salarioBase, disciplinas);
        double adicionalArtigos = artigos * 150.0;
        return salarioGrad + adicionalArtigos;
    }

    @Override
    public void exibirDados(double salarioBase) {
        System.out.println("Nome: " + nome);
        System.out.println("Titulacao: Mestrado");
        System.out.println("Disciplinas: " + disciplinas);
        System.out.println("Artigos Publicados: " + artigos);
        System.out.println("Salario Liquido: R$" + salario(salarioBase, disciplinas, artigos));
        System.out.println("-----------------------------------");
    }
}
