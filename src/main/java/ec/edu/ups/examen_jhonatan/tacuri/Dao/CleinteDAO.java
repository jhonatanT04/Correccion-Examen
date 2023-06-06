/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.Dao;

import ec.edu.ups.examen_jhonatan.tacuri.IDao.IClienteDAO;
import ec.edu.ups.examen_jhonatan.tacuri.modelo.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author venot
 */
public class CleinteDAO implements IClienteDAO {
    private List<Cliente> listaclientes;

    public CleinteDAO() {
        listaclientes = new ArrayList<>();
    }

    
    
    
    @Override
    public void create(Cliente cliente) {
        listaclientes.add(cliente);
    }

    @Override
    public Cliente read(String cedula) {
        for (Cliente listacliente : listaclientes) {
            if (listacliente.getCedula().equals(cedula)){
                return listacliente;
            }
        }
        return null;
    }

    @Override
    public void update(Cliente clien) {
        for (int i = 0; i < listaclientes.size() ; i++) {
            Cliente c = listaclientes.get(i);
            if (c.getCedula().equals(clien.getCedula())){
                listaclientes.set(i, clien);
            }
        }
    }

    @Override
    public void delete(Cliente clien) {
        Iterator<Cliente> es = listaclientes.iterator();
        while(es.hasNext()){
            Cliente a = es.next();
            if (a.getCedula().equals(clien.getCedula())){
                es.remove();
                break;
                
            }
            
        }
    }

    @Override
    public List<Cliente> findAll() {
        return listaclientes;
    }
    
    
}
