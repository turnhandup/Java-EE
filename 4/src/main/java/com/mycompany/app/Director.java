package com.mycompany.app;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by PANNA on 01.02.2017.
 */
@Aspect
@Component("director")
public class Director implements Worker {
    @Pointcut("execution(* com.mycompany.app.TicketSeller.work(..))")
    public void seller(){};

    public Director(){};


    @Autowired
    private Collection<Video> videos;

    @Autowired
    public void setVideos(Collection<Video> videos){
        this.videos=videos;
    }
    public Collection<Video> getVideos(){ return videos;}

    @AfterReturning("seller()")
    public void sayGoodbye(){
        System.out.println("Bye Bye");
    }

    public void nameMovies(){
        System.out.println("Movies on air:");
        if(!videos.isEmpty()) {
            for (Video video : videos) {
                video.play();
            }
        }
        else{
            System.out.println("Collection is empty");
        }
    }

    public void work() {
        System.out.println("Director can do ANYTHING");
        System.out.println("He helps to show movies:");
        nameMovies();
        System.out.println("He can also sell tickets.");
    }
}
