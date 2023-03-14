package com.demo.state;

import com.demo.dto.*;

public class Analysis implements State{
    @Override
    public boolean startAnalysis(Ticket ticket, User user) {
        System.out.println("what are you doing??");
        return false;
    }

    @Override
    public boolean startReview(Ticket ticket, User user) {
        System.out.println(ticket.getDescription() + " moved from " + "analysis" + " to " + "review");
        return true;
    }

    @Override
    public boolean markDone(Ticket ticket, User user) {
        System.out.println(ticket.getDescription() + " moved from analysis" + " to " + "done, congratulations!!");
        return true;
    }
}
