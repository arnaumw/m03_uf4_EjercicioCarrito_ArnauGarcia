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
public abstract class Item {
    private int idItem;
    private String nombreItem;
    private String descripcionItem;
    private double precioItem;

    public Item(int idItem, String nombreItem, String descripcionItem, double precioItem) {
        this.idItem = idItem;
        this.nombreItem = nombreItem;
        this.descripcionItem = descripcionItem;
        this.precioItem = precioItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getDescripcionItem() {
        return descripcionItem;
    }

    public void setDescripcionItem(String descripcionItem) {
        this.descripcionItem = descripcionItem;
    }

    public double getPrecioItem() {
        return precioItem;
    }

    public void setPrecioItem(double precioItem) {
        this.precioItem = precioItem;
    }

    @Override
    public String toString() {
        return "Item{" + "idItem=" + idItem + ", nombreItem=" + nombreItem + ", descripcionItem=" + descripcionItem + ", precioItem=" + precioItem + '}';
    }
    
    
    
}
