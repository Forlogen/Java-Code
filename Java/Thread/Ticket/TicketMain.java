package Thread.Ticket;

public class TicketMain {
    public static void main(String[] args) {
    Ticket ticket = new Ticket();
    System.out.println(ticket);  // Thread.Ticket.Ticket@1b6d3586

    Thread t1 = new Thread(ticket);
    Thread t2 = new Thread(ticket);
    Thread t3 = new Thread(ticket);

    t1.start();
    t2.start();
    t3.start();
    /*
    Thread-0 --  10'th ticket
    Thread-2 --  10'th ticket
    Thread-1 --  10'th ticket
    Thread-2 --  8'th ticket
    Thread-0 --  9'th ticket
    Thread-2 --  6'th ticket
    Thread-1 --  7'th ticket
    Thread-2 --  4'th ticket
    Thread-0 --  5'th ticket
    Thread-2 --  2'th ticket
    Thread-1 --  3'th ticket
    Thread-0 --  1'th ticket
     */
    }
}
