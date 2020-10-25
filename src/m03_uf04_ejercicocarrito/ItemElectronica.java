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
public abstract class ItemElectronica extends Item {
    
    private int ramDispositivo;

    public ItemElectronica(int idItem, String nombreItem, String descripcionItem, double precioItem, int ramDispositivo) {
        super(idItem, nombreItem, descripcionItem, precioItem);
        this.ramDispositivo = ramDispositivo;
    }

    public int getRamDispositivo() {
        return ramDispositivo;
    }

    public void setRamDispositivo(int ramDispositivo) {
        this.ramDispositivo = ramDispositivo;
    }

    @Override
    public String toString() {
        return "ItemElectronica{" + "ramDispositivo=" + ramDispositivo + '}';
    }
    
    
    
    
}
