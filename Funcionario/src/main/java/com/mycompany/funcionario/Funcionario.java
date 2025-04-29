/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionario;

/**
 *
 * @author Admin
 */


public class Funcionario extends MainPL{
    protected String nome;
    protected double salarioBruto;
    protected int anoAdmissao;

    public Funcionario(String nome, double salarioBruto, int anoAdmissao) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.anoAdmissao = anoAdmissao;
    }

    public double calcularPL() {
        int anoAtual = 2025;
        if ((anoAtual - anoAdmissao) < 5) {
            return 0;
        }
        return 0; // Funcionário sem grupo definido
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario Bruto: R$" + salarioBruto);
        System.out.println("Ano de Admissao: " + anoAdmissao);
        System.out.println("Participacao nos Lucros: R$" + calcularPL());
        System.out.println("-----------------------------------");
    }
}

