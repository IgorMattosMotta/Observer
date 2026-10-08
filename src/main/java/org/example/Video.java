package org.example;

public class Video {
    public String video(){
        return "Vídeo novo!";
    }

    @Override
    public String toString(){
        return video();
    }
}
