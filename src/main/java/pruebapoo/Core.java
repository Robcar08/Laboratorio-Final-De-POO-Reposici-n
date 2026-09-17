package pruebapoo;

import java.util.LinkedList;

public class Core {

    LinkedList<String> colaAtencion = new LinkedList<>();

    public boolean agregarClienteNormal(String nombre){
        colaAtencion.add(nombre);
        return true;
    }
    public boolean agregarClienteVip(String nombre){
        colaAtencion.addFirst(nombre);
        return true;
    }
    public boolean atenderCliente (){

        if (colaAtencion.peekFirst() == null){
            System.out.println("no hay mas clientes en la fila");
        }
        else {
            System.out.println("Atendiendo a: " + colaAtencion.pollFirst());
        }
        return false;
    }

}
