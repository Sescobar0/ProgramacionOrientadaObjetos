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

    }

}    