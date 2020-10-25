/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf04_ejercicocarrito;


import java.util.ArrayList;

/**
 *
 * @author arnaugarciaalvarez
 *
 * Implementa una ejercicio original con:
 *
 * Herencia
 *
 * Polimorfismo
 *
 * Intefaces
 *
 * Propiedades, etc.
 *
 *
 * Opcionalmente, usa este ejemplo para tu desarrollo.
 *
 * Fecha limite entrega Domingo 25 a las 12 de la noche.
 *
 *
 * No olvides implementar y verificar checkout()
 *
 */
public class CarritoDeLaCompra implements Finalizable {

    private ArrayList<Detalle> carrito = new ArrayList<>();

    public void añade(Detalle detalle) {
        carrito.add(detalle);
        System.out.println("Detalle añadido al carito...");
    }

    public void elimina(Detalle detalle) {
        carrito.remove(detalle);
        System.out.println("Detalle eliminado del carrito...");
    }

    @Override
    public double checkout() {

        int i;
        int cantidadProducto;
        int cantidadTotal = 0;
        double precioFinal = 0.0;

        for (i = 0; i < carrito.size(); i++) {
            cantidadProducto = carrito.get(i).getCantidadDetalle();
            cantidadTotal = cantidadTotal + cantidadProducto;
            precioFinal = precioFinal + (carrito.get(i).getArticulo().getPrecioItem()) * cantidadProducto;
        }

        System.out.println("Hay " + cantidadTotal + " Ítems en el carrito.");
        System.out.println("El total del carrito es de: " + precioFinal + "€");
        return precioFinal;
    }

}