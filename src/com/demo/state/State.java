package com.demo.state;

import com.demo.dto.*;
import com.demo.services.*;

public interface State {
    boolean startAnalysis(Ticket ticket, User user);
    boolean startReview(Ticket ticket, User user);
    boolean markDone(Ticket ticket, User user);
}
