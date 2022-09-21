package Servicios_Ex04;

import Entidades_Ex04.NIF;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class NIFService {

    Scanner leer = new Scanner(System.in);

    public NIF crearNif() {

        System.out.println("Ingresar su DNI:");
        int DNI = leer.nextInt();
        int Resto = DNI % 23;
        String[] nif = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        String letra = nif[Resto];
        return new NIF(DNI, letra);
    }

    public void mostrar(NIF n1) {
        System.out.println("El NIF es: " + n1.getDNI() + " - " + n1.getLetra());
    }
}
