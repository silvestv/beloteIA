/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beloteia;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Victor
 */
public class Deck {
    
    ArrayList<Carte> deck = new ArrayList<Carte>(32);        

    
    public Deck(){
    
    initPaquet();
        
    }
 
    private String initPaquet(){
        
    String couleur[] = {"Coeur", "Trèfle", "Pique", "Carreau"};
    String rang[] = {"7","8","9","10","Valet","Reine","Roi","As"};
        
     int r = (int)(Math.random()*4);
     String atout = couleur[r];
    
        for(int i=0; i<4; i++){
            
            for(int j=0; j<8; j++){
                 
                if (couleur[i].equals(atout))
                    deck.add(new CarteAtout(rang[j], couleur[i]));
                
                else
                    deck.add(new CarteReguliere(rang[j], couleur[i]));
            }
        }
    Collections.shuffle(deck);
    return atout;
    }
    
    public ArrayList<Carte> getDeck(){
    	return deck;
    }
}


