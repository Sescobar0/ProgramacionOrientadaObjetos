
public class Main {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto producto1 = new Producto("Producto A", 101, 50, 19.99);
        Producto producto2 = new Producto("Producto B", 102, 30, 29.99);
        Producto producto3 = new Producto("Producto C", 103, 20, 39.99);

        // Mostrar el valor del inventario de cada producto antes de modificar el stock
        System.out.println("Valor del inventario de " + producto1.getNombre() + ": " + producto1.calcularValorInventario());
        System.out.println("Valor del inventario de " + producto2.getNombre() + ": " + producto2.calcularValorInventario());
        System.out.println("Valor del inventario de " + producto3.getNombre() + ": " + producto3.calcularValorInventario());

        // Modificar stock de productos
        producto1.añadirStock(10);
        producto2.reducirStock(5);

        // Mostrar el valor del inventario después de modificar el stock
        System.out.println("Valor del inventario de " + producto1.getNombre() + " después de añadir stock: " + producto1.calcularValorInventario());
        System.out.println("Valor del inventario de " + producto2.getNombre() + " después de reducir stock: " + producto2.calcularValorInventario());

        // Calcular y mostrar el valor total del inventario de todos los productos
        double valorTotalInventario = Producto.calcularValorTotalInventario();
        System.out.println("Valor total del inventario de todos los productos: " + valorTotalInventario);
    }
}
