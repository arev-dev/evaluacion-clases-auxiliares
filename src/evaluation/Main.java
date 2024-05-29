package evaluation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        int id = 0;
        String nombre;
        String apellido;
        String email;
        String telefono;

        boolean stop = false;

        while (!stop)
        {
            System.out.println("Ingrese el Id del cliente");
            id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el Nombre del cliente");
            nombre = scanner.nextLine();

            System.out.println("Ingrese el Apellido del cliente");
            apellido = scanner.nextLine();

            System.out.println("Ingrese el Email del cliente");
            email = scanner.nextLine();

            System.out.println("Ingrese el Telefono del cliente");
            telefono = scanner.nextLine();

            Cliente c = new Cliente(id, nombre, apellido, email, telefono);
            clientes.add(c);

            System.out.println("---------------------------------");
            System.out.println("Cliente Agregado exitosamente");
            System.out.println("¿Desea continuar? S/N");
            stop = scanner.nextLine().equalsIgnoreCase("n");

        }

        Iterator<Cliente> it = clientes.iterator();

        System.out.println("---------------------------------");
        System.out.println("Los Clientes Registrados son: ");
        System.out.println("ID | CODIGO | NOMBRE | APELLIDO | EMAIL | TELEFONO");


        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
