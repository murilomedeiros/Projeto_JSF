package br.com.murilo.projeto_jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author muril
 */
@SessionScoped
@ManagedBean
public class NameBean {
    
    private String name;
    private String lastName;
    
    private String message;
    
    public void sayHello(){
        message = "Olá " + name + " " + lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
