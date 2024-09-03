
import java.util.ArrayList;
import java.util.List;

public class Producto {
    // Atributos de la clase
    private String nombre;
    private int codigo;
    private int stock;
    private double precio;

    // Lista estática para almacenar todos los productos
    private static List<Producto> productos = new ArrayList<>();

    // Método constructor de la clase
    public Producto(String nombre, int codigo, int stock, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
    }

    // Métodos de la clase
    public void añadirStock(int cantidad) {
        stock += cantidad;
    }

    public void reducirStock(double cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("No hay productos en el Stock");
        }
    }

     // Método para calcular el valor del inventario de este producto
     public double calcularValorInventario() {
        return stock * precio;
    }

    // Método estático para calcular el valor total del inventario de todos los productos
    public static double calcularValorTotalInventario() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.calcularValorInventario();
        }
        return total;
    }

}
