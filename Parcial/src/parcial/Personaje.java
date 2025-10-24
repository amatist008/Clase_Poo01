/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author USUARIO
 */
public abstract class Personaje {
    protected String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract String habilidadEspecial();
    public abstract boolean resolverProblema(String opCorrecta, String opcUsuario);
}
