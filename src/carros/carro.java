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
public class carro {

    String cor;
    String modelo;
    String marca;
    motor compoe;
    double velocidademaxima;
    double velocidadeatual;

    void acelera(double valor, double velocidademaxima, double velocidadeatual) {
        System.out.println("velocidade autal e: " + velocidadeatual);
        if (valor < velocidademaxima) {
            velocidadeatual = velocidadeatual + valor;
            System.out.println("velocidade atual e: " + velocidadeatual);
        }
    }
    
    

}
class motor{
String tipo;
String cilindrada;
}