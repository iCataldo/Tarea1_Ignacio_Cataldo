import java.util.Date;
public class Pago {
    private float monto;
    private float pagocliente;
    private Date fecha;
    public float getMonto(){
        return monto;
    }
    public Pago(float monto, Date fecha){
        this.monto=monto;
        this.fecha=fecha;
    }
    public float getPagocliente(){
        return pagocliente;
    }
}
