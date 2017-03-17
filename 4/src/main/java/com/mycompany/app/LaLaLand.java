package com.mycompany.app;

import org.springframework.stereotype.Component;

/**
 * Created by PANNA on 01.02.2017.
 */
@Component("LaLaLand")
public class LaLaLand implements Video {
    public LaLaLand(){};
    public void play() {
        System.out.println("Movie starring Rayan Gosling and Emma Stone");
    }
}
