/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf04_ejercicocarrito;

/**
 *
 * 
 * 
 * id, cantidad, Item 
 * 
 * 
 * @author arnaugarciaalvarez
 */

public class Detalle_1 {
    
    private int IdDetalle;
    private int cantidadDetalle;
    private Item articulo;

    public Detalle_1(int IdDetalle, int cantidadDetalle, Item articulo) {
        this.IdDetalle = IdDetalle;
        this.cantidadDetalle = cantidadDetalle;
        this.articulo = articulo;
    }

    public int getIdDetalle() {
        return IdDetalle;
    }

    public void setIdDetalle(int IdDetalle) {
        this.IdDetalle = IdDetalle;
    }

    public int getCantidadDetalle() {
        return cantidadDetalle;
    }

    public void setCantidadDetalle(int cantidadDetalle) {
        this.cantidadDetalle = cantidadDetalle;
    }

    public Item getArticulo() {
        return articulo;
    }

    public void setArticulo(Item articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "Detalle{" + "IdDetalle=" + IdDetalle + ", cantidadDetalle=" + cantidadDetalle + ", articulo=" + articulo + '}';
    }
    
    
    
}
