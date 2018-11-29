/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beloteia;

/**
 *
 * @author Victor
 */
public class CarteAtout extends Carte{
    
    
    
    public CarteAtout(String rangCarte, String couleurCarte) {
        super(rangCarte, couleurCarte);
        
        if(super.rangCarte.equals("9")){
            valeur = 14;
        }else if(super.rangCarte.equals("Valet")){
            valeur = 20;
        }
             
    }

    
    
    
}
