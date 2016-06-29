package de.cachaca.learn.jsf2.expressionLanguage;

import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class User {
     
    private BigDecimal age;
 
    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

}