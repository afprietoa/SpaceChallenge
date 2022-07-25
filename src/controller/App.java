/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import controller.Controller;

import view.WindowFrame;

/**
 *<h1>Spatial-Station<h1>
 * Spatial-Station is a program that allows to create, edit and delete spaceships
 * from inventory, it also allows to filter spaceships according to its type, 
 * its application or its country.
 * @author afprietoa
 * @version 1.1
 * @since 2022
 */

/**
 *<h1>App<h1>
 * App is a class that has the program entry point.
 */
public class App {
        public static void main(String args[]) {
        WindowFrame view= new WindowFrame();
        Controller con=new Controller(view);
        view.setVisible(true);
    }
}
