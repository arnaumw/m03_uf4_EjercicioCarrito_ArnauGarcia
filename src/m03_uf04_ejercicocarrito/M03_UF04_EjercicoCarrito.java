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
public class M03_UF04_EjercicoCarrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarritoDeLaCompra carro1 = new CarritoDeLaCompra();
        
        Item camisa1 = new Camisa(1, "Camisa1", "Camisa ajustada", 40.5, "seda");
        Item tablet1 = new Tablet(2, "Tablet1", "Tablet nueva", 800, 8);
        Item sudadera1 = new Sudadera(3, "Sudadera1", "Sudadera refacherita", 29.95, "Algodon");
        Detalle detalleCamisa1 = new Detalle(1, 2, camisa1) {};
        Detalle detalleTablet1 = new Detalle(2, 1, tablet1) {};
        Detalle detalleSudadera1 = new Detalle(3, 1, sudadera1) {};
        carro1.añade(detalleCamisa1);
        carro1.añade(detalleTablet1);
        carro1.añade(detalleSudadera1);
        carro1.elimina(detalleCamisa1);
        
        carro1.checkout();

    }
    
}
