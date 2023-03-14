package com.demo.state;

import com.demo.dto.*;

public class Review implements State{
    @Override
    public boolean startAnalysis(Ticket ticket, User user) {
        System.out.println(ticket.getDescription() + " moved from " + "review " + " to " + "Analysis , pull up your socks");
        return true;
    }

    @Override
    public boolean startReview(Ticket ticket, User user) {
        System.out.println("what are you doing??");
        return false;
    }

    @Override
    public boolean markDone(Ticket ticket, User user) {
        System.out.println(ticket.getDescription() + " moved from review" + " to " + "done, congratulations!!");
        return true;
    }
}
