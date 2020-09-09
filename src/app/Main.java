/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.Calculadora;

/**
 *
 * @author raulrezende
 */
public class Main {
    public static void main (String Args[]) {
        
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.somar(5, 10));

        System.out.println(calc.subtrair(8, 4));

        System.out.println(calc.multiplicar(2, 2));

        System.out.println(calc.dividir(5, 5));

        System.out.println(calc.raiz(25));
        
    }
}
