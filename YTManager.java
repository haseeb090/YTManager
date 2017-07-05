/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hk.youtube;

import javax.swing.JOptionPane;
import java.util.Vector;

/**
 *
 * @author Haseeb Khizar
 */
public class YTManager {
    private Channel head;
    //default constructor
    public YTManager(){
        
    }
    //constructor that makes a list of random channels
    public YTManager(boolean a){
        if(a){
            this.addChannel("Steve Booker");
            this.addChannel("Sam Sheffer");
            this.addChannel("Ash Tailor");
            this.addChannel("Freakin Rad");
            this.addChannel("Dave Erasmus");
            this.addChannel("The Food Surgeon");
            this.addChannel("Kristen Sarah");
            this.addChannel("Nick Uhas");
            this.addChannel("Now You See It");
            this.addChannel("Canoopsy");
            this.addChannel("Dave2D");
        }
    }
    
    //appends channel at end of list
    public void addChannel(String value){
        //in case there is no first element in list
        if (head == null){
            head = new Channel(value);
            return;
        }
        Channel tempChannel = new Channel(value);
        Channel currentChannel = head;

        while(currentChannel.getNext() != null){ //loop to iterate to last channel in list
            currentChannel = currentChannel.getNext();
        }
        currentChannel.setNext(tempChannel);
    }
    //replacementName is the name of the channel to be replaced
    //newName is the new name of the channel that is to be set
    public void replaceChannel(String replacementName, String newName){
        if (head == null){
            JOptionPane.showMessageDialog(null, "No such channel");
            return;
        }
        Channel currentChannel = head;
        while(currentChannel.getNext() != null){
            if (currentChannel.getValue() == replacementName){ //checking if path of current channel matches path to be replaced
                currentChannel.setValue(newName);
                return;
            } else { //if no match then move onto next channel
                currentChannel = currentChannel.getNext();
            }
        }
        JOptionPane.showMessageDialog(null, "No such channel");
    }
    //dName is name/path of channel to be deleted from list
    public void deleteChannel(String dName){
        if (head == null){
            JOptionPane.showMessageDialog(null, "No such channel");
            return;
        }
        Channel currentChannel = head;
        while(currentChannel.getNext() != null){
            if (currentChannel.getNext().getValue() == dName){
                Channel temp = currentChannel.getNext();
                currentChannel.setNext(temp.getNext());
                temp = null;
                return;
            } else {
                currentChannel = currentChannel.getNext();
            }
        }
        JOptionPane.showMessageDialog(null, "No such channel");
        
    }
    //function returns vector string of all channels
    public Vector<String> printChannel (){
        Vector<String> Channels = new Vector();
        if (head == null){
            JOptionPane.showMessageDialog(null, "Populate Manager first");
            return null;
        }
        //iterate through list and print each channel name along the way
        Channel current = head;
        while (current.getNext() != null){
            Channels.add(current.getValue());
            current = current.getNext();
        }
        return Channels;
        
    }
}
