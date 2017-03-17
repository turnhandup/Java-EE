package com.mycompany.app;

import org.springframework.stereotype.Component;

/**
 * Created by PANNA on 01.02.2017.
 */
@Component
public class Joy implements Video {
    public Joy(){
    }
    public void play() {
        System.out.println("Awful movie with Jennifer Lawrence");
    }
}
