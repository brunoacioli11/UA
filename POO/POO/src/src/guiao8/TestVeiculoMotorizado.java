package guiao8;

public class TestVeiculoMotorizado {
    public static void main(String[] args) {
        Motociclo moto = new Motociclo("JPF-3334", "Honda", "Bis", 84, TipoMotociclo.ESTRADA);
        Motociclo moto2 = new Motociclo("JPF-3334", "Honda", "Bis", 84, TipoMotociclo.ESTRADA);
        System.out.println(moto);
        Automovel auto = new Automovel("ABC-1234", "BMW", "M5", 550, 4, 85);
        Automovel auto2 = new Automovel("ABC-1234", "BMW", "M5", 550, 4, 85);
        System.out.println(auto.equals(auto2));
        System.out.println(moto.equals(moto2));
    }
}
