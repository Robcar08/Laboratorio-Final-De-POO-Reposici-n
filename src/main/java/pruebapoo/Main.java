package pruebapoo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Core metodos = new Core();
        Scanner scn = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("========================================================");
            System.out.println("========================================================");
            System.out.println("BIENVENIDO AL SISTEMA DE FILA");
            System.out.println("1. Registrar clientes");
            System.out.println("2. Registrar cliente VIP (tercera edad o embarazada)");
            System.out.println("3. Atender al siguiente cliente");
            System.out.println("4. Salir del programa");
            System.out.println("========================================================");
            opcion = Integer.parseInt(scn.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del cliente");
                    String nameReg = scn.nextLine();
                    metodos.agregarClienteNormal(nameReg);
                    System.out.println("cliente ingresado con exito");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del cliente vip");
                    String nombreVip = scn.nextLine();
                    metodos.agregarClienteVip(nombreVip);
                    System.out.println("cliente ingresado con exito");
                    break;
                case 3:
                    Boolean clienteAtendido = metodos.atenderCliente();
                    if (clienteAtendido != null)
                    {
                        System.out.println("Cliente atendido");
                    }else{
                        System.out.println("No hay clientes por atender");
                    }
                    break;
                case 4:
                    System.out.println("saliendo del programa");
                    break;
                default:
                    System.out.println("ERROR, Opcion no validad");
                    break;
            }

        }while (opcion != 4);
    }
}