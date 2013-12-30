/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharebathe.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jinglu
 */
@ManagedBean(name = "testManagedBean")
@SessionScoped
public class NewJSFManagedBean {

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    private String loginName;
    
    public NewJSFManagedBean() {
        
        
    }

    public String getLoginName() {
        
        return loginName;
    }

    public void setLoginName(String loginName) {
        
        this.loginName = loginName;
    }
    
    
    
    
    
}
