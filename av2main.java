import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        //adicionando clientes para testar
        Cliente cliente1 = new Cliente(1, "João", "Rua A, 123", "12345", "Brasil", "123.456.789-01",
                "AB123456", "joao@email.com", parseDate("01/01/1990"));
        Cliente cliente2 = new Cliente(2, "Maria", "Rua B, 456", "54321", "Brasil", "987.654.321-09",
                "CD987654", "maria@email.com", parseDate("15/03/1985"));

        sistema.incluirCliente(cliente1);
        sistema.incluirCliente(cliente2);

        //adicionando os quartos
        Quarto quarto1 = new Quarto(1, "Suite Master", 2, true, "Quarto brabo com banheiro");
        Quarto quarto2 = new Quarto(2, "Quarto Padrao", 1, false, "Quarto simplao sem banheiro");

        sistema.incluirQuarto(quarto1);
        sistema.incluirQuarto(quarto2);

        //adicionando as camas
        Cama cama1 = new Cama(1, "C001", false, "Solteiro", "Cama de solteiro próximo à janela");
        Cama cama2 = new Cama(2, "C002", true, "Beliche Superior", "Cama beliche superior");

        sistema.incluirCama(cama1);
        sistema.incluirCama(cama2);

        //adicionando as reservas
        Reserva reserva1 = new Reserva(1, 1, 1, 1, parseDate("10/12/2023"), parseDate("15/12/2023"));
        Reserva reserva2 = new Reserva(2, 2, 2, 2, parseDate("20/12/2023"), parseDate("25/12/2023"));

        sistema.incluirReserva(reserva1);
        sistema.incluirReserva(reserva2);

        //listando tudo
        System.out.println("Lista de Clientes:");
        sistema.listarClientes();

        System.out.println("\nLista de Quartos:");
        sistema.listarQuartos();

        System.out.println("\nLista de Camas:");
        sistema.listarCamas();

        System.out.println("\nLista de Reservas:");
        sistema.listarReservas();
    }

    //convertendo string para data
    private static Date parseDate(String dateString) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
