/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.vista;

import ec.edu.ups.examen_jhonatan.tacuri.modelo.CarritoCompras;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author venot
 */
public class VistaCarrito {
    private Scanner teclado;

    public VistaCarrito() {
        teclado= new Scanner(System.in);
    }
    
    public CarritoCompras ingresarCarrito(){
        System.out.println("Ingrese Carrito ");
        int cedu = teclado.nextInt();
        int anio = teclado.nextInt();
        int mes = teclado.nextInt();
        int dia = teclado.nextInt();
        int hora = teclado.nextInt() ;
        int min = teclado.nextInt();
        return new CarritoCompras(new GregorianCalendar(anio, mes, dia, hora, min), cedu);
    }
    public void mostracar(CarritoCompras car ){
        System.out.println(car);
        
    }
    public void mostraListCarr(List<CarritoCompras> lita){
        System.out.println("\tCARRITOS");
        for (CarritoCompras carritoCompras : lita) {
            System.out.println(carritoCompras);
        }
    }
    public int buscarCarr(){
        System.out.println("Ingrese id del carrito ");
        int id = teclado.nextInt();
        return id;
    }
    public void noExisteCarrito(){
        System.out.println("EL CARRITO NO EXISTE ");
    }
    public int actualizarCarrit1(){
        System.out.println("Ingrese ID del carrito a actualizar");
        int id = teclado.nextInt();
        return id;
    }
    
    public CarritoCompras actualizarCarrit2(int id){
        System.out.println("Ingrese los nuevos datos del carrito ");
        int anio = teclado.nextInt();
        int mes = teclado.nextInt();
        int dia = teclado.nextInt();
        int hora = teclado.nextInt() ;
        int min = teclado.nextInt();
        return new CarritoCompras(new GregorianCalendar(anio, mes, dia, hora, min), id);
    }
    public int eliminarCarri(){
        System.out.println("Ingrese el ID del carrito a eliminar");
        int id =teclado.nextInt();
        return id ;
    }
    public void eliminarCarrit(){
        System.out.println("\tELIMINADO");
    }
    public String agregarClien(){
        System.out.println("Ingrese la cedula del cliente ");
        String ced = teclado.next();
        return ced;
    }
    public int agregProducto(){
        System.out.println("Ingrese el numero de productos que va a ingresar");
        int num = teclado.nextInt();
        return num;
    }
    public int agregarProducto2(){
        System.out.println("Ingrese el codigo del producto");
        int cod = teclado.nextInt();
        return cod;
    }
}
