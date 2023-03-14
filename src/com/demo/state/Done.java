package com.demo.state;

import com.demo.dto.*;

public class Done implements State{
    @Override
    public boolean startAnalysis(Ticket ticket, User user) {
        System.out.println(ticket.getDescription() + " moved from " + "done " + " to " + "Analysis , Whats happening??");
        return true;
    }

    @Override
    public boolean startReview(Ticket ticket, User user) {
        System.out.println(ticket.getDescription() + " moved from " + "done " + " to " + "review , Whats happening??");
        return true;
    }

    @Override
    public boolean markDone(Ticket ticket, User user) {
        System.out.println(ticket.getDescription() + " is already in done state");
        return false;
    }
}
