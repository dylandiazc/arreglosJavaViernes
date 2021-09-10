/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import paquete2.Heroe;

/**
 *
 * @author 57305
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //como se utiliza una clase
        
        //creando objeto
        
        //que es un objeto? una variable
        Heroe heroe=new Heroe();
        Enemigo enemigo=new Enemigo();
        
        //accediendo a atributos
        enemigo.nombre="BORRÉ";
        heroe.nombre="LUCHO DÍAZ";
        
        //aaceidendo a un atributo privado
        heroe.setEdad(-5);
        
        //imprimo valores de los aributos
        System.out.println(heroe.nombre);
        System.out.println(heroe.getEdad());
        
    }
    
}
