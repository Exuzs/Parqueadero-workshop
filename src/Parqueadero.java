public class Parqueadero extends ParqueaderoBase {
    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        super(filas, columnas, tarifaPorHora);
    }

    @Override
    public boolean parquearVehiculo(Vehiculo vehiculo, int fila, int columna) {
        if (fila < 0 || fila >= matrizParqueo.length || columna < 0 || columna >= matrizParqueo[0].length) {
            return false;
        }

        if (matrizParqueo[fila][columna] == null) {
            matrizParqueo[fila][columna] = vehiculo;
            return true;
        } else {
            return false;
        }
    }
}
