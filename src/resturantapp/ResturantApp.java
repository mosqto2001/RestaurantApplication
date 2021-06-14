/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantapp;

import com.sun.jdi.connect.spi.Connection;
import database.MenuDB;
import goods.Menu;
import java.util.List;

/**
 *
 * @author windows
 */
public class ResturantApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuPage menu = new MenuPage();
        menu.setVisible(true);
    }
    
}
