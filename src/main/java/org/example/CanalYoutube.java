package org.example;

import java.util.Observable;

public class CanalYoutube extends Observable {
    private Video video;

    public CanalYoutube(Video video){
        this.video = video;
    }

    public void publicarVideo(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString(){
        return "Canal do youtube{" + video + "}";
    }
}
