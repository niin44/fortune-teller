/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author niin
 */
public class Translator {
    public String numberToVerb(int n){
        String s = new String();
        switch (n) {
            case 0: s = "springa";
                break;
            case 1: s = "ljuga";
                break;
            case 2: s = "flyga";
                break;
            case 3: s = "se";
                break;
            case 4: s = "vara";
                break;
            case 5: s = "äta";
                break;
            case 6: s = "mäta";
                break;
            case 7: s = "gå";
                break;
            case 8: s = "röra";
                break;
            case 9: s = "resa";
                break;                
        }
        return s;
    }
    public String numberToNoun(int n){
        String s = new String();
        switch (n) {
            case 0: s = "en lönehöjning";
                break;
            case 1: s = "en lönesänkning";
                break;
            case 2: s = "en fotboja";
                break;
            case 3: s = "en katt";
                break;
            case 4: s = "en hund";
                break;
            case 5: s = "ett hus";
                break;
            case 6: s = "ett barn";
                break;
            case 7: s = "ett elstängsel";
                break;
            case 8: s = "en dator";
                break;
            case 9: s = "ett golv";
                break;                
        }
        return s;
    }
    public String numberToAdjective(int n){
        String s = new String();
        switch (n) {
            case 0: s = "stor";
                break;
            case 1: s = "liten";
                break;
            case 2: s = "stark";
                break;
            case 3: s = "svag";
                break;
            case 4: s = "mjuk";
                break;
            case 5: s = "hård";
                break;
            case 6: s = "snabb";
                break;
            case 7: s = "vacker";
                break;
            case 8: s = "ljus";
                break;
            case 9: s = "mörk";
                break;                
        }
        return s;
    }
    
}
