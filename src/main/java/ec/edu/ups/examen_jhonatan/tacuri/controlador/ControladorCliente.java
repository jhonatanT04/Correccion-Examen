/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.controlador;

import ec.edu.ups.examen_jhonatan.tacuri.Dao.CleinteDAO;
import ec.edu.ups.examen_jhonatan.tacuri.modelo.Cliente;
import ec.edu.ups.examen_jhonatan.tacuri.vista.VistaCliente;

/**
 *
 * @author venot
 */
public class ControladorCliente {
    private CleinteDAO clienteDao;
    private VistaCliente vistacliente;

    public ControladorCliente(CleinteDAO clienteDao, VistaCliente vistacliente) {
        this.clienteDao = clienteDao;
        this.vistacliente = vistacliente;
        
    }
    
    public void ingreDatos(){
        Cliente clien = vistacliente.ingresarClienteDar();
        clienteDao.create(clien);
        vistacliente.mostrarCli(clien);
    }
    
    public void mostraCleintes(){
        vistacliente.mostrClientes(clienteDao.findAll());
    }
    
    public void buscarCliente(){
        String ced = vistacliente.buscarPorCedu();
        Cliente cli = clienteDao.read(ced);
        if (cli != null) {
            vistacliente.mostrarCli(cli);
        }else{
            vistacliente.noExiste();
        }
    }
    
    public void eliminarCliente(){
        String ced = vistacliente.eliminarCliente1();
        Cliente clie = clienteDao.read(ced);
        if (clie != null) {
            clienteDao.delete(clie);
            vistacliente.eliminarCliente2();
        }else{
            vistacliente.noExiste();
        }
    }
    
    public void actualizarCliente(){
        String ced = vistacliente.actualizarCliente1();
        Cliente cli = clienteDao.read(ced);
        if (cli != null) {
            Cliente clie = vistacliente.actualizarCliente2(ced);
            clienteDao.update(clie);
        }else{
            vistacliente.noExiste();
        }
    }
}
