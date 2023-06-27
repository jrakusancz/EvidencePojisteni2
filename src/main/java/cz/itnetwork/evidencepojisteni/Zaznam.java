/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

/**
 *
 * @author jraku
 */
public class Zaznam {
    
    private String text;
    
    public Zaznam (String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }
     public void setText(String text) {
         this.text = text;
     }
     
     @Override
     public String toString() {
         return text;
     }
}
