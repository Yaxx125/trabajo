public class Auto extends VehiculoPasajeros {
    public static Scanner scanner = new Scanner(System.in);
    private String tipoCombustible;
    private String mantenimiento;
    public int CostoKilometro = 1000;

    public Auto(String marca, String modelo, int año, int kilometraje, String tipoCombustible, String mantenimiento) {
        super(marca, modelo, año, kilometraje);
        this.tipoCombustible = tipoCombustible;
        this.mantenimiento = mantenimiento;
    }

    public static int CalcularCostoMantenimiento (int CostoKilometro, int KilometrosRecorridos, int CostoMantenimiento ){
        try{
            System.out.println("Desea realizar el mantenimento? SI / NO");
            String opc = scanner.nextLine;
            Boolean continuar = true;
            if (continuar) {
                System.out.println("Cuanto fueron los kilometros recorridos");
                int KilometrosRecorridos = scanner.nextInt();
                int CostoMantenimiento = CostoKilometro * KilometrosRecorridos;
                System.out.println("El costo total de mantenimento es: "+CostoMantenimiento);
            }
            else{
                System.out.println("Ok, tenga un muy buen día :)");
                continuar = false;
            }
        }
        catch (Exception e ){
            System.out.println("Ocrrio un error, no seas vulgar");
        }

    }


    //Getter Setter
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getmantenimiento() {
        return mantenimiento;
    }
    public void setmantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento; 
    }

    //Sobreescribir metodo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("cambio de aceite: "+mantenimiento);
        System.out.println("El costo del mantenimiento es de "+CostoMantenimiento);
    }

}
