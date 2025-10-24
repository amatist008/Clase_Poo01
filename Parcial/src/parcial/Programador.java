/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author USUARIO
 */
public class Programador extends Personaje{
    public Programador(){
        super("Programador");
    }
    
    @Override
    public String habilidadEspecial(){
        return "Puedes crear codigo eficiente y resolver errores logicos.";
    }
    
    @Override
    public boolean resolverProblema(String opcCorrecta, String opcUsuario){
        return opcUsuario.equalsIgnoreCase(opcCorrecta);
    }
}
