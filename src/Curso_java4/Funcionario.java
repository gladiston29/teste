/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curso_java4;

/**
 *
 * @author Gladiston Fernando
 */
public class Funcionario {

    String nome, departamento, dataEntrada, rg;
    double salario;

    void recebeAumento(double aumento) {

        this.salario += aumento;

    }

    double calculaGanhoAnual() {
        return this.salario * 12;

    }

    void mostra() {
        System.out.println("--------Dados funcionário:-------");
        System.out.println("Nome:" + this.nome
                + "\nDepartamento:" + this.departamento
                + "\nRG: " + this.rg
                + "\nData de entrada: " + this.dataEntrada
                + "\nSalário: " + this.salario);

    }
}
