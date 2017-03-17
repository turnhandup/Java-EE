package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by PANNA on 01.02.2017.
 */
@Component("TicketSeller")
public class TicketSeller implements Worker {
    private int soldTickets=100;

    public TicketSeller(){};
    public TicketSeller(int soldTickets){
        this.soldTickets=soldTickets;
    }


    public void work() {
        System.out.println("Today"+" we sold "+ soldTickets +" tickets");
    }
}
