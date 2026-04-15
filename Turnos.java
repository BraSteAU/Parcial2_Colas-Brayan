import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Turnos {
    
    Queue<Banco> turnosBanco = new LinkedList<>();
    Queue<Banco> turnosAtendidos = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    public void llegadaCliente(){
        int contador = 1;
        boolean opcion = true;
        while (opcion) {
            Banco b = new Banco();
            System.out.println("Nombre del cliente: ");
            b.setNombre(sc.next());
            System.out.println("Seleccione el tipo de servicio: ");
            System.out.println("1)Retiro\n2)Consignacion\n3)Asesoria )");
            int opt = sc.nextInt();
            b.setHoraLLegada(LocalTime.now());
            switch (opt) {
                case 1:
                    b.setTipoServicio("Retiro");
                    break;
                case 2:
                    b.setTipoServicio("Consignacion");
                    break;
                case 3:
                    b.setTipoServicio("Asesoria");
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            b.setId(contador++);
            turnosBanco.offer(b);
            System.out.println("Llego otro cliente ? 1)Si o 2)No");
            opt = sc.nextInt();
            if (opt == 2) {
                opcion = false;
            }
            sc.nextLine();
        }
    }

    public void atenderCliente(){
        if (turnosBanco.isEmpty()) {
            System.out.println("No hay clientes en espera.");
            return;
        }
        Banco clienteAtendido = turnosBanco.poll();
        clienteAtendido.setAtendido(true);
        turnosAtendidos.offer(clienteAtendido);

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

    public void siguienteCliente(){
        Banco siguiente = turnosBanco.peek();
        if(siguiente != null){
            System.out.println("Siguiente cliente: "+siguiente);
        }else{
            System.out.println("No hay mas clientes");
        }
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
