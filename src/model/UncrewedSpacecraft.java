/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author afprietoa
 */
public class UncrewedSpacecraft extends SpaceShip {
    
    String data;

    public UncrewedSpacecraft(String data) {
        this.data = data;
    }

    public UncrewedSpacecraft(String data, int id, String name, String type, double thrust, double weight, String use, String country, String date) {
        super(id, name, type, thrust, weight, use, country, date);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void collect(){
        
    }
    
    @Override
    public String toString() {
        return super.toString()
			   +"Data : "+data+"\n";        
    }
    
}