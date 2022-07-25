/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.SpaceShipDAO;
import model.SpaceShip;
import view.WindowFrame;
import java.util.List;
import javax.swing.JOptionPane;

import model.LoadListBoxs;
import model.RunQueries;

/**
 *
 * @author afprietoa
 */
public class Controller implements ActionListener{
    LoadListBoxs lbsTypes = new LoadListBoxs();
    LoadListBoxs lbsUses = new LoadListBoxs();
    LoadListBoxs lbsCountries = new LoadListBoxs();
    RunQueries qs = new RunQueries();
    SpaceShipDAO dao= new SpaceShipDAO();
    SpaceShip ss= new SpaceShip();
    WindowFrame view= new WindowFrame();
    DefaultTableModel model=new DefaultTableModel();
    
    public Controller(WindowFrame v){
        this.view=v;
        this.view.btnList.addActionListener(this);
        this.view.btnSave.addActionListener(this);
        this.view.btnUpdate.addActionListener(this);
        this.view.btnOk.addActionListener(this);
        this.view.btnDelete.addActionListener(this);
        this.view.btnFilter.addActionListener(this);
        listItems(view.table);
        windowOpened();
    }
    
    public void windowOpened(){
        lbsTypes.runQueryTypes();
        lbsUses.runQueryUses();
        lbsCountries.runQueryCountries();
        
        view.listBoxType.removeAllItems();
        view.listBoxUse.removeAllItems();
        view.listBoxCountry.removeAllItems();
        
        view.listBoxType.addItem("all");
        view.listBoxUse.addItem("all");
        view.listBoxCountry.addItem("all");
        try{
            while(lbsTypes.rs.next()){
                
                view.listBoxType.addItem(lbsTypes.rs.getString(1));
            }
            while(lbsUses.rs.next()){
                
                view.listBoxUse.addItem(lbsUses.rs.getString(1));
            }
            while(lbsCountries.rs.next()){
                
                view.listBoxCountry.addItem(lbsCountries.rs.getString(1));
            }
        }catch(Exception e){
           System.out.println("DID NOT CONNECT!");
           e.printStackTrace();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        
        if(e.getSource() == view.btnList){
            cleanTable();
            listItems(view.table);
        }
        if(e.getSource() == view.btnSave){
            addItem();
            cleanTable();
            listItems(view.table);
        }
        if(e.getSource() == view.btnUpdate){
            int row = view.table.getSelectedRow();
            if(row == -1){
                JOptionPane.showMessageDialog(view, "Should select a row!");
            }
            else{
                int id  =   Integer.parseInt((String)view.table.getValueAt(row, 0).toString());
                String name = (String)view.table.getValueAt(row, 1);
                String type= (String)view.table.getValueAt(row,2);
                double thrust = Double.parseDouble((String)view.table.getValueAt(row,3).toString());
                double weight = Double.parseDouble((String)view.table.getValueAt(row,4).toString());
                String use = (String)view.table.getValueAt(row,5);
                String country = (String)view.table.getValueAt(row,6);
                String date = (String)view.table.getValueAt(row,7);
                
                view.txtId.setText(""+id);
                view.txtName.setText(name);
                view.txtType.setText(type);
                view.txtThrust.setText(""+thrust);
                view.txtWeight.setText(""+weight);
                view.txtUse.setText(use);
                view.txtCountry.setText(country);
                view.txtDate.setText(date);
            }
        }
        if(e.getSource() == view.btnOk){
            updateItem();
            cleanTable();
            listItems(view.table);
        }
        if(e.getSource() == view.btnDelete){
           deleteItem();
           cleanTable();
           listItems(view.table);
        }
        if(e.getSource() == view.btnFilter){
        String type = (String)view.listBoxType.getSelectedItem().toString();
        String use = (String)view.listBoxUse.getSelectedItem().toString();
        String country = (String)view.listBoxCountry.getSelectedItem().toString();
        String trial="";
        
        
        if(!type.equals("all") && use.equals("all") && country.equals("all")){
            trial="You have selected the type option";
            System.out.println(trial);
            cleanTable();
            listItems(view.table, qs.filterDB(type, use, country), type);
            
        }else if(type.equals("all") && !use.equals("all") && country.equals("all")){
            trial="You have selected the use option";
            System.out.println(trial);
            cleanTable();
            listItems(view.table, qs.filterDB(type, use, country), use);
                        
        }else if(type.equals("all") && use.equals("all") && !country.equals("all")){
            trial="You have selected the country option";
            System.out.println(trial);
            cleanTable();
            listItems(view.table, qs.filterDB(type, use, country), country);
            
        }else if(!type.equals("all") && !use.equals("all") && country.equals("all")){
            trial="You have selected the type and the use option";
            System.out.println(trial);
            cleanTable();
            listItems(view.table, qs.filterDB(type, use, country), type, use);       
            
        }else if(type.equals("all") && !use.equals("all") && !country.equals("all")){
            trial="You have selected the use and the country option";
            System.out.println(trial);
            cleanTable();
            listItems(view.table, qs.filterDB(type, use, country), use, country);  
            
        }else if(!type.equals("all") && use.equals("all") && !country.equals("all")){
            trial="You have selected the type and the country option";
            System.out.println(trial);
            cleanTable();
            listItems(view.table, qs.filterDB(type, use, country), type, country);  
            
        }else{
            trial="You have selected the all option";
            System.out.println(trial);
            cleanTable();
            listItems(view.table, qs.filterDB(type, use, country), type, use, country);  
            
        }
        

        }
    }
    
    public void cleanTable(){
        for(int i=0; i< view.table.getRowCount();i++){
            model.removeRow(i);
            i=i-1;
        }
    }
    
    public void deleteItem(){
            int row = view.table.getSelectedRow();
            int id = Integer.parseInt((String)view.table.getValueAt(row,0).toString());
            if(row == -1){
                JOptionPane.showMessageDialog(view, "Should select a row!");
            }
            else{
                dao.deleteItem(id);
                JOptionPane.showMessageDialog(view, "The spaceship was deleted successfully!");
            }
    }
    
    public void updateItem(){
        int id = Integer.parseInt(view.txtId.getText());
        String name = view.txtName.getText();
        String type= view.txtType.getText();
        double thrust = Double.parseDouble(view.txtThrust.getText());
        double weight = Double.parseDouble(view.txtThrust.getText());
        String use = view.txtUse.getText();
        String country = view.txtCountry.getText();
        String date = view.txtDate.getText();
        
        ss.setId(id);
        ss.setName(name);
        ss.setType(type);
        ss.setThrust(thrust);
        ss.setWeight(weight);
        ss.setUse(use);
        ss.setCountry(country);
        ss.setDate(date);
        
        int sentinel = dao.updateItem(ss);
        if(sentinel == 1){
            JOptionPane.showMessageDialog(view, "The spaceship was updated successfully!");
        }else{
            JOptionPane.showMessageDialog(view, "Error!");
        }
    }
    
    public void addItem(){
        String name = view.txtName.getText();
        String type= view.txtType.getText();
        double thrust = Double.parseDouble(view.txtThrust.getText());
        double weight = Double.parseDouble(view.txtThrust.getText());
        String use = view.txtUse.getText();
        String country = view.txtCountry.getText();
        String date = view.txtDate.getText();
        
        ss.setName(name);
        ss.setType(type);
        ss.setThrust(thrust);
        ss.setWeight(weight);
        ss.setUse(use);
        ss.setCountry(country);
        ss.setDate(date);
        
        int sentinel=dao.addItem(ss);
        
        if(sentinel == 1){
           JOptionPane.showMessageDialog(view,"The spaceship was added successfully!");
        }else{
           JOptionPane.showMessageDialog(view,"Error!");
        }
    }
    
    public void listItems(JTable table){
        
        model=(DefaultTableModel) table.getModel();
        List<SpaceShip> spaceships= dao.ListItems();
        Object[] obj = new Object[8];
        for(int i=0; i<spaceships.size();i++){
            obj[0] = spaceships.get(i).getId();
            obj[1] = spaceships.get(i).getName();
            obj[2] = spaceships.get(i).getType();
            obj[3] = spaceships.get(i).getThrust();
            obj[4] = spaceships.get(i).getWeight();
            obj[5] = spaceships.get(i).getUse();
            obj[6] = spaceships.get(i).getCountry();
            obj[7] = spaceships.get(i).getDate();
            model.addRow(obj);
        }
        
        view.table.setModel(model);
    }
    
    public void listItems(JTable table, String sql, String query1){
        
        model=(DefaultTableModel) table.getModel();
        List<SpaceShip> spaceships= dao.ListItems(sql, query1);
        Object[] obj = new Object[8];
        for(int i=0; i<spaceships.size();i++){
            obj[0] = spaceships.get(i).getId();
            obj[1] = spaceships.get(i).getName();
            obj[2] = spaceships.get(i).getType();
            obj[3] = spaceships.get(i).getThrust();
            obj[4] = spaceships.get(i).getWeight();
            obj[5] = spaceships.get(i).getUse();
            obj[6] = spaceships.get(i).getCountry();
            obj[7] = spaceships.get(i).getDate();
            model.addRow(obj);
        }
        
        view.table.setModel(model);
    }
    public void listItems(JTable table, String sql, String query1, String query2){
        
        model=(DefaultTableModel) table.getModel();
        List<SpaceShip> spaceships= dao.ListItems(sql, query1, query2);
        Object[] obj = new Object[8];
        for(int i=0; i<spaceships.size();i++){
            obj[0] = spaceships.get(i).getId();
            obj[1] = spaceships.get(i).getName();
            obj[2] = spaceships.get(i).getType();
            obj[3] = spaceships.get(i).getThrust();
            obj[4] = spaceships.get(i).getWeight();
            obj[5] = spaceships.get(i).getUse();
            obj[6] = spaceships.get(i).getCountry();
            obj[7] = spaceships.get(i).getDate();
            model.addRow(obj);
        }
        
        view.table.setModel(model);
    }
    public void listItems(JTable table, String sql, String query1, String query2, String query3){
        
        model=(DefaultTableModel) table.getModel();
        List<SpaceShip> spaceships= dao.ListItems(sql, query1, query2, query3);
        Object[] obj = new Object[8];
        for(int i=0; i<spaceships.size();i++){
            obj[0] = spaceships.get(i).getId();
            obj[1] = spaceships.get(i).getName();
            obj[2] = spaceships.get(i).getType();
            obj[3] = spaceships.get(i).getThrust();
            obj[4] = spaceships.get(i).getWeight();
            obj[5] = spaceships.get(i).getUse();
            obj[6] = spaceships.get(i).getCountry();
            obj[7] = spaceships.get(i).getDate();
            model.addRow(obj);
        }
        
        view.table.setModel(model);
    }
}
