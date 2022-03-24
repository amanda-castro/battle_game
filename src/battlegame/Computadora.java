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
public class Computadora extends Personaje {
    
    private int saludTotal;
    public Computadora()
    {
        super();
        this.saludTotal = this.getSalud();
    }
    
    public void danhoCritico()
    {
        System.out.println("Mi circuitos no pueden soportar mas... Pero nunca me rendire");
    }
    
    @Override
    public void atacado(int _ataque)
    {
        int vidaRestante=this.getSalud();
        int danho = _ataque-this.getDefensa();
        if(danho>0)
        {
            vidaRestante-=danho;
            if(((double)this.getSalud()/(double)this.saludTotal)<=0.2) danhoCritico();
            System.out.println(this.getNombre() + " ha recibido un golpe... Ha perdido "+danho+" vida");
            
        }else{
            System.out.println(this.getNombre()+" se ha librado de un golpe... Se prepara para atacar");
        }
        if(vidaRestante<0) vidaRestante=0;
        this.setSalud(vidaRestante);
        System.out.println("La vida de "+ this.getNombre()+" es de" +this.getSalud());
    }
    
    public void recuperarVida()
    {
        Random r = new Random();
        
        int a = r.nextInt(100);
        if(((double)this.getSalud()/(double)this.saludTotal)<=0.5 && a<25){
            int salud = this.getSalud();
            salud +=10;
            this.setSalud(salud);
            System.out.println("Computadora: Jajaja... Si que eres debil");
            System.out.println("Computadora: Yo solo logre curarme"); 
        }
        //else{
            
        //}
    }

    @Override
    public void ganador() {
        System.out.println("Computadora: La era de los robots invadirá el mundo... victoria!");
    }
}
