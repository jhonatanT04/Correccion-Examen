/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.IDao;

import ec.edu.ups.examen_jhonatan.tacuri.modelo.Producto;
import java.util.List;

/**
 *
 * @author venot
 */
public interface IProductoDAO {
    public void create(Producto producto);
    public Producto read(int codigo );
    public void update(Producto produc) ;
    public void delete(Producto producto);   
    public List<Producto> findAll();
}
