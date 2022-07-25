/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author afprietoa
 */
public class LoadListBoxs {
        Connexion connectedObj = new Connexion();
        Connection conObj;
        Statement s;
        SpaceShip ss= new SpaceShip();
       public ResultSet rs;

    public ResultSet runQueryTypes(){
        String sql = "SELECT DISTINCTROW type FROM spacecrafts";
        
        try{
           conObj = connectedObj.getConnection();
           s = conObj.createStatement();
           
           
               return rs= s.executeQuery(sql);
               
           
           
        }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
        }
        return null;
    }
        public ResultSet runQueryUses(){
        String sql = "SELECT DISTINCTROW application FROM spacecrafts";
        
        try{
           conObj = connectedObj.getConnection();
           s = conObj.createStatement();
           
           
               return rs= s.executeQuery(sql);
               
           
           
        }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
        }
        return null;
    }
        public ResultSet runQueryCountries(){
        String sql = "SELECT DISTINCTROW country FROM spacecrafts";
        
        try{
           conObj = connectedObj.getConnection();
           s = conObj.createStatement();
           
           
               return rs= s.executeQuery(sql);
               
           
           
        }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
        }
        return null;
    }
    
}
