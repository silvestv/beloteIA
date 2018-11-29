/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beloteia;

import java.util.*;

/**
 *
 * @author Victor
 */
public abstract class Carte {
    protected String rangCarte;
    protected String couleurCarte;
    protected int valeur;
    
    public Carte(String rangCarte, String couleurCarte){
        this.rangCarte = rangCarte;
        this.couleurCarte = couleurCarte;
        this.valeur = initValeur();
    }
    
  
    
    public String getRangCarte(){
        return this.rangCarte;
    }
    
    public String getCouleurCarte(){
        return this.couleurCarte;
    }
    
    public int getValeur(){
        return valeur;
    }
   
    private int initValeur(){  
       HashMap<String, Integer> H = new HashMap<String, Integer>();
        
        H.put("As", 11);
        H.put("10", 10);
        H.put("Roi", 4);
        H.put("Reine", 3);
        H.put("Valet", 2);
        H.put("9", 0);
        H.put("8", 0);
        H.put("7", 0);
        
        return H.get(rangCarte);
        
    }



}

