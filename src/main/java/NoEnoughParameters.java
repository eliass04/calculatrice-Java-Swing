/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
public class NoEnoughParameters extends Exception{
    NoEnoughParameters(String message){
        super(message);
    }
    public String toString(String message) {
        return message;
    }
    
}
