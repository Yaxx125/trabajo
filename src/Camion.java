public class Camion extends VehiculoCarga{
    private int numejes;
    private String mantenimiento;

    //constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numejes, String mantenimiento;) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numejes = numejes;
        this.mantenimiento = mantenimiento;
    }
    //getters y setters
    public int getNumejes() {
        return numejes;
    }
    public void setNumejes(int numejes) {
        this.numejes = numejes;
    }

    public String setmantenimiento () {
        return mantenimiento;
    }
    public void getmantenimiento (String ) {
        this.mantenimiento = mantenimiento;
    }
    //Sobreescribir
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de ejes: " +numejes);
        System.out.println("Se esta cambiando el motor V8 por un V10: "+mantenimiento);
    }



}
