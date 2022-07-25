/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author afprietoa
 */
public class SpaceShip {
    int id;
    String name;
    String type;
    double thrust;
    double weight;
    String use;
    String country;
    String date;

    public SpaceShip() {
    }

    public SpaceShip(int id, String name, String type, double thrust, double weight, String use, String country, String date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.thrust = thrust;
        this.weight = weight;
        this.use = use;
        this.country = country;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
        
    public void launch(){
        
    }
    
    public void land(){
    
    }


    
    @Override
    public String toString(){
            return "SpaceShip \n"
			   +"Id : "+id+"\n"
			   +"Name : "+name+"\n"
			   +"Type : "+type+"\n"	
			   +"Thrust : "+thrust+"\n"
			   +"Weight : "+weight+"\n"
			   +"Use : "+use+"\n"
			   +"Country : "+country+"\n"	
			   +"Date : "+date+"\n";
    };
}
