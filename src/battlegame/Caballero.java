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
public class Caballero extends Personaje {
    public Caballero()
    {
        super("Caballero",150,20,25,0.75,"golpe divino");
    }
    
    public void bajarDefensa()
    {
        Random r = new Random();
        
        int a = r.nextInt(100);
        if(a<10&& this.getSalud()>120)
        {
            int defensa = super.getDefensa();
            defensa-=2;
            super.setDefensa(defensa);
            System.out.println("Rufian, me hicisteis dañar mi armadura... Pagareis por ello");
        }
        
    }
}
