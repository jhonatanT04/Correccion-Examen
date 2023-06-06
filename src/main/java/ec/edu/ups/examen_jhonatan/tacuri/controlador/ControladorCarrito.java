/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.controlador;

import ec.edu.ups.examen_jhonatan.tacuri.Dao.CarritoDAO;
import ec.edu.ups.examen_jhonatan.tacuri.Dao.CleinteDAO;
import ec.edu.ups.examen_jhonatan.tacuri.Dao.ProductoDAO;
import ec.edu.ups.examen_jhonatan.tacuri.modelo.CarritoCompras;
import ec.edu.ups.examen_jhonatan.tacuri.modelo.Cliente;
import ec.edu.ups.examen_jhonatan.tacuri.modelo.Producto;
import ec.edu.ups.examen_jhonatan.tacuri.vista.VistaCarrito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author venot
 */
public class ControladorCarrito {
    private VistaCarrito vistaCarri;
    private CarritoDAO carritoDao;
    private CleinteDAO clientDao;
    private ProductoDAO producDao;

    public ControladorCarrito(VistaCarrito vistaCarri, CarritoDAO carritoDao, CleinteDAO clientDao, ProductoDAO producDao) {
        this.vistaCarri = vistaCarri;
        this.carritoDao = carritoDao;
        this.clientDao = clientDao;
        this.producDao = producDao;
    }

    

    
    
    public void ingresarCarri(){
        CarritoCompras a = vistaCarri.ingresarCarrito();
        carritoDao.create(a);
    }
    public void mostrarListaCarr(){
        vistaCarri.mostraListCarr(carritoDao.findAll());
    }
    public void buscarCarrito(){
        int id = vistaCarri.buscarCarr();
        CarritoCompras carr = carritoDao.read(id);
        if (carr != null) {
            vistaCarri.mostracar(carr);
        }else{
            vistaCarri.noExisteCarrito();
        }
    }
    public void actualizarCarrito(){
        int id = vistaCarri.actualizarCarrit1();
        CarritoCompras carr = carritoDao.read(id);
        if (carr != null) {
            CarritoCompras ca = vistaCarri.actualizarCarrit2(id);
            carritoDao.update(ca);
            
        }else{
            vistaCarri.noExisteCarrito();
        }
    }
    public void eliminarCarrito (){
        int id = vistaCarri.eliminarCarri();
        CarritoCompras carrit = carritoDao.read(id);
        if (carrit != null) {
            carritoDao.delete(carrit);
            vistaCarri.eliminarCarrit();
        }else{
            vistaCarri.noExisteCarrito();
        }
    }
    public void agregarUnClien(){
        int id = vistaCarri.buscarCarr();
        CarritoCompras carr = carritoDao.read(id);
        if (carr != null) {
            String ced = vistaCarri.agregarClien();
            Cliente clie = clientDao.read(ced);
            if (clie != null) {
                carr.agregarCliente(clie);
                carritoDao.update(carr);
            }else{
                vistaCarri.noExisteCarrito();
            }
        }else{
            vistaCarri.noExisteCarrito();
        }
    }
    public void agregProductos(){
        int id = vistaCarri.buscarCarr();
        CarritoCompras carr = carritoDao.read(id);
        if (carr != null) {
            int num = vistaCarri.agregProducto();
            List<Producto> lista = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                int cod = vistaCarri.agregarProducto2();
                Producto pro = producDao.read(cod);
                if (pro != null) {
                    lista.add(pro);
                }else{
                    vistaCarri.noExisteCarrito();
                }
            }
            carr.agregraProduc(lista);
            carr.aPagar();
            carritoDao.update(carr);
        }else{
            vistaCarri.noExisteCarrito();
        }
    }
}