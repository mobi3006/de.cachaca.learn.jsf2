package de.cachaca.learn.jsf2.focus;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class FocusView {
     
    private String username;
    private String email;
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
     
    public void calculateUsername(String seed) {
        if (seed == null)
            username = "null";
        username = seed;
    }
    
    public void save() {
        FacesContext.getCurrentInstance()
        	.addMessage(
        			null, 
        			new FacesMessage(
        					FacesMessage.SEVERITY_INFO, 
        					"Success", 
        					"User Saved"));
        username = null;
        email = null;
    }
    
    public static void main(String[] args) {
        System.out.println(Locale.getDefault(Locale.Category.FORMAT));
        MessageFormat mf = new MessageFormat("{0, number, #.#} - {0, number, #.0} - {0, number, 0.0}");
        
        System.out.println("hallo pierre");
        System.out.println("hallo pierre");

        Object[] objs = {new Double(163.1415)};
        System.out.println(mf.format(objs));        

        BigDecimal[] bd = {new BigDecimal(0)};
        System.out.println(mf.format(bd));        
    }
}