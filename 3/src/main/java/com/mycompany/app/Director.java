package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
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
@Component("director")
public class Director implements Worker {
    public Director(){};

    @Autowired
    private Worker myWorker;

    @Autowired
    private Collection<Video> videos;

    @Autowired
    public void setVideos(Collection<Video> videos){
        this.videos=videos;
    }
    public Collection<Video> getVideos(){ return videos;}
    public void work() {
        System.out.println("Director can do ANYTHING");
        System.out.println("He helps to show movies:");
        if(!videos.isEmpty()) {
            for (Video video : videos) {
                video.play();
            }
        }
        else{
            System.out.println("Collection is empty");
        }
        System.out.println("He can also sell tickets");
        myWorker.work();
    }


}
