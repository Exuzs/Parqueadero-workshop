abstract class ParqueaderoBase {
    protected Vehiculo[][] matrizParqueo;
    protected double tarifaPorHora;

    public ParqueaderoBase(int filas, int columnas, double tarifaPorHora) {
        matrizParqueo = new Vehiculo[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;
    }

    public abstract boolean parquearVehiculo(Vehiculo vehiculo, int fila, int columna);

    public double cobrarPorTiempo(int horas) {
        return horas * tarifaPorHora;
    }

    public void mostrarEstadoParqueadero() {
        for (Vehiculo[] fila : matrizParqueo) {
            for (Vehiculo vehiculo : fila) {
                if (vehiculo == null) {
                    System.out.print("  ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
