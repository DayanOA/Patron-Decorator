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
public class Radio extends AutomovilDecorator {

    public Radio(VentaAuto ventaAuto) {
        super(ventaAuto);
    }

    @Override
    public String getDescription() {
        return getVentaAuto().getDescription() + "\n- Radio";
    }

    @Override
    public int getPrice() {
        return getVentaAuto().getPrice() + 100000;
    }

}
