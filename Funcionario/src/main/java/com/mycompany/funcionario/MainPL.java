/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario;
public class MainPL {
    public static void main(String[] args) {
        Funcionario f1 = new GrupoABC("Ana", 3000.00, 2018);
        Funcionario f2 = new GrupoDEF("Carlos", 3500.00, 2021);
        Funcionario f3 = new GrupoGHI("Beatriz", 2800.00, 2015);
        Funcionario f4 = new GrupoABC("Daniel", 3100.00, 2023); // Menos de 5 anos

        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();
        f4.exibirDados();
    }
}


