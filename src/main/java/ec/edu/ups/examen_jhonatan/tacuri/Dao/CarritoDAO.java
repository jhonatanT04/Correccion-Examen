/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.Dao;

import ec.edu.ups.examen_jhonatan.tacuri.IDao.ICarritoDAO;
import ec.edu.ups.examen_jhonatan.tacuri.modelo.CarritoCompras;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author venot
 */
public class CarritoDAO implements ICarritoDAO{
    private List<CarritoCompras> listacarritos;

    public CarritoDAO() {
        listacarritos= new ArrayList<>();
    }
    
    
    
    @Override
    public void create(CarritoCompras carrito) {
        listacarritos.add(carrito);
    }

    @Override
    public CarritoCompras read(int id) {
        for (CarritoCompras produc : listacarritos) {
            if (produc.getId()==id){
                return produc ;
            }
        }
        return null;
    }

    @Override
    public void update(CarritoCompras carrito) {
        for (int i = 0; i < listacarritos.size() ; i++) {
            CarritoCompras c = listacarritos.get(i);
            if (c.getId()== carrito.getId()){
                listacarritos.set(i, carrito);
            }
        }
    }

    @Override
    public void delete(CarritoCompras carrito) {
        Iterator<CarritoCompras> es = listacarritos.iterator();
        while(es.hasNext()){
            CarritoCompras a = es.next();
            if (a.getId()==carrito.getId()){
                es.remove();
                break;
                
            }
            
        }
    }

    @Override
    public List<CarritoCompras> findAll() {
        return listacarritos;
    }
    
}
