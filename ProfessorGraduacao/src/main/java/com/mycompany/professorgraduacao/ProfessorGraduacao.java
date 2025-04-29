/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.professorgraduacao;

/**
 *
 * @author Admin
 */


public class ProfessorGraduacao extends MainProfessor{
    protected String nome;
    protected int disciplinas;

    public ProfessorGraduacao(String nome, int disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public double salario(double salarioBase, int disciplinas) {
        double desconto = salarioBase * 0.20;
        double adicional = disciplinas * 50.0;
        return salarioBase - desconto + adicional;
    }

    public void exibirDados(double salarioBase) {
        System.out.println("Nome: " + nome);
        System.out.println("Titulacao: Graduacao");
        System.out.println("Disciplinas: " + disciplinas);
        System.out.println("Salario Liquido: R$" + salario(salarioBase, disciplinas));
        System.out.println("-----------------------------------");
    }
}
