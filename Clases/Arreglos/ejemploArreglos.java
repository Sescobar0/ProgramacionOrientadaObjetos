import java.util.*;

public class ejemploArreglos {
    public static void main(String[] args) {

        //Opcion 1 - creacion del arreglo de enteros
        int [] a = {6, 20, 31, 16};
        for (int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    
        //Opcion 2 - Creacion del arreglo con valores random
        int [] b = new int [4];
        Random r = new Random();
        for(int i = 0; i < b.length; i++){
            b[i] = r.nextInt(20) + 1;
            System.out.println("b[" + i + "] = " + b[i]);
        }

        //---------------Arreglo de Objetos-----------------

        Producto objP1 = new Producto(1, "Pizza", 19990.0);
        Producto objP2 = new Producto(2, "HotDog", 15000.0);
        Producto objP3 = new Producto(3, "Hamburguesa", 25000.0);

        System.out.println(objP1);
        System.out.println(objP2.getNombre());
        objP2.setNombre("HotDog Mediano");
        System.out.println(objP2);

        //Se crea el arreglo de objetos (producto);
        Producto [] p = new Producto[3];
        //se guardan los objetos creados en el arreglo de tipo Producto
        p[0] = objP1;
        p[1] = objP2;
        p[2] = objP3;

        //calcular el precio total de los productos
        double precioTotal = 0.0;
        for(int i = 0; i < p.length; i++){
            precioTotal += p[i].getPrecio(); 
            System.out.printf("%d\t %20s\t %10.2f\t \n", p[i].getId(), p[i].getNombre(), p[i].getPrecio());
        } 
        
        System.out.println("La factura esta por: " + precioTotal);


    }

}    