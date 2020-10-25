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
public abstract class ItemJugete extends Item {
    
    private String marcaJugete;

    public ItemJugete(int idItem, String nombreItem, String descripcionItem, double precioItem, String marcaJugete) {
        super(idItem, nombreItem, descripcionItem, precioItem);
        this.marcaJugete = marcaJugete;
    }

    public String getMarcaJugete() {
        return marcaJugete;
    }

    public void setMarcaJugete(String marcaJugete) {
        this.marcaJugete = marcaJugete;
    }

    @Override
    public String toString() {
        return "ItemJugete{" + "marcaJugete=" + marcaJugete + '}';
    }
    
    
}
