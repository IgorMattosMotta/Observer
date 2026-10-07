package org.example;

import java.util.Observable;
import java.util.Observer;

public class Inscrito implements Observer {
    private String nome;
    private String ultimoVideoNotificado;

    public Inscrito(String nome){
        this.nome = nome;
    }

    public String getultimoVideoNotificado(){
        return this.getultimoVideoNotificado();
    }

    public void inscrever(CanalYoutube canalYoutube){
        canalYoutube.addObserver(this);
    }

    public void update(Observable turma, Object arg1){
        this.ultimoVideoNotificado = this.nome + ", está inscrito em " + turma.toString();
    }
}
