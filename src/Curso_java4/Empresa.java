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
public class Empresa {

    String cnpj;
    String nome;
    String telefone;
    Funcionario[] funcionarios;

    void adiciona(Funcionario fun) {

        for (int i = 0; i < this.funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = fun;
                break;
            }

        }
    }

    void imprimeFuncionarios() {
        for (Funcionario i : funcionarios) {
            if (i != null) {
                System.out.println("data : " + i.dataEntrada);
                System.out.println("departamento : " + i.departamento);
                System.out.println("nome funcionario : " + i.nome);
                System.out.println("rg : " + i.rg);
                System.out.println("salario : " + i.salario);
            }

        }
    }

}
