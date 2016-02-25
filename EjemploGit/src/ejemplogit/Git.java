/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogit;

/**
 *
 * @author Miriam
 */
public class Git {
    private String nombreAdministrador;
    private String nombreColaborador;

    public Git() {
    }

    
    public Git(String nombreAdministrador, String nombreColaborador) {
        this.nombreAdministrador = nombreAdministrador;
        this.nombreColaborador = nombreColaborador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getNombreColaborador() {
        return nombreColaborador;
    }

    public void setNombreColaborador(String nombreColaborador) {
        this.nombreColaborador = nombreColaborador;
    }
    
    
}
