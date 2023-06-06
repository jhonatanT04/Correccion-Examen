/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.controlador;

import ec.edu.ups.examen_jhonatan.tacuri.Dao.ProductoDAO;
import ec.edu.ups.examen_jhonatan.tacuri.modelo.Producto;
import ec.edu.ups.examen_jhonatan.tacuri.vista.VistaProducto;

/**
 *
 * @author venot
 */
public class ControladorProducto {
    private VistaProducto vistaproducto ;
    private ProductoDAO productoDao;

    public ControladorProducto(VistaProducto vistaproducto, ProductoDAO productoDao) {
        this.vistaproducto = vistaproducto;
        this.productoDao = productoDao;
    }
    
    
    
   public void ingresarProduc(){
       Producto produc = vistaproducto.ingresarProducto();
       productoDao.create(produc);
       vistaproducto.mostraProd(produc);
   } 
    public void mostrarProductos(){
        vistaproducto.mostraProductos(productoDao.findAll());
    }
    
    public void buscarProduc(){
        int codigo = vistaproducto.buscarProduc();
        Producto pro = productoDao.read(codigo);
        if (pro!=null) {
            vistaproducto.mostraProd(pro);
        }else {
            vistaproducto.noExiste();
        }
        //vistaproducto.mostraProd(pro);
    }
    
    public void eliminarProduc(){
        int eli = vistaproducto.eliminarProduct();
        Producto pro = productoDao.read(eli);
        if (pro!=null) {
            productoDao.delete(pro);
        }else {
            vistaproducto.noExiste();
        }
    }
    
    public void actualizarProduct(){
        int cod = vistaproducto.actualizarProducto();
        Producto pro = productoDao.read(cod);
        if (pro!=null) {
            Producto pr = vistaproducto.actualizarPrloduc2(cod);
            productoDao.update(pr);
            System.out.println("Se actualizado con exito");
        }else {
            vistaproducto.noExiste();
        }
    }
    
}
