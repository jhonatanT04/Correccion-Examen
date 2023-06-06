/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.vista;

import ec.edu.ups.examen_jhonatan.tacuri.modelo.Cliente;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author venot
 */
public class VistaCliente {
    private Scanner teclado;

    public VistaCliente() {
        teclado= new Scanner(System.in);
    }
    
    public Cliente ingresarClienteDar(){
        System.out.println("Ingrese Cliente ");
        String cedu = teclado.next();
        String nom = teclado.next();
        String apell = teclado.next();
        String direccion = teclado.next();
        String tele = teclado.next();
        return new Cliente(cedu, nom, apell, direccion, tele);
    }
    public void mostrarCli(Cliente clie){
        System.out.println("\tCliente\n"+clie);
    }
    public void mostrClientes(List<Cliente> lista){
        System.out.println("\tCLIENTES");
        for (Cliente cliente : lista) {
            System.out.println(cliente);
        }
        
    }
    public String buscarPorCedu(){
        System.out.println("Ingrese Cedula ");
        String ced = teclado.next();
        return ced;
    }
    public void noExiste(){
        System.out.println("Los datos ingresados no existen ");
    }
    
    public String eliminarCliente1(){
        System.out.println("Ingrese Cedula del cliente a eliminar ");
        String ced = teclado.next();
        return ced;
    }
    public void eliminarCliente2(){
        System.out.println("\tELIMINADO");
    }
    public String actualizarCliente1(){
        System.out.println("Ingrese la cedula a actualizar ");
        String ced = teclado.next();
        return ced;
    }
    public Cliente actualizarCliente2(String ced){
        System.out.println("Ingrese los nusvos datoss del Cliente "+ced);
        String nom = teclado.next();
        String apell = teclado.next();
        String direc = teclado.next();
        String tel = teclado.next();
        return new Cliente(ced, nom, apell, direc, tel);
    }
    
    
    
}
