package com.aitech.cirta.form;

import org.apache.struts.action.ActionForm;

/**
 * Form Bean correpondant au formulaire de login.jsp
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class LoginForm extends ActionForm {
	 
    private static final long serialVersionUID = 1L;
    
    /**
     * Attributs (Varriable d'instance)
     */
    
    private String userName = null;
    private String password = null;
 
    /**
     * Getters et Setters
     */
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
     
    public String getPassword() {
        return password;
    }
     
    public void setPassword(String password) {
        this.password = password;
    } 
}
