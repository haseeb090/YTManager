/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hk.youtube;

/**
 *
 * @author Haseeb Khizar
 */
public class Channel {
    private String value;
    private Channel nextChannel;

    public Channel()
    {
        value = null;
        nextChannel = null;
    }				//end constructor
  
    public Channel(String value, Channel newChannel)
    {
        this.value = value;
        this.nextChannel = newChannel;
    }				//end constructor
    
    public Channel(String value){
        this.value = value;
        this.nextChannel = null;
    }
    
    public String getValue(){
        return this.value;
    }
    
    public void setValue(String value){
        this.value = value;
    }
    
    public Channel getNext(){
        return this.nextChannel;
    }
    
    public void setNext(Channel newChannel){
        this.nextChannel = newChannel;
    }
    
}
