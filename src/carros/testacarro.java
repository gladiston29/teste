/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author Gladiston Fernando
 */
public class testacarro {

    public static void main(String[] args) {
        carro c = new carro();
//        c.velocidadeatual = 50;
//        c.velocidademaxima = 100;
//        c.acelera(40, c.velocidademaxima, c.velocidadeatual);
//        System.out.println("");
//        c.velocidadeatual = 50;
//        c.velocidademaxima = 100;
//        c.acelera(80, c.velocidademaxima, c.velocidadeatual);
//        System.out.println("");
//        c.velocidadeatual = 50;
//        c.velocidademaxima = 100;
//        c.acelera(20, c.velocidademaxima, c.velocidadeatual);
motor m =new motor();
c.compoe=m;
m.cilindrada="20";
m.tipo="conversiveo";
        System.out.println(c.compoe.cilindrada);
        System.out.println(c.compoe.tipo);

    }

}
