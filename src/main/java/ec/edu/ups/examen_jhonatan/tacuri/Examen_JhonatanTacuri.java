/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.examen_jhonatan.tacuri;

import ec.edu.ups.examen_jhonatan.tacuri.Dao.CarritoDAO;
import ec.edu.ups.examen_jhonatan.tacuri.Dao.CleinteDAO;
import ec.edu.ups.examen_jhonatan.tacuri.Dao.ProductoDAO;
import ec.edu.ups.examen_jhonatan.tacuri.controlador.ControladorCarrito;
import ec.edu.ups.examen_jhonatan.tacuri.controlador.ControladorCliente;
import ec.edu.ups.examen_jhonatan.tacuri.controlador.ControladorProducto;
import ec.edu.ups.examen_jhonatan.tacuri.vista.VistaCarrito;
import ec.edu.ups.examen_jhonatan.tacuri.vista.VistaCliente;
import ec.edu.ups.examen_jhonatan.tacuri.vista.VistaProducto;
import java.util.Scanner;


/**
 *
 * @author venot
 */
public class Examen_JhonatanTacuri {

    public static void main(String[] args) {
        VistaProducto vistaproducto = new VistaProducto();
        ProductoDAO productoDao = new ProductoDAO();
        ControladorProducto contrProd = new ControladorProducto(vistaproducto, productoDao);
        
        VistaCliente vistaClie = new VistaCliente();
        CleinteDAO cleinteDao = new CleinteDAO();
        ControladorCliente contrClient = new ControladorCliente(cleinteDao, vistaClie);
        
        VistaCarrito vistaCarr = new VistaCarrito();
        CarritoDAO carritoDao = new CarritoDAO();
        ControladorCarrito controladorCarrito =new ControladorCarrito(vistaCarr, carritoDao,cleinteDao,productoDao);
        int opc= 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese que desea realizar \n1.Ingresar un producto\n2.Buscar producto\n3.Eliminar Producto\n4.Mostrar Productos\n5.Actualizar Producto"
                    + "\n \n6.Ingresar un Cliente \n7.Buscar un cliente\n8.Eliminar Cliente\n9.Actualizar Cliente\n10.Mostrar Clientes"
                    +"\n \n11.Ingresar un Carrito \n12.Buscar carrito\n13.Actualizar Carrito\n14.Eliminar Carrito \n15.Mostrar Carritos\n16.Agregar Cliente\n17.Agregar Producto");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    contrProd.ingresarProduc();
                    break;
                case 2 :
                    contrProd.buscarProduc();
                    break;
                case 3 :
                    contrProd.eliminarProduc();
                    break;
                case 4 :
                    contrProd.mostrarProductos();
                    break;
                case 5 :
                    contrProd.actualizarProduct();
                    break;
                case 6 :
                    contrClient.ingreDatos();
                    break;
                case 7 :
                    contrClient.buscarCliente();
                    break;
                case 8:
                    contrClient.eliminarCliente();
                    break;
                case 9:
                    contrClient.actualizarCliente();
                    break;
                case 10:
                    contrClient.mostraCleintes();
                    break;
                case 11:
                    controladorCarrito.ingresarCarri();
                    break;
                case 12:
                    controladorCarrito.buscarCarrito();
                    break;
                case 13:
                    controladorCarrito.actualizarCarrito();
                    break;
                case 14:
                    controladorCarrito.eliminarCarrito();
                    break;
                case 15 :
                    controladorCarrito.mostrarListaCarr();
                    break;
                case 16:
                    controladorCarrito.agregarUnClien();
                    break;
                case 17:
                    controladorCarrito.agregProductos();
                    break;
            }
            
        } while (opc!=0) ;
    }
}
