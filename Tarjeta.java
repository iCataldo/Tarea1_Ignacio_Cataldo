import java.util.Date;
public class Tarjeta extends  Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(float monto,Date fecha) {
        super(monto,fecha);
    }
}
