import java.util.Date;
public class Efectivo extends Pago {
    private Articulo articulo;
    public Efectivo(float monto, Date date){
        super(monto,date);
    }
    public float calcDevolucion(DetalleOrden detalleOrden) {
        return  detalleOrden.calcPrecio() - getPagocliente();
    }
}