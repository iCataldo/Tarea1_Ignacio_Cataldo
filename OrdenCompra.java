import java.util.ArrayList;
import java.util.Date;
public class OrdenCompra{
    private DetalleOrden DO;
    private Date fecha;
    private String estado;
    private DetalleOrden detalleOrden;
    private ArrayList ar;
    public OrdenCompra(Date fecha, String estado) {
        this.ar = new ArrayList<DetalleOrden>();
        this.fecha = fecha;
        this.estado = estado;
    }
    public ArrayList getAr(){
        return ar;
    }
    public ArrayList AddToOrdenCompra(DetalleOrden detalle){
        ar.add(detalle);
        return ar;
    }
}
