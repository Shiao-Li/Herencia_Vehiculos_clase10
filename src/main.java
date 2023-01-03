import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List listaVehiculos = new ArrayList();

        listaVehiculos.add(new Vehiculo("Mercesdes", "E", 55));
        listaVehiculos.add(new Autobus("Mercesdes", "M20", 100, 20));
        listaVehiculos.add(new Turismo("BMW", "525", 50, 4));
        listaVehiculos.add(new Turismo("Audi", "A4", 55, 4));
        listaVehiculos.add(new Autobus("Mercesdes", "M10", 120, 30));
        listaVehiculos.add(new Vehiculo("Audi", "A3", 30));
        imprimirLista(new ArrayList(listaVehiculos));

    }
    private static void imprimirLista(ArrayList lista){
        for (int i = 0; i < lista.size(); i++){
            Vehiculo v = (Vehiculo)lista.get(i);

            v.imprimirAtributos();
            System.out.println(" ");
        }
    }
}
