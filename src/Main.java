import com.demo.dto.*;
import com.demo.enums.*;
import com.demo.services.*;

public class Main {
    public static void main(String[] args) {

        User u1= new User("a");
        Ticket ticket= new Ticket("first ticket" , u1);

        TicketService ticketService= new TicketService();
//        ticketService.changeTicketState(ticket, TicketState.REVIEW, u1);
//        ticketService.changeTicketState(ticket, TicketState.ANALYSIS, u1);

        ticketService.startAnalysis(ticket, u1);
        ticketService.startReview(ticket, u1);

    }
}