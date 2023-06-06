/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.IDao;

import ec.edu.ups.examen_jhonatan.tacuri.modelo.CarritoCompras;
import java.util.List;

/**
 *
 * @author venot
 */
public interface ICarritoDAO {
    public void create(CarritoCompras carrito);
    public CarritoCompras read(int id );
    public void update(CarritoCompras carrito) ;
    public void delete(CarritoCompras carrito);   
    public List<CarritoCompras> findAll();
    
}
