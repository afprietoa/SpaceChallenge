/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author afprietoa
 */
public class CrewedSpacecraft extends SpaceShip {
    
    int noPassenger;

    public CrewedSpacecraft(int noPassenger) {
        this.noPassenger = noPassenger;
    }

    public CrewedSpacecraft(int noPassenger, int id, String name, String type, double thrust, double weight, String use, String country, String date) {
        super(id, name, type, thrust, weight, use, country, date);
        this.noPassenger = noPassenger;
    }

    public int getNoPassenger() {
        return noPassenger;
    }

    public void setNoPassenger(int noPassenger) {
        this.noPassenger = noPassenger;
    }
    
    public void airlift(){
        
    }

    @Override
    public String toString() {
                return super.toString()
			   +"Passenger number : "+noPassenger+"\n";
    }
    
}
