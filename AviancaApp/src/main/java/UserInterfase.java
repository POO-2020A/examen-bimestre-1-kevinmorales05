
import java.util.Scanner;
import java.util.Arrays;

public class UserInterfase {

    Scanner reader = new Scanner(System.in);

    public UserInterfase() {

        System.out.println("Ingrese la cantidad de Filas:");
        int filas = Integer.valueOf(reader.nextLine());
        System.out.println("Ingrese la cantidad de Columnas:");
        int columnas = Integer.valueOf(reader.nextLine());
        Plane mapaAsientos = new Plane(filas, columnas); //se crea el objeto Plane

        System.out.println("Este es el mapa del avión");
        System.out.println(mapaAsientos.toString());

        int option = 2;
        while (option > 0 && option <= 3) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Ingresar pasajero");
            System.out.println("2. Consultar asiento");
            System.out.println("3. Consultar pasajero");
            //System.out.println("");
            System.out.println("Ingrese la opción: ");
            option = Integer.valueOf(reader.nextLine());
            System.out.println("");
            switch (option) {

                case 1: //ingresar pasajero
                    System.out.println("Ingresar un pasajero:");
                    System.out.println("Ingresar el nombre del pasajero:");
                    String nombrePasajero = reader.nextLine();
                    System.out.println("Ingresar el apellido del pasajero:");
                    String apellidoPasajero = reader.nextLine();
                    System.out.println("Ingrese la fila del asiento:");
                    int filaPasajero = Integer.valueOf(reader.nextLine());
                    System.out.println("Ingrese la columna del asiento:");
                    int columnaPasajero = Integer.valueOf(reader.nextLine());

                    Passager pasajero = new Passager(nombrePasajero, apellidoPasajero);
                    Seat asiento = new Seat(filaPasajero, columnaPasajero);

                    System.out.println("Pasajero Ingresado!");

                    break;
                case 2:// consultar disponibilidad de asiento
                    System.out.println("Consulta del asiento:");
                    System.out.println("Ingrese la fila del asiento:");
                    int filaConsulta = Integer.valueOf(reader.nextLine());
                    System.out.println("Ingrese la columna del asiento:");
                    int columnaConsulta = Integer.valueOf(reader.nextLine());

                    //seat.isFree();
                    //seat.toString();
                    break;
                case 3: // consultar pasajero
                    System.out.println("Consulta del pasajero:");
                    System.out.println("Ingresar el nombre y el apellido:");
                    String nombreCompleto = reader.nextLine();
                    String[] separado = nombreCompleto.split(" ");
                    //Pasager.equals(nombreCompleto[0], nombreCompleto[1])

                    break;

            }

        }

    }

}
