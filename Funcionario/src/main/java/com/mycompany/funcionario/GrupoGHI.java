/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario;



public class GrupoGHI extends Funcionario {
    public GrupoGHI(String nome, double salarioBruto, int anoAdmissao) {
        super(nome, salarioBruto, anoAdmissao);
    }

    @Override
    public double calcularPL() {
        if ((2025 - anoAdmissao) < 5) return 0;
        return salarioBruto * 2;
    }
}
