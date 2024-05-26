public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Create instatncias pra cada vehiculo
        Auto auto = new Auto("Honda", "Agera RS", 2015, 20000, "Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        //Mostrar info
        System.out.println("Informacion del HyperCar");
        auto.mostrarInfo();

        System.out.println("Información del Volvo")
        camion.mostrarInfo();
    }
}
