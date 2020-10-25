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
public abstract class ItemDecoracion extends Item{
    
    private String materialDecoración;

    public ItemDecoracion(int idItem, String nombreItem, String descripcionItem, double precioItem, String materialDecoración) {
        super(idItem, nombreItem, descripcionItem, precioItem);
        this.materialDecoración = materialDecoración;
    }

    public String getMaterialDecoración() {
        return materialDecoración;
    }

    public void setMaterialDecoración(String materialDecoración) {
        this.materialDecoración = materialDecoración;
    }

    @Override
    public String toString() {
        return "ItemDecoracion{" + "materialDecoraci\u00f3n=" + materialDecoración + '}';
    }
    
    
    
    
}
