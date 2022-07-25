/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author afprietoa
 */
public class LaunchVechicle extends SpaceShip {
    
    private int load;

    public LaunchVechicle(int load) {
        this.load = load;
    }

    public LaunchVechicle(int load, int id, String name, String type, double thrust, double weight, String use, String country, String date) {
        super(id, name, type, thrust, weight, use, country, date);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public void load(){
        
    }
    
    public void unload(){
        
    }
    
    @Override
    public String toString() {
        return super.toString()
			   +"Load : "+load+"\n";

    }
    
}
