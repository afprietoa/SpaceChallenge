/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import controller.Controller;

import view.WindowFrame;

/**
 *
 * @author afprietoa
 */
public class App {
        public static void main(String args[]) {
        WindowFrame view= new WindowFrame();
        Controller con=new Controller(view);
        view.setVisible(true);
    }
}
