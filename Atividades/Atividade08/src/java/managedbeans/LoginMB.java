/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author brnhe
 */
@ManagedBean
@RequestScoped
public class LoginMB {

    private String matricula;
    private String senha;
    
    public LoginMB() {
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    FacesContext context = FacesContext.getCurrentInstance();
    FacesMessage mensagem = FacesMessage(FacesMessage.SEVERITY_ERROR, "Login inválido!");
    
    context.addMessage(null, mensagem);
}
