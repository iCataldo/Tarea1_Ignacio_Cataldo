import java.util.Date;
public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    public DocTributario(String numero, String rut, Date fecha) {
        this.fecha = fecha;
        this.numero = numero;
        this.rut = rut;
    }
}