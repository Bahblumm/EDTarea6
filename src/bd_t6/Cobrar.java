/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd_t6;

public class Cobrar {  
    private static final int LIMITE_DE_PRODUCTOS_PARA_DESCUENTO = 3;
    private static final int DESCUENTO_BASE_INICIAL = 5;
    private static final int NUMERO_DE_PRODUCTOS_PARA_INVALIDAR_DESCUENTO_MAX = 0;
    private static final double DESCUENTO_MEDIO = 0.95;
    private static final double DESCUENTO_MAXIMO = 0.8;

    public void aplicarDescuento(double precioProducto, int numProductos){     
        
    double total;
    if(numProductos>LIMITE_DE_PRODUCTOS_PARA_DESCUENTO)
        precioProducto-=DESCUENTO_BASE_INICIAL;
            if (numProductos!=NUMERO_DE_PRODUCTOS_PARA_INVALIDAR_DESCUENTO_MAX){
            total = precioProducto*DESCUENTO_MAXIMO;
            imprimirTotal(total);
            } else {
            total = precioProducto*DESCUENTO_MEDIO;
            imprimirTotal(total);
            }      
    } 

    private void imprimirTotal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");      
    }
}
