/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.evidencepojisteni;

import java.util.Scanner;

/**
 *
 * @author jraku
 */
public class EvidencePojisteni {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        Zakaznik zakaznik = new Zakaznik();
        String volba = ""; 
        
        
        // hlavní cyklus
        while (!volba.equals("4")) {
            zakaznik.vypisUvodniObrazovku();
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojistného");
            System.out.println("2 - Vypsat všechny pojistné");
            System.out.println("3 - Vyhledat pojistného");
            System.out.println("4 - Konec");
            volba=scanner.nextLine();
            System.out.println();
            //reakce na volbu
                switch (volba) {
                    case "1":
                        zakaznik.pridejZaznam();
                    case "2":
                        zakaznik.vyhledejZaznamy();
                    case "3":
                        zakaznik.vymazZaznamy();
                    case "4":
                       
                        break;
                    default:
                        System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                        break;
                }
           }

    }
}
