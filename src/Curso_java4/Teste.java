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
public class Teste {

    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Empresa e = new Empresa();
        e.funcionarios = new Funcionario[10];

        f.dataEntrada = "123";
        f.departamento = "dep";
        f.nome = "Fulano";
        f.rg = "123";
        f.salario = 1200;
        e.adiciona(f);
        e.imprimeFuncionarios();

        //f.mostra();
    }

}
