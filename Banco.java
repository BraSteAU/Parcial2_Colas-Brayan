import java.time.LocalTime;

public class Banco{

    private int Id;
    private String Nombre;
    private String tipoServicio;
    private LocalTime horaLLegada;
    private boolean atendido;
    public Banco() {
    }
    public Banco(int id, String nombre, String tipoServicio) {
        Id = id;
        Nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.horaLLegada = LocalTime.now();
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getTipoServicio() {
        return tipoServicio;
    }
    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    public LocalTime getHoraLLegada() {
        return horaLLegada;
    }
    public void setHoraLLegada(LocalTime horaLLegada) {
        this.horaLLegada = horaLLegada;
    }
    public boolean isAtendido() {
        return atendido;
    }
    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    @Override
    public String toString() {
    return "Turno: " + Id +
           " | Nombre: " + Nombre +
           " | Servicio: " + tipoServicio +
           " | Hora: " + horaLLegada +
           " | Atendido: " + atendido;
}
}