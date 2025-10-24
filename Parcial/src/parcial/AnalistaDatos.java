/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author USUARIO
 */
public class AnalistaDatos extends Personaje{
    public AnalistaDatos(){
        super("Analista de Datos");
    }
    
    @Override
    public String habilidadEspecial(){
        return "Puede aalizar atrones y tomar desiciones precisas basadas en datos";
    }
    
    @Override
    public boolean resolverProblema(String opcCorrecta, String opcUsuario){
        return opcUsuario.equalsIgnoreCase(opcCorrecta);
    }
}
