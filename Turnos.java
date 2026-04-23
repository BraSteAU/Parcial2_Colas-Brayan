import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Turnos {
    
    Queue<Banco> turnosBanco = new LinkedList<>();
    Queue<Banco> turnosAtendidos = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    private int contador = 1;

    public Banco llegadaCliente(String nombre,int opcion){
        Banco b = new Banco();
        b.setNombre(nombre);
        b.setHoraLLegada(LocalTime.now());
        b.setId(contador++);
            switch (opcion) {
                case 1:
                    b.setTipoServicio("Retiro");
                    break;
                case 2:
                    b.setTipoServicio("Consignacion");
                    break;
                case 3:
                    b.setTipoServicio("Asesoria");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            turnosBanco.offer(b);
        return b;
    }

    public Banco atenderCliente(){
        if (turnosBanco.isEmpty()) {
            return null;
        }
        Banco clienteAtendido = turnosBanco.poll();
        clienteAtendido.setAtendido(true);
        turnosAtendidos.offer(clienteAtendido);
        return clienteAtendido;

    }

    public void visualizarCola(){
           if (turnosBanco.isEmpty()) {
            System.out.println("No hay personas en la cola");
            return;
        }
        for (Banco o : turnosBanco) {
            System.out.println(o);
        }
        System.out.println();

    }

    public Banco siguienteCliente(){
        Banco siguiente = turnosBanco.peek();
        return siguiente;
    }

    public void mostrarTurnos(){
        System.out.println("Turnos Pendientes ");
        if(turnosBanco.isEmpty()){
            System.out.println("NO hay turnos pendientes");
        }
        else{
            for(Banco pendientes : turnosBanco){
                System.out.println(pendientes);
            }
        }
        System.out.println("Turnos Atendidos");
        if (turnosAtendidos.isEmpty()) {    
            System.out.println("No hay turnos atendidos");
        }else{
            for(Banco atendido : turnosAtendidos){
                System.out.println(atendido);
            }
        }

    }

}
