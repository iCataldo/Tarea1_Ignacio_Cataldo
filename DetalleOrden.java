public class DetalleOrden {
    Articulo articulo;
    private int cantidad;
    public DetalleOrden(Articulo articulo, int cantidad){
        this.articulo = articulo;
        this.cantidad=cantidad;
    }
    public float calcPeso(){
        return articulo.getPeso()*cantidad;
    }
    public float calcIVA(){
        return articulo.getPrecio()*0.19f*cantidad;
    }
    public float calcPrecioSinIVA(){
        return articulo.getPrecio()*cantidad;
    }
    public float calcPrecio(){
        return calcPrecioSinIVA()-calcIVA();
    }
}
