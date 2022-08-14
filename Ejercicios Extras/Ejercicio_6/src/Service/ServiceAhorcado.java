package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

public class ServiceAhorcado {

    Scanner leer = new Scanner(System.in);
    Ahorcado ahorcado = new Ahorcado();

    public void crearJuego() {

        System.out.println("Ingrese la palabra a buscar: ");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de intentos: ");
        ahorcado.setJugadasMax(leer.nextInt());
        ahorcado.setCantLetraEncontrada(0);
        String nuevoArray[] = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            nuevoArray[i] = palabra.substring(i, i + 1);

        }
        ahorcado.setVector(nuevoArray);

    }

    public void longitud() {

        System.out.println("La longitud de la palabra es --> " + ahorcado.getVector().length);

    }

    public boolean buscarLetra(String letra) {

        int encontradas = 0;

        for (int i = 0; i < ahorcado.getVector().length; i++) {

            if (letra.equals(ahorcado.getVector()[i])) {

                encontradas++;
            }
        }

        if (encontradas > 0) {

            ahorcado.setCantLetraEncontrada(encontradas);
            System.out.println("\nLa letra pertenece a la palabra");

        } else {
            System.out.println("\nLa letra no pertenece a la palabra");
        }

        return encontradas > 0;

    }

    public boolean encontradas(String letra) {

        if (buscarLetra(letra)) {

            return true;

        } else {

            intentos();
            return false;
        }

    }

    public void intentos() {

        int oport = ahorcado.getJugadasMax() - 1;
        ahorcado.setJugadasMax(oport);
    }

    public void juego() {

        crearJuego();
        longitud();

        do {

            System.out.println("-----------------------------------------");
            System.out.print("Ingrese una letra ---> ");
            String letra = leer.next();

            if (encontradas(letra)) {

                msjCantidadLetra();

            } else {
                msjCantidadLetra();
            }

        } while (ahorcado.getJugadasMax() > 0 && ahorcado.getVector().length != ahorcado.getCantLetraEncontrada());

        if (ahorcado.getJugadasMax() == 0) {

            System.out.println("--------------------------------------");
            System.out.println("Lo sentimos, no hay mas oportunidad");
            System.out.println("--------------------------------------");

        } else if (ahorcado.getCantLetraEncontrada() == ahorcado.getVector().length) {

            System.out.println("---------------------------------------");
            System.out.println("FELICIDADES HAS ENCONTRADO LA PALABRA");
            System.out.println("----------------------------------------");
        }

    }

    public void msjCantidadLetra() {

        System.out.println(
                "\nNumero de letras --> (encontradas, faltantes) : ( " + ahorcado.getCantLetraEncontrada() + " , "
                + (ahorcado.getVector().length - ahorcado.getCantLetraEncontrada()) + ")");

        System.out.println("\nEl numero de oportunidades restantes --> " + ahorcado.getJugadasMax());
    }

}
