/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.Dao;

import ec.edu.ups.examen_jhonatan.tacuri.IDao.IProductoDAO;
import ec.edu.ups.examen_jhonatan.tacuri.modelo.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author venot
 */
public class ProductoDAO implements IProductoDAO {
    private List<Producto> litaProductos;

    public ProductoDAO() {
        litaProductos = new ArrayList<>();
    }
    
    

    @Override
    public void create(Producto producto) {
        litaProductos.add(producto);
    }

    @Override
    public Producto read(int codigo) {
        for (Producto produc : litaProductos) {
            if (produc.getCodigo()== codigo){
                return produc;
            }
        }
        return null;
    }

    @Override
    public void update(Producto produc) {
        for (int i = 0; i < litaProductos.size() ; i++) {
            Producto c = litaProductos.get(i);
            if (c.getCodigo()== produc.getCodigo()){
                litaProductos.set(i, produc);
            }
        }
    }

    @Override
    public void delete(Producto producto) {
        Iterator<Producto> es = litaProductos.iterator();
        while(es.hasNext()){
            Producto a = es.next();
            if (a.getCodigo()==producto.getCodigo()){
                es.remove();
                break;
                
            }
            
        }
    }

    @Override
    public List<Producto> findAll() {
        return litaProductos;
    }
    
}
