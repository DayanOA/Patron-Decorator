/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampledecoratorpattern;

/**
 *
 * @author Tonny
 */
public class BMW extends Automovil {

    @Override
    public String getDescription() {
        return "BMW 18, Modelo 2020, Color negro \n";
    }

    @Override
    public int getPrice() {
        return 50000000;
    }
}
