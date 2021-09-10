/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author 57305
 */
public class Heroe {
    
    //Datos = Atributos = variables
    public String nombre;
    private int edad;
    
    //metodos= acciones = funciones

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>1 && edad<120){
        this.edad = edad;
        
        }else{
            System.out.println("edad invalidad");
        }
    }
    

    public Heroe() {
        
        
    }
    
    
}
