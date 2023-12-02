import java.util.List;
import java.util.ArrayList;

public class Sistema {
    private List<Cliente> clientes;
    private List<Quarto> quartos;
    private List<Cama> camas;
    private List<Reserva> reservas;

    public Sistema() {
        this.clientes = new ArrayList<>();
        this.quartos = new ArrayList<>();
        this.camas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    //métodos clientes
    public void incluirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void alterarCliente(int id, Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.set(i, cliente);
                break;
            }
        }
    }

    public void excluirCliente(int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    //métodos quartos
    public void incluirQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void alterarQuarto(int id, Quarto quarto) {
        for (int i = 0; i < quartos.size(); i++) {
            if (quartos.get(i).getId() == id) {
                quartos.set(i, quarto);
                break;
            }
        }
    }

    public void excluirQuarto(int id) {
        quartos.removeIf(quarto -> quarto.getId() == id);
    }

    public void listarQuartos() {
        for (Quarto quarto : quartos) {
            System.out.println(quarto.toString());
        }
    }

    //métodos cama
    public void incluirCama(Cama cama) {
        camas.add(cama);
    }

    public void alterarCama(int id, Cama cama) {
        for (int i = 0; i < camas.size(); i++) {
            if (camas.get(i).getId() == id) {
                camas.set(i, cama);
                break;
            }
        }
    }

    public void excluirCama(int id) {
        camas.removeIf(cama -> cama.getId() == id);
    }

    public void listarCamas() {
        for (Cama cama : camas) {
            System.out.println(cama.toString());
        }
    }

    //métodos reserva
    public void incluirReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void alterarReserva(int id, Reserva reserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getId() == id) {
                reservas.set(i, reserva);
                break;
            }
        }
    }

    public void excluirReserva(int id) {
        reservas.removeIf(reserva -> reserva.getId() == id);
    }

    public void listarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva.toString());
        }
    }
}
