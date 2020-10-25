/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf04_ejercicocarrito;

/**
 *
 * @author arnaugarciaalvarez
 */
public abstract class ItemRopa extends Item {
    
    private String tejidoRopa;

    public ItemRopa(int idItem, String nombreItem, String descripcionItem, double precioItem, String tejidoRopa) {
        super(idItem, nombreItem, descripcionItem, precioItem);
        this.tejidoRopa = tejidoRopa;
    }

    public String getTejidoRopa() {
        return tejidoRopa;
    }

    public void setTejidoRopa(String tejidoRopa) {
        this.tejidoRopa = tejidoRopa;
    }

    @Override
    public String toString() {
        return "ItemRopa{" + "tejidoRopa=" + tejidoRopa + '}';
    }
    
    
}
