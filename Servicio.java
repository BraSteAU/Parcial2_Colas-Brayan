import java.util.Scanner;

public class Servicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turnos turnos = new Turnos();
        System.out.println("Banco");
        System.out.println("1)LLegada del cliente\n2)Atender cliente\n3)Visualizar Cola\n4)Siguiente cliente\n5)Mostrar turnos\n6)Salir");
        int opcion=sc.nextInt();
        while (opcion!=6) {
            switch (opcion) {
                case 1:
                    turnos.llegadaCliente();
                    break;
                case 2:
                    turnos.atenderCliente();
                    break;
                case 3:
                    turnos.visualizarCola();
                    break;
                case 4:
                    turnos.siguienteCliente();
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
