package NEW;

public class Bodega implements Equipaje {

    private static final double PESO_DEFAULT = 10.0;
    private static final double TAMANIO_DEFAULT = 4.5;
    private static final double PRECIO_BASE_DEFAULT = 1000.0;
    private static final double CAPACIDAD = 8.0;

    private double peso;
    private double tamanio;
    private double precioBase;

    public Bodega(double peso, double tamanio){
        this.peso = peso;
        this.tamanio = tamanio;
        this.precioBase = PRECIO_BASE_DEFAULT;
    }

    public Bodega(double precioBase){
        this.peso = PESO_DEFAULT;
        this.tamanio = TAMANIO_DEFAULT;
        this.precioBase = precioBase;
    }

    public Bodega(){
        this.peso = PESO_DEFAULT;
        this.tamanio = TAMANIO_DEFAULT;
        this.precioBase = PRECIO_BASE_DEFAULT;
    }

    @Override
    public double getPeso(){
        return peso;
    }

    @Override
    public double getTamanio(){
        return tamanio;
    }

    @Override
    public double getPrecioBase(){
        return precioBase;
    }

    @Override
    public double calcularPrecio(){
        return precioBase + (peso * tamanio * CAPACIDAD);  
    }
}
