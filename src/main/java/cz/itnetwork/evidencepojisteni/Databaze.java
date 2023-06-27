/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;


import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author jraku
 */
public class Databaze {
    
    private ArrayList<Zaznam> zaznamy;
    
    public Databaze() {
        zaznamy = new ArrayList<>();
    }
    
    public void pridejZaznam(String text) {
        zaznamy.add (new Zaznam(text));
    }    
    
     public ArrayList<Zaznam> najdiZaznamy() {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam zaznam : zaznamy) {
            if nalezene.add(zaznamy);
        }
     
    return nalezene;
    }
     
      public void vymazZaznamy() {
        ArrayList<Zaznam> nalezeno = najdiZaznamy ();
        for (Zaznam zaznam : nalezeno) {
            zaznamy.remove(zaznamy);
}
      }