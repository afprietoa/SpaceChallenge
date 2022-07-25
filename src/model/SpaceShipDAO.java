/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author afprietoa
 */
public class SpaceShipDAO {
    Connexion connectedObj = new Connexion();
    Connection conObj;
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListItems(){
        List<SpaceShip> spaceships;
        spaceships = new ArrayList<>();
        String sql = "SELECT * FROM spacecrafts";
       try{
           conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               SpaceShip s =new SpaceShip();
               s.setId(rs.getInt(1));
               s.setName(rs.getString(2));
               s.setType(rs.getString(3));
               s.setThrust(rs.getDouble(4));
               s.setWeight(rs.getDouble(5));
               s.setUse(rs.getString(6));
               s.setCountry(rs.getString(7));
               s.setDate(rs.getString(8));
               spaceships.add(s);
               System.out.println(rs.getInt(1)+ " "
                                 +rs.getString(2)+ " "
                                 +rs.getString(3)+ " "
                                 +rs.getDouble(4)+ " "
                                 +rs.getDouble(5)+ " "
                                 +rs.getString(6)+ " "
                                 +rs.getString(7)+ " "
                                 +rs.getString(8));
           }
       }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
       }
       
       
       return spaceships;
        
    }
    
    public List ListItems(String sql, String query){
        List<SpaceShip> spaceships;
        spaceships = new ArrayList<>();
       try{
           conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           ps.setString(1, query);
           System.out.println( sql+" "+query );
           rs = ps.executeQuery();
           while(rs.next()){
               SpaceShip s =new SpaceShip();
               s.setId(rs.getInt(1));
               s.setName(rs.getString(2));
               s.setType(rs.getString(3));
               s.setThrust(rs.getDouble(4));
               s.setWeight(rs.getDouble(5));
               s.setUse(rs.getString(6));
               s.setCountry(rs.getString(7));
               s.setDate(rs.getString(8));
               spaceships.add(s);
               System.out.println(rs.getInt(1)+ " "
                                 +rs.getString(2)+ " "
                                 +rs.getString(3)+ " "
                                 +rs.getDouble(4)+ " "
                                 +rs.getDouble(5)+ " "
                                 +rs.getString(6)+ " "
                                 +rs.getString(7)+ " "
                                 +rs.getString(8));
           }
       }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
       }
       
       
       return spaceships;
        
    }
    
    public List ListItems(String sql, String query1, String query2){
        List<SpaceShip> spaceships;
        spaceships = new ArrayList<>();
       try{
           conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           ps.setString(1, query1);
           ps.setString(2, query2);
           System.out.println( sql+" "+query1+" "+query2 );
           rs = ps.executeQuery();
           while(rs.next()){
               SpaceShip s =new SpaceShip();
               s.setId(rs.getInt(1));
               s.setName(rs.getString(2));
               s.setType(rs.getString(3));
               s.setThrust(rs.getDouble(4));
               s.setWeight(rs.getDouble(5));
               s.setUse(rs.getString(6));
               s.setCountry(rs.getString(7));
               s.setDate(rs.getString(8));
               spaceships.add(s);
               System.out.println(rs.getInt(1)+ " "
                                 +rs.getString(2)+ " "
                                 +rs.getString(3)+ " "
                                 +rs.getDouble(4)+ " "
                                 +rs.getDouble(5)+ " "
                                 +rs.getString(6)+ " "
                                 +rs.getString(7)+ " "
                                 +rs.getString(8));
           }
       }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
       }
       
       
       return spaceships;
        
    }
 
    public List ListItems(String sql, String query1, String query2, String query3){
        List<SpaceShip> spaceships;
        spaceships = new ArrayList<>();
       try{
           conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           ps.setString(1, query1);
           ps.setString(2, query2);
           ps.setString(3, query3);
           System.out.println( sql+" "+query1+" "+query2+" "+query3 );
           rs = ps.executeQuery();
           while(rs.next()){
               SpaceShip s =new SpaceShip();
               s.setId(rs.getInt(1));
               s.setName(rs.getString(2));
               s.setType(rs.getString(3));
               s.setThrust(rs.getDouble(4));
               s.setWeight(rs.getDouble(5));
               s.setUse(rs.getString(6));
               s.setCountry(rs.getString(7));
               s.setDate(rs.getString(8));
               spaceships.add(s);
               System.out.println(rs.getInt(1)+ " "
                                 +rs.getString(2)+ " "
                                 +rs.getString(3)+ " "
                                 +rs.getDouble(4)+ " "
                                 +rs.getDouble(5)+ " "
                                 +rs.getString(6)+ " "
                                 +rs.getString(7)+ " "
                                 +rs.getString(8));
           }
       }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
       }
       
       
       return spaceships;
        
    }
 
    public int addItem(SpaceShip ss){
      String sql = "INSERT INTO spacecrafts(name,type,thrust,weight,application,country,date) values(?,?,?,?,?,?,?) ";
      try{
          conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           ps.setString(1,ss.getName());
           ps.setString(2,ss.getType());
           ps.setDouble(3,ss.getThrust());
           ps.setDouble(4,ss.getWeight());
           ps.setString(5,ss.getUse());
           ps.setString(6,ss.getCountry());
           ps.setString(7,ss.getDate());
           
           ps.executeUpdate();
      }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
      }
      return 1;
    };
    
    public int updateItem(SpaceShip ss){
      String sql = "UPDATE spacecrafts set name=?, type=?, thrust=?, weight=?, application=?, country=?, date=? WHERE id_spacecraft=?";
      try{
          conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           ps.setString(1,ss.getName());
           ps.setString(2,ss.getType());
           ps.setDouble(3,ss.getThrust());
           ps.setDouble(4,ss.getWeight());
           ps.setString(5,ss.getUse());
           ps.setString(6,ss.getCountry());
           ps.setString(7,ss.getDate());
           ps.setInt(8,ss.getId());
           
           ps.executeUpdate();          
      }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
      }
      return 1;  
    };
    
    public void deleteItem(int id){
        String sql = "DELETE FROM spacecrafts WHERE id_spacecraft="+id;
        try{
           conObj = connectedObj.getConnection();
           ps = conObj.prepareStatement(sql);
           ps.executeUpdate();
        }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
        }
    }
    
}
