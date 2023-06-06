/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.IDao;

import ec.edu.ups.examen_jhonatan.tacuri.modelo.Cliente;
import java.util.List;

/**
 *
 * @author venot
 */
public interface IClienteDAO {
    public void create(Cliente cliente);
    public Cliente read(String cedula );
    public void update(Cliente clien) ;
    public void delete(Cliente clien);   
    public List<Cliente> findAll();
    
}
