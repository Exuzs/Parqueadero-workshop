public class Carro implements Vehiculo {
    private String placa;
    private String marca;
    private String modelo;

    public Carro(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }
}
