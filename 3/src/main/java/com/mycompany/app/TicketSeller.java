package com.mycompany.app;

import org.springframework.stereotype.Component;

/**
 * Created by PANNA on 01.02.2017.
 */
@Component
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
