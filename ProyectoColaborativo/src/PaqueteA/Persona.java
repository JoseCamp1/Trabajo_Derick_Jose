/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteA;

/**
 *
 * @author JoaCa
 */
public class Persona {

    //atributos
    private int id;
    private String nombre;

    //constructores
    public Persona() {
        id = 0;
        nombre = "";
    }

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // getters y setters
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodos

    @Override
    public String toString() {
        return nombre;
    }
}
