/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.vista;

import ec.edu.ups.examen_jhonatan.tacuri.modelo.Producto;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author venot
 */
public class VistaProducto {
    private Scanner teclado;

    public VistaProducto() {
        teclado= new Scanner(System.in);
    }
    
    public Producto ingresarProducto(){
        System.out.println("Ingrese Producto ");
        int cedu = teclado.nextInt();
        String nom = teclado.next();
        String des = teclado.next();
        double precio = teclado.nextDouble();
        return new Producto(cedu, nom, des, precio) ;
    }
    public void mostraProd(Producto pro){
        System.out.println("\tEl producto ingresado es ");
        System.out.println(pro+"\n");
    }
    public void mostraProductos(List<Producto> lita){
        System.out.println("\t*****Datos Productos******");
        for (Producto producto : lita) {
            System.out.println(producto);
        }
        
    }
    
    public int actualizarProducto(){
        System.out.println("Ingrese el codigo del producto para actualizar : ");
        int cod = teclado.nextInt();
        return cod;
    }
    public Producto actualizarPrloduc2(int cod){
        System.out.println("Ingrese los nuevos datos del Producto ");
        String nom = teclado.next();
        String des = teclado.next();
        double precio = teclado.nextDouble();
        return new Producto(cod, nom, des, precio) ;
    }
        
    
    public int buscarProduc(){
        System.out.println("Ingrese el codigo del producto ");
        int cod = teclado.nextInt();
        return cod;
    }
    public int eliminarProduct(){
        System.out.println("Ingrese el codigo del producto a eliminar ");
        int eli = teclado.nextInt();
        
        return eli ;
    }
    
    public void noExiste(){
        System.out.println("Codigo Invalido");
    }
}
