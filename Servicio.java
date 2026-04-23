import java.util.Scanner;

public class Servicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turnos turnos = new Turnos();
        System.out.println("Banco");
        System.out.println("1)LLegada del cliente\n2)Atender cliente\n3)Visualizar Cola\n4)Siguiente cliente\n5)Mostrar turnos\n6)Salir");
        int opcion=sc.nextInt();
        sc.nextLine();
        while (opcion!=6) {
            switch (opcion) {
                case 1:
                    System.out.println("Nombre del cliente:");
                    String nombre = sc.nextLine();
                    System.out.println("1) Retiro\n2) Consignacion\n3) Asesoria");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    Banco nuevo = turnos.llegadaCliente(nombre, tipo);
                    System.out.println("Cliente nuevo: "+nuevo);
                    break;
                case 2:
                    Banco atendido  =turnos.atenderCliente();
                    if(atendido!=null){
                        System.out.println("Se esta atendiendo a: "+atendido.getNombre());
                    }else{
                        System.out.println("No hay clientes");
                    }
                    
                    break;
                case 3:
                    turnos.visualizarCola();
                    break;
                case 4:
                    Banco siguiente = turnos.siguienteCliente();
                     if(siguiente != null){
                        System.out.println("Siguiente cliente: "+siguiente);
                    }else{
                        System.out.println("No hay mas clientes");
                    }
                    break;
                case 5:
                    turnos.mostrarTurnos();
                    break;
            
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("1)LLegada del cliente\n2)Atender cliente\n3)Visualizar Cola\n4)Siguiente cliente\n5)Mostrar turnos\n6)Salir");
            opcion=sc.nextInt();
        }
        sc.close();
    }
    
}
