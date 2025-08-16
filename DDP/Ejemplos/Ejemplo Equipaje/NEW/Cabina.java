package NEW;

public class Cabina implements Equipaje {

    private static final double PESO_DEFAULT = 10.0;
    private static final double TAMANIO_DEFAULT = 4.5;
    private static final double PRECIO_BASE_DEFAULT = 1000.0;
    private static final int TIEMPO = 2;

    private double peso;
    private double tamanio;
    private double precioBase;

    public Cabina(double peso, double tamanio){
        this.peso = peso;
        this.tamanio = tamanio;
        this.precioBase = PRECIO_BASE_DEFAULT;
    }

    public Cabina(double precioBase){
        this.peso = PESO_DEFAULT;
        this.tamanio = TAMANIO_DEFAULT;
        this.precioBase = precioBase;
    }

    public Cabina(){
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
        return precioBase + (peso * tamanio * TIEMPO);  
    }
}
