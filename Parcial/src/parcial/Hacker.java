/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author USUARIO
 */
public class Hacker extends Personaje{
    public Hacker(){
        super("Hacker");
    }
    
    @Override
    public String habilidadEspecial(){
        return "Puede infiltrarse en sistemas y decifrar contraseñas";
    }
    
    @Override
    public boolean resolverProblema(String opcCorrecta, String opcUsuario){
        return opcUsuario.equalsIgnoreCase(opcCorrecta);
    }
}
