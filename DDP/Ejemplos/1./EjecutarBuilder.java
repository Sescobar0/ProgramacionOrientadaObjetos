public class EjecutarBuilder{

    public static void main(String[] args) {
        
        Converter objC1 = new ASCIIConverter();
        Converter objC2 = new PostScriptConverter();
        Converter objC3 = new PDFConverter();

        Reader objReader1 = new Reader("LINEA", objC1);
        Reader objReader2 = new Reader("LINEA", objC3);
        Reader objReader3 = new Reader("PARRAFO", objC2);
        Reader objReader4 = new Reader("TABLA", objC3);

        objReader1.parseInput();  // Linea con ASII
        objReader2.parseInput();  // Liena con PDF
        objReader3.parseInput();  // Parrafo con PostScrip
        objReader4.parseInput();  // Tabla con PDF

    }
}