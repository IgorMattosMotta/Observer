package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscritoTest {

    @Test
    void deveNotificarUmInscrito() {
        CanalYoutube canal = new CanalYoutube(new Video());
        Inscrito inscrito = new Inscrito("Inscrito 1");
        inscrito.inscrever(canal);
        canal.publicarVideo();
        assertEquals("Inscrito 1, está inscrito em Canal do youtube{Vídeo novo!}", inscrito.getultimoVideoNotificado());
    }

    @Test
    void deveNotificarInscritos() {
        CanalYoutube canal = new CanalYoutube(new Video());
        Inscrito inscrito1 = new Inscrito("Inscrito 1");
        Inscrito inscrito2 = new Inscrito("Inscrito 2");
        inscrito1.inscrever(canal);
        inscrito2.inscrever(canal);
        canal.publicarVideo();
        assertEquals("Inscrito 1, está inscrito em Canal do youtube{Vídeo novo!}", inscrito1.getultimoVideoNotificado());
        assertEquals("Inscrito 2, está inscrito em Canal do youtube{Vídeo novo!}", inscrito2.getultimoVideoNotificado());
    }

    @Test
    void naoDeveNotificarInscrito() {
        CanalYoutube canal = new CanalYoutube(new Video());
        Inscrito inscrito = new Inscrito("Inscrito 1");
        canal.publicarVideo();
        assertNull(inscrito.getultimoVideoNotificado());
    }

    @Test
    void deveNotificarApenasInscritoDoCanalA() {
        CanalYoutube canalA = new CanalYoutube(new Video());
        CanalYoutube canalB = new CanalYoutube(new Video());
        Inscrito inscrito1 = new Inscrito("Inscrito 1");
        Inscrito inscrito2 = new Inscrito("Inscrito 2");
        inscrito1.inscrever(canalA);
        inscrito2.inscrever(canalB);
        canalA.publicarVideo();
        assertEquals("Inscrito 1, está inscrito em Canal do youtube{Vídeo novo!}", inscrito1.getultimoVideoNotificado());
        assertNull(inscrito2.getultimoVideoNotificado());
    }
}
