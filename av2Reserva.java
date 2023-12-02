import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {
    private int id;
    private int idQuarto;
    private int idCama;
    private int idCliente;
    private Date dataEntrada;
    private Date dataSaida;

    //construtor
    public Reserva(int id, int idQuarto, int idCama, int idCliente, Date dataEntrada, Date dataSaida) {
        this.id = id;
        this.idQuarto = idQuarto;
        this.idCama = idCama;
        this.idCliente = idCliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public int getId() {
        return id;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getIdCama() {
        return idCama;
    }

    public void setIdCama(int idCama) {
        this.idCama = idCama;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    //método toString para imprimir informações da reserva
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return "Reserva{" +
                "id=" + id +
                ", idQuarto=" + idQuarto +
                ", idCama=" + idCama +
                ", idCliente=" + idCliente +
                ", dataEntrada=" + sdf.format(dataEntrada) +
                ", dataSaida=" + sdf.format(dataSaida) +
                '}';
    }
}
