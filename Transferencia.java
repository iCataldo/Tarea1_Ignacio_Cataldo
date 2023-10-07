import java.util.Date;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    private Date fecha;
    private float monto;
    public Transferencia(float monto, Date fecha) {
        super(monto, fecha);
    }

}
