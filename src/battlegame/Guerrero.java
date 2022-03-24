/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlegame;

import java.util.Random;

/**
 *
 * @author amand
 */
public class Guerrero extends Personaje {
    
    public Guerrero()
    {
        super("Guerrero",100,25,15,0.7,"puñetazo");
    }
    
    public void subirAtaque()
    {
        Random r = new Random();
        
        int a = r.nextInt(100);
        if(a>70&& this.getSalud()<=15)
        {
            int ataque = super.getAtaque();
            ataque+=2;
            super.setAtaque(ataque);
            System.out.println("Guerrero: Pobre iluso... Tus golpes solo aumentan mi fuerza");
        }
    }

    @Override
    public void ganador() {
        System.out.println("Guerrero: Lastima, parece que no eras tan fuerte!");
    }
}
