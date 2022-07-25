/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author afprietoa
 */
public class RunQueries {
    public String trial="";
    public String filterDB(String type, String use, String country){
        if(!type.equals("all") && use.equals("all") && country.equals("all")){
            trial="You have selected the type option";
        }else if(type.equals("all") && !use.equals("all") && country.equals("all")){
            trial="You have selected the use option";
        }else if(type.equals("all") && use.equals("all") && !country.equals("all")){
            trial="You have selected the country option";
        }else if(!type.equals("all") && !use.equals("all") && country.equals("all")){
            trial="You have selected the type and the use option";
        }else if(type.equals("all") && !use.equals("all") && !country.equals("all")){
            trial="You have selected the use and the country option";
        }else if(!type.equals("all") && use.equals("all") && !country.equals("all")){
            trial="You have selected the type and the country option";
        }else{
            trial="You have selected the all option";
        }
        return trial;
    }
}
