/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_jhonatan.tacuri.modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author venot
 */
public class CarritoCompras {
    private GregorianCalendar fecha;
    private Cliente cliente;
    private List<Producto> listProdictos;
    private int id ;
    private double iva=0;
    private double subTotal=0;
    private double total=0;

    public CarritoCompras() {
        listProdictos = new ArrayList<>();
    }

    public CarritoCompras(GregorianCalendar fecha, int id) {
        this.fecha = fecha;
        this.id = id;
    }

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    public void agregarCliente(Cliente clien){
        cliente = clien;
    }
    
    public void elimininarCliente(String cedula){
        if (cliente.getCedula().equalsIgnoreCase(cedula)) {
            cliente = null;
        }
    }
    
    
    public void modificarCliente(Cliente clien){
        cliente = clien;
    }
    
    
    public void agregraProduc(List<Producto> produc){
        listProdictos = produc;
    }
    
    public void eliminarProducto(Producto prod){
        Iterator<Producto> es = listProdictos.iterator();
        while (es.hasNext()) {
            Producto pr = es.next();
            if (pr.getCodigo()==prod.getCodigo()) {
                es.remove();
            }
        }
    }

    public void aPagar(){
        double sub =0;
        for (Producto producto : listProdictos) {
            sub = sub + producto.getPrecio();
        }
        
        double ivad = sub * 0.12;
        double  tot = sub + ivad;
        iva=ivad;
        subTotal=sub;
        total=tot;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }
    
    
    

    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListProdictos() {
        return listProdictos;
    }

    public void setListProdictos(List<Producto> listProdictos) {
        this.listProdictos = listProdictos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CarritoCompras other = (CarritoCompras) obj;
        if (this.id != other.id){
            return false;
        }
        return true;
    }
    
    
    

    @Override
    public String toString() {
        return "CarritoCompras{"+" ID = " + id + " hora= hh/mm" + fecha.get(GregorianCalendar.HOUR_OF_DAY) + " " + fecha.get(GregorianCalendar.MINUTE) + ", fecha= aaaa/mm/dd " + (fecha.get(GregorianCalendar.YEAR)-1) + " "+(fecha.get(GregorianCalendar.MONTH))+" "+ fecha.get(GregorianCalendar.DAY_OF_MONTH) +", subtotalpagar=" + subTotal + ", iva=" + iva + ", totalPaga=" + total + ", cliente=" + cliente + ", listProdictos=" + listProdictos + '}';
    }
    
    
}
