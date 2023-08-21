public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5, 10, 10000.0);

        Vehiculo carro1 = new Carro("ABC123", "Toyota", "Corolla");
        Vehiculo carro2 = new Carro("DEF456", "Honda", "Civic");

        System.out.println(parqueadero.parquearVehiculo(carro1, 2, 3));
        System.out.println(parqueadero.parquearVehiculo(carro2, 0, 5));
        System.out.println(parqueadero.parquearVehiculo(carro1, 2, 3));

        System.out.println("Costo por tiempo del carro 1: " + parqueadero.cobrarPorTiempo(3));
        System.out.println("Costo por tiempo del carro 2: " + parqueadero.cobrarPorTiempo(5));

        parqueadero.mostrarEstadoParqueadero();
    }
}