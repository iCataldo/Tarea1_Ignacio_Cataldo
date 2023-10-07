import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ignacio","21.431.638-2");
        Direccion direccion1 = new Direccion("San Pedro");
        Articulo articulo1 = new Articulo(10,"articulo1","este es el articulo 1",300);
        Articulo articulo2 = new Articulo(20,"articulo2","este es el articulo2",250);
        DetalleOrden detalleOrden1 = new DetalleOrden(articulo1, 3);
        DetalleOrden detalleOrden2 = new DetalleOrden(articulo2,5);
        OrdenCompra ordenCompra1 = new OrdenCompra(new Date(),"Estado");
        ordenCompra1.AddToOrdenCompra(detalleOrden1);
        ordenCompra1.AddToOrdenCompra(detalleOrden2);
        float a=detalleOrden1.calcPrecio();
        float b=detalleOrden2.calcPrecio();
        System.out.print("$"); System.out.print(a+b);
        Efectivo efectivo1= new Efectivo(100,new Date());
        float c = efectivo1.calcDevolucion(detalleOrden1);
        System.out.println("  ");
        System.out.println(c);
    }
}