/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jraku
 */
public class Zakaznik {
    
    protected String jmeno;
    
    protected String prijmeni;
    
    protected int telefon;
    
    protected int vek;
    
    private Scanner scanner = new Scanner(System.in, "Windows-1250");
    private Databaze databaze;
    /**
     *
     * @param jmeno
     * @param prijmeni
     * @param telefon
     * @param vek
     */
    public Zakaznik (String jmeno, String prijmeni, int telefon, int vek) {
        this.jmeno=jmeno;
        this.prijmeni=prijmeni;
        this.telefon=telefon;
        this.vek=vek;
        
        
        
    }

    Zakaznik() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Přidá záznam do databáze ze vstupu
     */
    public void pridejZaznam() {
        
        System.out.println("Přidat nového pojistného: ");
        String text = scanner.nextLine();
        databaze.pridejZaznam(text);
    }
    
     public void vyhledejZaznamy() {
       
        ArrayList<Zaznam> zaznamy = databaze.najdiZaznamy();
           if (zaznamy.size() > 0) {     
            System.out.println("Vypsat všechny pojištěné: ");
            for (Zaznam zaznam : zaznamy) {
                System.out.println(zaznam);
            }
        } else {
            System.out.println("Nebyly nalezeny žádné záznamy.");
        }
     }      
     public void vymazZaznamy() {
        System.out.println("Budou vymazány záznamy.");
        databaze.vymazZaznamy(zaznamy);
    }       
     
 
     
    public void vypisUvodniObrazovku() {
        System.out.println();
        System.out.println();
        System.out.println("___________________________");
        System.out.println("Evidence pojistenych");
        System.out.println("___________________________");
}
     @Override
    public String toString() {
       return jmeno;
    }
}
    

