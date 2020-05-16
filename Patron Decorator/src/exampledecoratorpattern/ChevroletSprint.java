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
public class ChevroletSprint extends Automovil {

    @Override
    public String getDescription() {
        return "Chevrolet Sprint LTZ, Modelo 2014, Color verde \n";
    }

    @Override
    public int getPrice() {
        return 40000000;
    }
}
