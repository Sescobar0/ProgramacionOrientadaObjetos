    //Atributos de la clase
    private int Numero_Cuenta;
    private double Saldo;
    private string Titular;

    //Metodo Constructor de la clase 
    public CuentaBancaria(int Numero_Cuenta, double Saldo, String Titular) {
        this.Numero_Cuenta = Numero_Cuenta;
        this.Saldo = Saldo;
        this.Titular = Titular;
    

    //Metodos de la clase
    public String Depositar(double Cantidad){
        return Saldo += Cantidad;
    }

    public String Retirar(double Cantidad){
        return Saldo -= Cantidad;
    }
    
    public void Consultar_Saldo(){
        System.out.println("La Cuenta N° " + Numero_Cuenta + " tiene un saldo de: " + Saldo);
    }

   