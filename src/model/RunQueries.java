/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author afprietoa
 */
public class RunQueries {
    Connexion connectedObj = new Connexion();
    Connection conObj;
    PreparedStatement ps;
   public ResultSet rs;
    public String trial="";
    public String query ="";
    
    public String filterDB(String type, String use, String country){
        conObj = connectedObj.getConnection();
        
        
                
        if(!type.equals("all") && use.equals("all") && country.equals("all")){
            trial="You have selected the type option";
            System.out.println(trial);
            query = "SELECT * FROM spacecrafts WHERE type=?";

        }else if(type.equals("all") && !use.equals("all") && country.equals("all")){
            trial="You have selected the use option";
            System.out.println(trial);
            query = "SELECT * FROM spacecrafts WHERE application=?";
            
        }else if(type.equals("all") && use.equals("all") && !country.equals("all")){
            trial="You have selected the country option";
            System.out.println(trial);
            query = "SELECT * FROM spacecrafts WHERE country=?";
            
        }else if(!type.equals("all") && !use.equals("all") && country.equals("all")){
            trial="You have selected the type and the use option";
            System.out.println(trial);
            query = "SELECT * FROM spacecrafts WHERE type=? AND application=?";
            
        }else if(type.equals("all") && !use.equals("all") && !country.equals("all")){
            trial="You have selected the use and the country option";
            System.out.println(trial);
            query = "SELECT * FROM spacecrafts WHERE application=? AND country=?";
            
        }else if(!type.equals("all") && use.equals("all") && !country.equals("all")){
            trial="You have selected the type and the country option";
            System.out.println(trial);
            query = "SELECT * FROM spacecrafts WHERE type=? AND country=?";
            
        }else{
            trial="You have selected the all option";
            System.out.println(trial);
            query = "SELECT * FROM spacecrafts WHERE type=? AND application=? AND country=?";
            
        }
        

        return query;
    }
}
